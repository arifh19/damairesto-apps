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
public class Orders {
    private int no;
    private String kode_hidangan;
    private String food;
    private int quantity;
    private double price;
    private String name;
    private int nomor_meja;
    private int informasi;
    private String date;

    public Orders(int nomor_meja,String date, String name, double price ) {
        this.price = price;
        this.name = name;
        this.nomor_meja = nomor_meja;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Orders(int nomor_meja, String name, int quantity, int informasi, String date) {
        this.quantity = quantity;
        this.informasi = informasi;
        this.name = name;
        this.nomor_meja = nomor_meja;
        this.date=date;
    }
    
    public int getInformasi() {
        return informasi;
    }

    public void setInformasi(int informasi) {
        this.informasi = informasi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNomor_meja() {
        return nomor_meja;
    }

    public void setNomor_meja(int nomor_meja) {
        this.nomor_meja = nomor_meja;
    }
    
    
    public Orders(int no, String kode_hidangan, String food, int quantity, double price) {
	this.no = no;
        this.kode_hidangan = kode_hidangan;
	this.food = food;
	this.quantity = quantity;
        this.price = price;
    }    
    public Orders(String kode_hidangan, int nomor_meja, String name, int quantity, int informasi) {
        this.kode_hidangan = kode_hidangan;
        this.nomor_meja=nomor_meja;
	this.quantity = quantity;
        this.name = name;
        this.informasi = informasi;
        
    }  

    public Orders(String kode_hidangan, String food, int quantity, double price, String name, int nomor_meja, int informasi) {
        this.kode_hidangan = kode_hidangan;
        this.food = food;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
        this.nomor_meja = nomor_meja;
        this.informasi = informasi;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getKode_hidangan() {
        return kode_hidangan;
    }

    public void setKode_hidangan(String kode_hidangan) {
        this.kode_hidangan = kode_hidangan;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
