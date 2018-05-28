/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.UserModel;
import object.User;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtUser;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Label lblCloseLogin;
    @FXML
    private Label statustext;
   
    
   
     
    @FXML
    public void Login(ActionEvent event) throws IOException {
      // 
      if(txtUser.getText().isEmpty()||txtPassword.getText().isEmpty()||txtPassword.getText().length()<8||txtUser.getText().length()<5){
          Alert alert = new Alert(Alert.AlertType.WARNING);
          alert.setTitle("Error");
          alert.setHeaderText("Username atau password salah");
          alert.showAndWait();
      }
      else{
          UserModel usermodel = new UserModel();
          usermodel.getLogin(txtUser.getText(), txtPassword.getText(), event);
      }
      
      
              
       /*statustext.setText("akun atau sandi salah");
       int loggedIn_user_id = userModel.getValidLogin(txtUser.getText(), txtPassword.getText());
       User loggedIn_user = userModel.getUser(Integer.toString(loggedIn_user_id));
       if (loggedIn_user_id != 0 && !loggedIn_user.getStatus().equals("pelanggan")) {
          statustext.setText("Login Sukses");
            //agar jendela login tertutup setelah berhasil login
          ((Node) (event.getSource())).getScene().getWindow().hide();

            //memanggil jendela menu admins
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/admin.fxml"));
            loader.load();
            //MenuController aController = loader.getController();
           // aController.setUserName(loggedIn_user);
            Parent parent = loader.getRoot();
           // aController.btnHomeOnClick(event);
            Stage primaryStage = new Stage();
            Scene scene = new Scene(parent);
            primaryStage.initStyle(StageStyle.UNDECORATED);
            primaryStage.setScene(scene);
            //primaryStage.setMaximized(true);
            //primaryStage.setTitle("Menu Admin");
            primaryStage.show();
            statustext.setText("akun atau sandi salah");
//        } else {
            statustext.setText("akun atau sandi salah");
        }*/
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    } 

    @FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) lblCloseLogin.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
}