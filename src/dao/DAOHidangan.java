/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import object.Hidangans;
import object.Orders;

/**
 *
 * @author Yuuki
 */
public interface DAOHidangan {
      public void insert(Hidangans b);
    
//    public Orders get(String Orders);
//    
     // public void getByKode(String b);
//
      public void update(Hidangans b);
//
//    public void delete(String depositId);
//
      public List<Hidangans> getAll();
      
     public Hidangans get(String kode_hidangan);
//        
//    public List<Orders> getCari(String noMeja);
//    
//    public User getUser(Orders b);
    
}
