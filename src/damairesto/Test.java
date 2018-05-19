/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damairesto;

import dao.Rest.DAORestUser;
import dao.implementUser;
import object.User;

/**
 *
 * @author Yuuki
 */
public class Test {
    public static void main(String[] args) {
        implementUser dao = new DAORestUser();
        User m = (User) dao.getAll();
            System.out.println("Coba : "+m.getName()+" Coba : "+m.getStatus());
        }
    }
