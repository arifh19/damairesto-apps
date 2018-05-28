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
public class Finance {
    private String date;
    private double earning;
    private String information;
    private String nama_pelanggan;
    private String operator_name;
    private int table_number;

    public Finance(double earning) {
        this.earning = earning;
    }

    public Finance(String nama_pelanggan, int table_number, String date, double earning, String information, String operator_name) {
        this.date = date;
        this.earning = earning;
        this.information = information;
        this.nama_pelanggan = nama_pelanggan;
        this.operator_name = operator_name;
        this.table_number = table_number;
    }
    public Finance(int table_number, String date, double earning, String information, String operator_name) {
        this.date = date;
        this.earning = earning;
        this.information = information;
        this.nama_pelanggan = nama_pelanggan;
        this.operator_name = operator_name;
        this.table_number = table_number;
    }

    public int getTable_number() {
        return table_number;
    }

    public void setTable_number(int table_number) {
        this.table_number = table_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getNama_pelanggan() {
        return nama_pelanggan;
    }

    public void setNama_pelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getOperator_name() {
        return operator_name;
    }

    public void setOperator_name(String operator_name) {
        this.operator_name = operator_name;
    }
    
    
    
}
