/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.DAOAntrian;
import dao.DAOHidangan;
import dao.DAOPesanan;
import dao.DAOUser;
import dao.Rest.DAORestAntrian;
import dao.Rest.DAORestHidangan;
import dao.Rest.DAORestPesanan;
import dao.Rest.DAORestUser;

/**
 *
 * @author fachrul
 */
public class RESTDAOFactory extends DAOFactory{
    public DAOUser getUser() {
        return new DAORestUser();
    }
    public DAOAntrian getAntrian() {
        return new DAORestAntrian();
    }
    
   /* public implementIuran getIuran() {
        return new DAORestIuran();
    }
    
    public implementDeposit getDeposit() {
        return new DAORestDeposit();
    }
    
    public implementIuranUser getIuranUser() {
        return new DAORestIuranUser();
    }
    
    public implementJenisIuran getJenisIuran(){
        return new DAORestJenisIuran();
    }
    
    public implementKategoriIuran getKategoriIuran(){
        return new DAORestKategoriIuran();
    }
    
    public implementPengeluaran getPengeluaran(){
        return new DAORestPengeluaran();
    }
    
    public implementPengeluaranJenis getPengeluaranJenis(){
        return new DAORestPengeluaranJenis();
    }
    
    public implementPengeluaranKategori getPengeluaranKategori(){
        return new DAORestPengeluaranKategori();
    }
    
    public implementPengeluaranPerubahan getPengeluaranPerubahan(){
        return new DAORestPengeluaranPerubahan();
    }
    */
    public DAOPesanan getPesanan(){
        return new DAORestPesanan();
    }
    
    public DAOHidangan getHidangan(){
        return new DAORestHidangan();
    }
}
