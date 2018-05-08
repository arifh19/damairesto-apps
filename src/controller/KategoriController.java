/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import damairesto.DamaiResto;
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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class KategoriController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private MenuController MainApp;
    @FXML
    private AnchorPane v_breakfast;
    
    @FXML
    private AnchorPane v_appetizer, v_maincourse, v_dessert, v_beverages;
    @FXML
    private JFXButton l_breakfast, l_appetizer, l_maincourse, l_dessert,l_beverages;
    @FXML
    private JFXButton lemonadebtn;
    @FXML
    private JFXButton specialitybtn;
    @FXML
    private JFXButton peachbtn;
    @FXML
    private JFXButton cocktailbtn;
    @FXML
    private JFXButton machiantobtn;
    @FXML
    private JFXButton matchabtn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setKategori(int event){
        if(event ==1){
            l_breakfast.setTextFill(Paint.valueOf("#ffffff"));
            v_breakfast.setVisible(true);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(false);
            v_beverages.setVisible(false);
        }else if(event ==2){
            l_appetizer.setTextFill(Paint.valueOf("#ffffff"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(true);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(false);
            v_beverages.setVisible(false);
        }else if(event ==3){
            l_maincourse.setTextFill(Paint.valueOf("#ffffff"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(true);
            v_dessert.setVisible(false);
            v_beverages.setVisible(false);
        }else if(event ==4){
            l_dessert.setTextFill(Paint.valueOf("#ffffff"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(true);
            v_beverages.setVisible(false);
        }else{
            l_beverages.setTextFill(Paint.valueOf("#ffffff"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(false);
            v_beverages.setVisible(true);
        }
    }
    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getTarget() == l_breakfast) {
            l_breakfast.setTextFill(Paint.valueOf("#ffffff"));
            l_appetizer.setTextFill(Paint.valueOf("#b07e6a"));
            l_maincourse.setTextFill(Paint.valueOf("#b07e6a"));
            l_dessert.setTextFill(Paint.valueOf("#b07e6a"));
            l_beverages.setTextFill(Paint.valueOf("#b07e6a"));
            v_breakfast.setVisible(true);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(false);
            v_beverages.setVisible(false);
        } else if (event.getTarget() == l_appetizer) {
            l_breakfast.setTextFill(Paint.valueOf("#b07e6a"));
            l_appetizer.setTextFill(Paint.valueOf("#ffffff"));
            l_maincourse.setTextFill(Paint.valueOf("#b07e6a"));
            l_dessert.setTextFill(Paint.valueOf("#b07e6a"));
            l_beverages.setTextFill(Paint.valueOf("#b07e6a"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(true);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(false);
            v_beverages.setVisible(false);
        } else if (event.getTarget() == l_maincourse) {
            l_breakfast.setTextFill(Paint.valueOf("#b07e6a"));
            l_appetizer.setTextFill(Paint.valueOf("#b07e6a"));
            l_maincourse.setTextFill(Paint.valueOf("#ffffff"));
            l_dessert.setTextFill(Paint.valueOf("#b07e6a"));
            l_beverages.setTextFill(Paint.valueOf("#b07e6a"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(true);
            v_dessert.setVisible(false);
            v_beverages.setVisible(false);
        } else if (event.getTarget() == l_dessert) {
            l_breakfast.setTextFill(Paint.valueOf("#b07e6a"));
            l_appetizer.setTextFill(Paint.valueOf("#b07e6a"));
            l_maincourse.setTextFill(Paint.valueOf("#b07e6a"));
            l_dessert.setTextFill(Paint.valueOf("#ffffff"));
            l_beverages.setTextFill(Paint.valueOf("#b07e6a"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(true);
            v_beverages.setVisible(false);
        } else {
            l_breakfast.setTextFill(Paint.valueOf("#b07e6a"));
            l_appetizer.setTextFill(Paint.valueOf("#b07e6a"));
            l_maincourse.setTextFill(Paint.valueOf("#b07e6a"));
            l_dessert.setTextFill(Paint.valueOf("#b07e6a"));
            l_beverages.setTextFill(Paint.valueOf("#ffffff"));
            v_breakfast.setVisible(false);
            v_appetizer.setVisible(false);
            v_maincourse.setVisible(false);
            v_dessert.setVisible(false);
            v_beverages.setVisible(true);
        }
    }
    
    public void setMainApp(MenuController mainApp) {
        this.MainApp = mainApp;
        // Add observable list data to the table
    }

    @FXML
    public void checkOut(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/checkout.fxml"));
            Parent root1 = (Parent) fxmlLoader.load(); 
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));  
            stage.show();
            stage1.hide();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    @FXML
    private void backButtonAction(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/menu.fxml"));
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
   private void deskripsiBeveragesView(ActionEvent event){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dBeverages/BeveragesView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));  
            stage.show();
            BeveragesViewController controller = fxmlLoader.getController();
            getViewBeverages(event, controller);
            stage1.hide();  
       }catch(IOException ex){
           ex.printStackTrace();
       }
   }
   
   private void getViewBeverages(ActionEvent event,BeveragesViewController controller){
        if (event.getTarget() == lemonadebtn) {
            controller.setView(1);
        }else if (event.getTarget() == specialitybtn){
            controller.setView(6);
        }else if (event.getTarget() == peachbtn){
            controller.setView(2);
        }else if (event.getTarget() == cocktailbtn){
            controller.setView(3);
        }else if (event.getTarget() == machiantobtn){
            controller.setView(4);
        }else if (event.getTarget() == matchabtn){
            controller.setView(5);
        }else{
            
        }
   }
 
}
