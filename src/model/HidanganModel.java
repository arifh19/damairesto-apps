/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOHidangan;
import dao.DAOPesanan;
import factory.DAOFactory;
import factory.RESTDAOFactory;
import java.util.List;
import object.Hidangans;
import object.Orders;

/**
 *
 * @author Yuuki
 */
public class HidanganModel implements DAOHidangan {
    RESTDAOFactory restFactory;
    DAOHidangan Daohidangan;
    List<Hidangans> listHidangan;
    List<Hidangans> listFoodCode;
    
    public HidanganModel() {
        restFactory = (RESTDAOFactory) DAOFactory.getFactory(DAOFactory.REST);
        Daohidangan = restFactory.getHidangan();
        listHidangan = Daohidangan.getAll();
    }
    
    @Override
    public void insert(Hidangans b) {
        Daohidangan.insert(b);
    }

    @Override
    public List<Hidangans> getAll() {
        return listHidangan;
    }
    @Override
    public Hidangans get(String kode_hidangan) {
        return Daohidangan.get(kode_hidangan);
    }

    @Override
    public void update(Hidangans b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
