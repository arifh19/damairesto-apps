/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import object.Finance;
import object.Hidangans;

/**
 *
 * @author Yuuki
 */
public interface DAOFinance {
    public void insert(Finance b);
    public void update(Finance b);
    public List<Finance> getAll();
    public Finance get(String operatorname);
    public double earnings();
}
