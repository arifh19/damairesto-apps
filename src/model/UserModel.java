/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import object.User;
import dao.implementUser;
import factory.DAOFactory;
import factory.RESTDAOFactory;
import java.util.List;

/**
 *
 * @author Yuuki
 */
public class UserModel implements implementUser{

    RESTDAOFactory restFactory;
    implementUser DAOUser;
    List<User> listUser;

    public UserModel() {
         restFactory = (RESTDAOFactory) DAOFactory.getFactory(DAOFactory.REST);
         DAOUser = restFactory.getUser();
         listUser = DAOUser.getAll(); 
    }
    
    @Override
    public int insert(User b) {
        return DAOUser.insert(b);
    }

    @Override
    public User getUser(String user_id) {
        return DAOUser.getUser(user_id);
    }

    @Override
    public void update(User b) {
        DAOUser.update(b);
    }

    @Override
    public void delete(String user_id) {
        DAOUser.delete(user_id);
    }

    @Override
    public List<User> getAll() {
        return listUser;
    }

    @Override
    public List<User> getCari(String displayname) {
        return DAOUser.getCari(displayname);
    }

    @Override
    public int getCount() {
        return DAOUser.getCount();
    }

    @Override
    public int getValidLogin(String username, String password) {
        return DAOUser.getValidLogin(username, password);
    }
    
}
