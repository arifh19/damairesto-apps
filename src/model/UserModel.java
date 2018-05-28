/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOHidangan;
import dao.DAOPesanan;
import dao.DAOUser;
import factory.DAOFactory;
import factory.RESTDAOFactory;
import java.util.List;
import javafx.event.ActionEvent;
import object.Hidangans;
import object.Orders;
import object.User;

/**
 *
 * @author Yuuki
 */
public class UserModel implements DAOUser {
    RESTDAOFactory restFactory;
    DAOUser Daouser;
    List<User> listUser;
    
    public UserModel() {
        restFactory = (RESTDAOFactory) DAOFactory.getFactory(DAOFactory.REST);
        Daouser = restFactory.getUser();
        listUser = Daouser.getAll();
    }
    
    @Override
    public void insert(User b) {
        Daouser.insert(b);
    }

    @Override
    public List<User> getAll() {
        return listUser;
    }
    @Override
    public User get(String username) {
        return Daouser.get(username);
    }
    
    @Override
    public void getLogin(String username, String password, ActionEvent event) {
        Daouser.getLogin(username, password, event);
    }

//    @Override
//    public void update(Hidangans b) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void delete(String user_id) {
        Daouser.delete(user_id);
    }
    
    @Override
    public void update(User b) {
        Daouser.update(b);
    }
}
