/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOPesanan;
import factory.DAOFactory;
import factory.RESTDAOFactory;
import java.util.List;
import object.Orders;

/**
 *
 * @author Yuuki
 */
public class PesananModel implements DAOPesanan {
    
    RESTDAOFactory restFactory;
    DAOPesanan DaoPesanan;
    List<Orders> listPesanan;
    public PesananModel() {
        restFactory = (RESTDAOFactory) DAOFactory.getFactory(DAOFactory.REST);
        DaoPesanan = restFactory.getPesanan();
        listPesanan = DaoPesanan.getAll();
    }
    
    @Override
    public void insert(Orders b) {
        DaoPesanan.insert(b);
    }

    @Override
    public Orders getByKode(Orders b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Orders> getAll() {
        return listPesanan;
    }
    
}
