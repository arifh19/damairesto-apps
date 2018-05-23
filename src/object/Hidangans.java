/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Yuuki
 */
public class Hidangans {
    private String kode_hidangan;
    private String nama_hidangan;
    private String deskripsi;
    private int stok;
    private double harga;
    private int waktu;

    public Hidangans(String kode_hidangan, String nama_hidangan, String deskripsi, int stok, double harga, int waktu) {
        this.kode_hidangan = kode_hidangan;
        this.nama_hidangan = nama_hidangan;
        this.deskripsi = deskripsi;
        this.stok = stok;
        this.harga = harga;
        this.waktu = waktu;
    }

    public Hidangans(int stok, double harga) {
        this.stok = stok;
        this.harga = harga;
    }

    public Hidangans(int stok, double harga, int waktu) {
        this.stok = stok;
        this.harga = harga;
        this.waktu = waktu;
    }

    public String getKode_hidangan() {
        return kode_hidangan;
    }

    public void setKode_hidangan(String kode_hidangan) {
        this.kode_hidangan = kode_hidangan;
    }

    public String getNama_hidangan() {
        return nama_hidangan;
    }

    public void setNama_hidangan(String nama_hidangan) {
        this.nama_hidangan = nama_hidangan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getWaktu() {
        return waktu;
    }

    public void setWaktu(int waktu) {
        this.waktu = waktu;
    }
    
    
    
}
