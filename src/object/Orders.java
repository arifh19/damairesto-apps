/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import javafx.beans.property.*;

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
    
    
    public Orders(int no, String kode_hidangan, String food, int quantity, double price) {
	this.no = no;
        this.kode_hidangan = kode_hidangan;
	this.food = food;
	this.quantity = quantity;
        this.price = price;
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
