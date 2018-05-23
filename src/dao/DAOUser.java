/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import object.Hidangans;
import object.Orders;
import object.User;

/**
 *
 * @author Yuuki
 */
public interface DAOUser {
      public void insert(User b);
    
//    public Orders get(String Orders);
//    
     // public void getByKode(String b);
//
      public void update(User b);
//
//    public void delete(String depositId);
//
      public List<User> getAll();
      
     public User get(String username);
     public void delete(String user_id);
//        
//    public List<Orders> getCari(String noMeja);
//    
//    public User getUser(Orders b);
    
}
