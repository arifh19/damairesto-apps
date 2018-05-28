/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Rest;

import dao.DAOHidangan;
import static dao.Rest.DAORestPesanan.alamat;
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
import object.Hidangans;
import object.Orders;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Yuuki
 */
public class DAORestHidangan implements DAOHidangan {
    private List<Hidangans> listHidangan;

    public static String alamat = "http://10.33.109.15:5000/api/v1/hidangan";
    
    public DAORestHidangan() {
        populateHidangan();
    }
    
    public void populateHidangan() {
        listHidangan = new ArrayList<>();
        try {
            URL url = new URL(alamat);
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
            listHidangan.clear();
            for (int i = 0; i < json.size(); i++) {
                JSONObject jo = (JSONObject) jp.parse(json.get(i).toString());
                listHidangan.add(new Hidangans(jo.get("kode_hidangan").toString(),
                        jo.get("nama_hidangan").toString(),
                        jo.get("deskripsi").toString(),
                        Integer.parseInt(jo.get("stok").toString()),
                        Double.parseDouble(jo.get("harga").toString()),
                        Integer.parseInt(jo.get("waktu").toString())));

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
    public void insert(Hidangans b) {
        try {
            URL url = new URL(alamat);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String urlParameters = "kode_hidangan=" + b.getKode_hidangan()
                    + "&nama_hidangan=" + b.getNama_hidangan()
                    + "&deskripsi=" + b.getDeskripsi()
                    + "&stok=" + b.getStok()
                    + "&harga=" + b.getHarga()
                    + "&waktu=" + b.getWaktu();
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

            //ini parsing data output menggunakan jsoup, diambil id nya
//            Document d = Jsoup.parse(response);
//            Elements tables = d.select("table > tbody > tr > td");
//            Element e = tables.first();
//            int id = Integer.valueOf(e.text());
//            System.out.println("Added id :"+id);
//            conn.disconnect();
            //populatePesanan();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Hidangans b) {
        try {
            URL url = new URL("http://10.33.109.15:5000/api/v1/hidangan/"+b.getKode_hidangan());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Accept", "application/json");
            //conn.addRequestProperty("Authorization", LoginDAOREST.user);
            String input = "{"
                    + "\"kode_hidangan\":\"" + b.getKode_hidangan()
                    + "\",\"nama_hidangan\":\"" + b.getNama_hidangan()
                    + "\",\"deskripsi\":\"" + b.getDeskripsi()
                    + "\",\"stok\":\"" + b.getStok()
                    + "\",\"harga\":\"" + b.getHarga()
                    + "\",\"waktu\":\"" + b.getWaktu()
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
            populateHidangan();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Hidangans> getAll() {
        populateHidangan();
        return listHidangan;
    }
    
    @Override
    public Hidangans get(String kode_hidangan) {
        populateHidangan();
        Hidangans hidangan = null;
        for (Hidangans _hidangan : listHidangan) {
            if (String.valueOf(_hidangan.getKode_hidangan()).equals(kode_hidangan)) {
                hidangan = _hidangan;
            }else{
                
            }
        }
        return hidangan;
    }
    @Override
    public void delete(String kode_hidangan) {
        try {
            URL url = new URL("http://10.33.109.15:5000/api/v1/hidangan/"+kode_hidangan);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("DELETE");
            conn.setRequestProperty("Content-Type", "application/json");

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
            populateHidangan();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
