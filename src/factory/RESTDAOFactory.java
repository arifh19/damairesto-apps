/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.DAOAntrian;
import dao.DAOFinance;
import dao.DAOHidangan;
import dao.DAOPesanan;
import dao.DAOUser;
import dao.Rest.DAORestAntrian;
import dao.Rest.DAORestFinance;
import dao.Rest.DAORestHidangan;
import dao.Rest.DAORestPesanan;
import dao.Rest.DAORestUser;

/**
 *
 * @author yuuki
 */
public class RESTDAOFactory extends DAOFactory{
    public DAOUser getUser() {
        return new DAORestUser();
    }
    public DAOAntrian getAntrian() {
        return new DAORestAntrian();
    }
    
    public DAOPesanan getPesanan(){
        return new DAORestPesanan();
    }
    
    public DAOHidangan getHidangan(){
        return new DAORestHidangan();
    }
    
    public DAOFinance getFinance(){
        return new DAORestFinance();
    }
}
