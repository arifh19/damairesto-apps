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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class KategoriControllerx implements Initializable {

    @FXML
    private JFXButton l_breakfast;
    @FXML
    private JFXButton l_appetizer;
    @FXML
    private JFXButton l_maincourse;
    @FXML
    private JFXButton l_dessert;
    @FXML
    private JFXButton l_beverages;
    @FXML
    private ImageView btnBack;
    @FXML
    private StackPane holderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

 
    public void breakfast() throws IOException {
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("/view/kategori/breakfast.fxml"));
       loader.load();
       AnchorPane acBeranda=loader.getRoot();
       holderPane.getChildren().clear();
       holderPane.getChildren().add(acBeranda);
    }

   
    private void appetizer() throws IOException {
       FXMLLoader loader = new FXMLLoader();
       loader.setLocation(getClass().getResource("/view/kategori/appetizer.fxml"));
       loader.load();
       AnchorPane acBeranda=loader.getRoot();
       holderPane.getChildren().clear();
       holderPane.getChildren().add(acBeranda);
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
    }

    @FXML
    private void backButtonAction(MouseEvent event) {
    }
    
}
