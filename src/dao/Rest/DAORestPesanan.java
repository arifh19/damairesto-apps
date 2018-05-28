/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.Rest;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.List;
import object.Orders;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import dao.DAOPesanan;
import java.io.Reader;
import java.util.ArrayList;
import object.Hidangans;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Yuuki
 */
public class DAORestPesanan implements DAOPesanan {
    private List<Orders> listPesanan;
    private List<Orders> listSeluruhPesanan;
    public static String alamat = "http://10.33.109.15:5000/api/v1/pesanan";
    
    public DAORestPesanan() {
        populatePesanan();
        populateSeluruhPesanan();
    }
    @Override
    public void insert(Orders b) {
        try {
            URL url = new URL(alamat);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");

            String urlParameters = "kode_hidangan=" + b.getKode_hidangan()
                    + "&nomor_meja=" + b.getNomor_meja()
                    + "&nama_pelanggan=" + b.getName()
                    + "&kuantitas=" + b.getQuantity()
                    + "&informasi=" + b.getInformasi();
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
    public void populatePesanan() {
        listPesanan = new ArrayList<>();
        try {
            URL url = new URL("http://10.33.109.15:5000/api/v1/restmng");
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
            listPesanan.clear();
            for (int i = 0; i < json.size(); i++) {
                JSONObject jo = (JSONObject) jp.parse(json.get(i).toString());
                //System.out.println(jo.get("iuran_nama").toString());
                listPesanan.add(new Orders(Integer.valueOf(jo.get("nomor_meja").toString()),
                        jo.get("Tanggal").toString(),
                        jo.get("nama_pelanggan").toString(),
                        Double.valueOf(jo.get("total_harga").toString())));

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
    public void populateSeluruhPesanan() {
        listSeluruhPesanan = new ArrayList<>();
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
            listSeluruhPesanan.clear();
            for (int i = 0; i < json.size(); i++) {
                JSONObject jo = (JSONObject) jp.parse(json.get(i).toString());
                //System.out.println(jo.get("iuran_nama").toString());
                listSeluruhPesanan.add(new Orders(jo.get("kode_hidangan").toString(),
                        Integer.valueOf(jo.get("nomor_meja").toString()),
                        jo.get("nama_pelanggan").toString(),
                        Integer.valueOf(jo.get("kuantitas").toString()),
                        Integer.valueOf(jo.get("informasi").toString())));

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
    public Orders getByKode(Orders b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Override
    public List<Orders> getAll() {
        populatePesanan();
        return listPesanan;
    }
    @Override
    public List<Orders> getAllPesanan() {
        populateSeluruhPesanan();
        return listSeluruhPesanan;
    }
    @Override
    public Orders get(int table_number) {
        populatePesanan();
        Orders order = null;
        for (Orders _order : listPesanan) {
            if (String.valueOf(_order.getNomor_meja()).equals(Integer.toString(table_number))) {
                order = _order;
            }else{
                System.out.println("Error");
            }
        }
        return order;
    }
    
    @Override
    public int getHitung(int table_number) {
        populateSeluruhPesanan();
        int hitung = 0;
        for (Orders _order : listSeluruhPesanan) {
            if (_order.getNomor_meja()==table_number) {
                hitung++;
            }else{
                System.out.println("Error");
            }
        }
        return hitung;
    }
    
    @Override
    public void delete(int table_number) {
        try {
            URL url = new URL("http://10.33.109.15:5000/api/v1/pesanan/"+table_number);
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
            populatePesanan();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
