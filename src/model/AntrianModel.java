/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOAntrian;
import dao.DAOHidangan;
import factory.DAOFactory;
import factory.RESTDAOFactory;
import java.util.List;
import object.Antrian;
import object.Hidangans;

/**
 *
 * @author Yuuki
 */
public class AntrianModel implements DAOAntrian {
    RESTDAOFactory restFactory;
    DAOAntrian Daoantrian;
    List<Antrian> listAntrian;
    
    public AntrianModel() {
        restFactory = (RESTDAOFactory) DAOFactory.getFactory(DAOFactory.REST);
        Daoantrian = restFactory.getAntrian();
        listAntrian = Daoantrian.getAll();
    }
    @Override
    public List<Antrian> getAll() {
        return listAntrian;
    }
    
}
