/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Rest;

import dao.DAOFinance;
import static dao.Rest.DAORestHidangan.alamat;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import object.Finance;
import object.Hidangans;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Yuuki
 */
public class DAORestFinance implements DAOFinance{
    
    private List<Finance> listFinance;
    private final static String alamat = "http://10.33.109.15:5000/api/v1/statistika";
    
    @Override
    public void insert(Finance b) {
        try {
            URL url = new URL(alamat);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String urlParameters = "nama_pelanggan=" + b.getNama_pelanggan()
                    + "&table_number=" + b.getTable_number()
                    + "&date=" + b.getDate()
                    + "&earning=" + b.getEarning()
                    + "&information=" + b.getInformation()
                    + "&operatorname=" + b.getOperator_name();
            byte[] postData = urlParameters.getBytes(StandardCharsets.UTF_8);
            int postDataLength = postData.length;
            conn.setDoOutput(true);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("charset", "utf-8");
            conn.setRequestProperty("Content-Length", Integer.toString(postDataLength));
            conn.setUseCaches(false);
            try (DataOutputStream wr = new DataOutputStream(conn.getOutputStream())) {
                wr.write(postData);
            }

            if (conn.getResponseCode() != HttpURLConnection.HTTP_CREATED) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }

            //ini ambil output data lalu dimasukkan ke string response
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String output;
            String response = null;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
                response = response + output;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Finance b) {
        try {
            URL url = new URL(alamat+"/"+b.getOperator_name());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            //conn.addRequestProperty("Authorization", LoginDAOREST.user);
            String input = "{"
                    + "\"nama_pelanggan\":\"" + b.getNama_pelanggan()
                    + "\"table_number\":\"" + b.getTable_number()
                    + "\",\"date\":\"" + b.getDate()
                    + "\",\"earning\":\"" + b.getEarning()
                    + "\",\"information\":\"" + b.getInformation()
                    + "\",\"operatorname\":\"" + b.getOperator_name()
                    + "\"}";
            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conn.disconnect();
            populateFinance();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void populateFinance() {
        listFinance = new ArrayList<>();
        try {
            URL url = new URL("http://10.33.109.15:5000/api/v1/dailyreport");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            //conn.addRequestProperty("Authorization", LoginDAOREST.user);
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            char[] buffer = new char[1024];
            StringBuilder sb = new StringBuilder();
            Reader in = new InputStreamReader(conn.getInputStream());
            while (true) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0) {
                    break;
                }
                sb.append(buffer, 0, rsz);
            }
            JSONParser jp = new JSONParser();
            JSONArray json = (JSONArray) jp.parse(sb.toString());
            listFinance.clear();
            for (int i = 0; i < json.size(); i++) {
                JSONObject jo = (JSONObject) jp.parse(json.get(i).toString());
                listFinance.add(new Finance(Integer.parseInt(jo.get("table_number").toString()),
                        jo.get("date").toString(),
                        Double.parseDouble(jo.get("earning").toString()),
                        jo.get("information").toString(),
                        jo.get("operatorname").toString()));

            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Finance> getAll() {
        populateFinance();
        return listFinance;
    }
    
    @Override
    public Finance get(String operatorname) {
        populateFinance();
        Finance finance = null;
        for (Finance _finance : listFinance) {
            if (String.valueOf(_finance.getOperator_name()).equals(operatorname)) {
                finance = _finance;
            }else{
                
            }
        }
        return finance;
    }   
   @Override 
   public double earnings() {
        double earn = 0;
        try {
            URL url = new URL("http://10.33.109.15:5000/api/v1/earnings");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            //conn.addRequestProperty("Authorization", LoginDAOREST.user);
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
            }
            char[] buffer = new char[1024];
            StringBuilder sb = new StringBuilder();
            Reader in = new InputStreamReader(conn.getInputStream());
            while (true) {
                int rsz = in.read(buffer, 0, buffer.length);
                if (rsz < 0) {
                    break;
                }
                sb.append(buffer, 0, rsz);
            }
            JSONParser jp = new JSONParser();
            JSONArray json = (JSONArray) jp.parse(sb.toString());
            JSONObject jo = (JSONObject) jp.parse(json.get(0).toString());
            earn = Double.parseDouble(jo.get("earnings").toString());
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return earn;
    } 
}
