/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

/**
 *
 * @author Yuuki
 */
public class User {
    
    private int id;
    private String name;
    private String username;
    private String password;
    private String status;

    public User(int id, String name, String username, String status) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.status = status;
    }

    public User(String name, String username, String password, String status) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.status = status;
    }

    public User(String name, String username, String status) {
        this.name = name;
        this.username = username;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
