/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import java.time.LocalDate;
import javafx.beans.property.SimpleStringProperty;
/**
 *
 * @author Yuuki
 */
public class Users {
    private StringProperty username;
    private StringProperty password;
    private StringProperty name;
    private StringProperty status;
    
    public Users(){
    	this(null,null,null,null);
    }
    
    public Users(String name, String username, String password, String status) {
	this.name = new SimpleStringProperty(name);
	this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
	this.status = new SimpleStringProperty(status);
    }
    
    public Users(String name, String username, String status) {
	this.name = new SimpleStringProperty(name);
	this.username = new SimpleStringProperty(username);
	this.status = new SimpleStringProperty(status);
    }

    public String getUserName(){
	return username.get();
    }

    public void setUserName(String username){
	this.username.set(username);
    }

    public StringProperty UsernameProperty(){
    	return username;
    }

    public String getName(){
	return name.get();
    }

    public void setName(String name){
	this.name.set(name);
    }

    public StringProperty NameProperty(){
	return name;
    }
    
    public String getPassword(){
	return password.get();
    }

    public void setPassword(String password){
	this.password.set(password);
    }

    public StringProperty PasswordProperty(){
	return password;
    }
    
    public String getStatus(){
	return status.get();
    }

    public void setStatus(String status){
	this.status.set(status);
    }

    public StringProperty statusProperty(){
	return status;
    }

}
