/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class CheckoutController implements Initializable {

      @FXML
    private AnchorPane kedua_checkout;
    @FXML
    private AnchorPane pertama_checkout;
    @FXML
    private AnchorPane ketiga_checkout;
      @FXML
    private JFXButton btnStep3;
    @FXML
    private JFXButton btnStep2;
    @FXML
    private JFXButton btnStep1;
    @FXML
    private ImageView checkStep1;
    @FXML
    private ImageView checkStep2;
    @FXML
    private ImageView checkStep3;
    @FXML
    private ImageView checkStep4;
    @FXML
    private JFXButton btnPrev2;
    @FXML
    private JFXButton btnPrev1;
    @FXML
    private JFXTextField txtFirstName;
    @FXML
    private JFXTextField txtLastName;
    @FXML
    private JFXTextField txtTableNumber;
    @FXML
    private JFXTextField txtSetFirstName;
    @FXML
    private JFXTextField txtSetLastName;
    @FXML
    private JFXTextField txtSetTableNumber;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void backButtonAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/kategori.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));
            KategoriController controller = fxmlLoader.getController();
            controller.setKategori(1);
            stage.show();
            stage1.hide();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    @FXML
    private void nextButton(ActionEvent event){
        String firstName = txtSetFirstName.getText();
        String lastName = txtSetLastName.getText();
        String tableNumber = txtSetTableNumber.getText();
         if (event.getTarget() == btnStep1) {
            pertama_checkout.setVisible(false);
            kedua_checkout.setVisible(true);
            ketiga_checkout.setVisible(false);
            checkStep2.setVisible(true);
        } else if (event.getTarget() == btnStep2) {
            pertama_checkout.setVisible(false);
            kedua_checkout.setVisible(false);
            ketiga_checkout.setVisible(true);
            checkStep3.setVisible(true);
            txtFirstName.setText(firstName);
            txtLastName.setText(lastName);
            txtTableNumber.setText(tableNumber);
        } else if (event.getTarget() == btnStep3) {
            pertama_checkout.setVisible(false);
            kedua_checkout.setVisible(false);
            ketiga_checkout.setVisible(false);
            checkStep4.setVisible(true);   
            finalcheckOut(event);
        }else{
            
        }
    }
    
    @FXML
    private void prevButton(ActionEvent event){
         if (event.getTarget() == btnPrev1) {
            pertama_checkout.setVisible(true);
            kedua_checkout.setVisible(false);
            ketiga_checkout.setVisible(false);
            checkStep2.setVisible(false);
        } else if (event.getTarget() == btnPrev2) {
            pertama_checkout.setVisible(false);
            kedua_checkout.setVisible(true);
            ketiga_checkout.setVisible(false);
            checkStep3.setVisible(false);
        }else{
            
        }
    }
    
    private void finalcheckOut(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/waitinglist.fxml"));
            Parent root1 = (Parent) fxmlLoader.load(); 
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));  
            stage.show();
            stage1.hide();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }

    @FXML
    private void backButtonAction(MouseEvent event) {
    }
}
