/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.event.ActionEvent;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class MenuController implements Initializable {

    @FXML
    private ImageView imgAppetizer;
    @FXML
    private Label btnAppetizer;
    @FXML
    private ImageView imgMaincourse;
    @FXML
    private Label btnMaincourse;
    @FXML
    private ImageView imgDessert;
    @FXML
    private Label btnDessert;
    @FXML
    private ImageView imgBeverages;
    @FXML
    private Label btnBeverages;
    @FXML
    private ImageView imgBreakfast;
    @FXML
    private Label btnBreakfast;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    private void handleButtonAction(MouseEvent event) {
     System.exit(0);
    }  
    
    @FXML
    private void ViewKategori(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/kategori.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));  
            stage.show();
            KategoriController controller = fxmlLoader.getController();
            getKategori(event, controller);
            controller.setMainApp(this);
            stage1.hide();         
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    private void getKategori(MouseEvent event,KategoriController controller){
        if (event.getTarget() == btnBreakfast) {
            controller.setKategori(1);
        }else if (event.getTarget() == imgBreakfast){
            controller.setKategori(1);
        }else if (event.getTarget() == btnAppetizer){
            controller.setKategori(2);
        }else if (event.getTarget() == imgAppetizer){
            controller.setKategori(2);
        }else if (event.getTarget() == btnMaincourse){
            controller.setKategori(3);
        }else if (event.getTarget() == imgMaincourse){
            controller.setKategori(3);
        }else if (event.getTarget() == btnDessert){
            controller.setKategori(4);
        }else if (event.getTarget() == imgDessert){
            controller.setKategori(4);
        }else if (event.getTarget() == btnBeverages){
            controller.setKategori(5);
        }else if (event.getTarget() == imgBeverages){
            controller.setKategori(5);
        }else{
            
        }
    }
}

