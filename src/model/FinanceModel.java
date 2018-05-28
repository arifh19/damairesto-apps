/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOFinance;
import dao.DAOHidangan;
import factory.DAOFactory;
import factory.RESTDAOFactory;
import java.util.List;
import object.Finance;
import object.Hidangans;

/**
 *
 * @author Yuuki
 */
public class FinanceModel implements DAOFinance {

    RESTDAOFactory restFactory;
    DAOFinance DAOfinance;
    List<Finance> listFinance;
    
    public FinanceModel() {
        restFactory = (RESTDAOFactory) DAOFactory.getFactory(DAOFactory.REST);
        DAOfinance = restFactory.getFinance();
        listFinance = DAOfinance.getAll();
    }
    
    @Override
    public void insert(Finance b) {
        DAOfinance.insert(b);
    }

    @Override
    public List<Finance> getAll() {
        return listFinance;
    }
    
    @Override
    public Finance get(String operatorname) {
        return DAOfinance.get(operatorname);
    }

    @Override
    public void update(Finance b) {
        DAOfinance.update(b);
    }

    @Override
    public double earnings() {
        return DAOfinance.earnings();
    }
    
}
