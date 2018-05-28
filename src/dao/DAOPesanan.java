/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import object.Orders;

/**
 *
 * @author Yuuki
 */
public interface DAOPesanan {
      public void insert(Orders b);
    
//    public Orders get(String Orders);
//    
      public Orders getByKode(Orders b);
//
//    public void update(Orders b);
//
      public void delete(int table_number);
//
      public List<Orders> getAll();
      public Orders get(int table_number);
      public int getHitung(int table_number);
      
      public List<Orders> getAllPesanan();
//        
//    public List<Orders> getCari(String noMeja);
//    
//    public User getUser(Orders b);
    
}
