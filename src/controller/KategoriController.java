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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
    private AnchorPane v_appetizer;
    @FXML
    private AnchorPane v_maincourse;
    
    @FXML
    private AnchorPane v_dessert, v_beverages;
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
    @FXML
    private JFXButton cajunbtn;
    @FXML
    private JFXButton friedbtn;
    @FXML
    private JFXButton jackbtn;
    @FXML
    private JFXButton roastedbtn;
    @FXML
    private JFXButton potatoesbtn;
    @FXML
    private JFXButton buffalobtn;
    @FXML
    private JFXButton buburbtn;
    @FXML
    private JFXButton miegorengbtn;
    @FXML
    private JFXButton bowlbtn;
    @FXML
    private JFXButton nasigorengbtn;
    @FXML
    private JFXButton sphagettibtn;
    @FXML
    private JFXButton veganbtn;
    @FXML
    private JFXButton chicorybtn;
    @FXML
    private JFXButton salmonbtn;
    @FXML
    private JFXButton panbtn;
    @FXML
    private JFXButton kimchifriedbtn;
    @FXML
    private JFXButton wagyubtn;
    @FXML
    private JFXButton limebtn;
    @FXML
    private JFXButton galletebtn;
    @FXML
    private JFXButton kimchisushibtn;
    @FXML
    private JFXButton bostonbtn;
    @FXML
    private JFXButton cherrybtn;
    @FXML
    private JFXButton bananabtn;
    @FXML
    private JFXButton icecreambtn;
    @FXML
    private JFXButton arumanisbtn;
    @FXML
    private JFXButton bakedbtn;
    @FXML
    private TextField txtb001;
    @FXML
    private Button plusb001;
    @FXML
    private Button minb001;
    @FXML
    private Button plusb002;
    @FXML
    private TextField txtb002;
    @FXML
    private Button minb002;
    @FXML
    private TextField txtb003;
    @FXML
    private Button plusb003;
    @FXML
    private Button minb003;
    @FXML
    private TextField txtb004;
    @FXML
    private Button plusb004;
    @FXML
    private Button minb004;
    
    private int max_stokb001 =5;
    private int max_stokb002 =5;
    private int max_stokb003 =5;
    private int max_stokb004 =5;
    
    private int min_stokb001 =0;
    private int min_stokb002 =0;
    private int min_stokb003 =0;
    private int min_stokb004 =0;
    @FXML
    private TextField txta001;
    @FXML
    private Button plusa001;
    @FXML
    private Button mina001;
    @FXML
    private TextField txta002;
    @FXML
    private Button plusa002;
    @FXML
    private Button mina002;
    @FXML
    private TextField txta003;
    @FXML
    private Button plusa003;
    @FXML
    private Button mina003;
    @FXML
    private Button plusa004;
    @FXML
    private TextField txta004;
    @FXML
    private Button mina004;
    @FXML
    private TextField txta005;
    @FXML
    private Button plusa005;
    @FXML
    private Button mina005;
    @FXML
    private Button plusa006;
    @FXML
    private Button mina006;
    
    private int max_stoka001 =5;
    private int max_stoka002 =5;
    private int max_stoka003 =5;
    private int max_stoka004 =5;
    private int max_stoka005 =5;
    private int max_stoka006 =5;
    
    private int min_stoka001 =0;
    private int min_stoka002 =0;
    private int min_stoka003 =0;
    private int min_stoka004 =0;
    private int min_stoka005 =0;
    private int min_stoka006 =0;
    @FXML
    private TextField txta006;
    @FXML
    private Button plusm001;
    @FXML
    private TextField txtm001;
    @FXML
    private Button minm001;
    @FXML
    private Button plusm002;
    @FXML
    private TextField txtm002;
    @FXML
    private Button minm002;
    @FXML
    private Button plusm003;
    @FXML
    private TextField txtm003;
    @FXML
    private Button minm003;
    @FXML
    private Button plusm004;
    @FXML
    private TextField txtm004;
    @FXML
    private Button minm004;
    @FXML
    private Button minm005;
    @FXML
    private TextField txtm005;
    @FXML
    private Button plusm006;
    @FXML
    private TextField txtm006;
    @FXML
    private Button minm006;
    @FXML
    private TextField txtm007;
    @FXML
    private Button minm007;
    @FXML
    private Button plusm007;
    @FXML
    private Button plusm008;
    @FXML
    private TextField txtm008;
    @FXML
    private Button minm008;
    @FXML
    private Button minm009;
    @FXML
    private Button plusm009;
    @FXML
    private TextField txtm009;
    @FXML
    private Button plusm010;
    @FXML
    private TextField txtm010;
    @FXML
    private Button minm010;
    
    private int max_stokm001 =5;
    private int max_stokm002 =5;
    private int max_stokm003 =5;
    private int max_stokm004 =5;
    private int max_stokm005 =5;
    private int max_stokm006 =5;
    private int max_stokm007 =5;
    private int max_stokm008 =5;
    private int max_stokm009 =5;
    private int max_stokm010 =5;
    
    private int min_stokm001 =0;
    private int min_stokm002 =0;
    private int min_stokm003 =0;
    private int min_stokm004 =0;
    private int min_stokm005 =0;
    private int min_stokm006 =0;
    private int min_stokm007 =0;
    private int min_stokm008 =0;
    private int min_stokm009 =0;
    private int min_stokm010 =0;
    @FXML
    private Button plusm005;
    @FXML
    private Button plusd001;
    @FXML
    private TextField txtd001;
    @FXML
    private Button mind001;
    @FXML
    private Button plusd002;
    @FXML
    private TextField txtd002;
    @FXML
    private Button mind002;
    @FXML
    private Button plusd003;
    @FXML
    private TextField txtd003;
    @FXML
    private Button mind003;
    @FXML
    private Button plusd004;
    @FXML
    private TextField txtd004;
    @FXML
    private Button mind004;
    @FXML
    private Button plusd005;
    @FXML
    private TextField txtd005;
    @FXML
    private Button mind005;
    @FXML
    private Button plusd006;
    @FXML
    private TextField txtd006;
    @FXML
    private Button mind006;
  


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        if(max_stokb001==0){
            plusb001.setDisable(true);
        }else if(max_stokb002==0){
            plusb002.setDisable(true);
        }else if(max_stokb003==0){
            plusb003.setDisable(true);
        }else if(max_stokb004==0){
            plusb004.setDisable(true);
        }else if(max_stoka001==0){
            plusa001.setDisable(true);
        }else if(max_stoka002==0){
            plusa002.setDisable(true);
        }else if(max_stoka003==0){
            plusa003.setDisable(true);
        }else if(max_stoka004==0){
            plusa004.setDisable(true);
        }else if(max_stoka005==0){
            plusa005.setDisable(true);
        }else if(max_stoka006==0){
            plusa006.setDisable(true);
        }
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
   private void deskripsiAppetizerView(ActionEvent event){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dAppetizer/AppetizerView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1)); 
            stage1.close();
            stage.show();
            AppetizerViewController controller = fxmlLoader.getController();
            getViewAppetizer(event, controller);    
       }catch(IOException ex){
           ex.printStackTrace();
       }
   }
   
   
   private void getViewAppetizer(ActionEvent event,AppetizerViewController controller){
        if (event.getTarget() == buffalobtn) {
            controller.setView(1);
        }else if (event.getTarget() == cajunbtn){
            controller.setView(2);
        }else if (event.getTarget() == friedbtn){
            controller.setView(3);
        }else if (event.getTarget() == potatoesbtn){
            controller.setView(4);
        }else if (event.getTarget() == jackbtn){
            controller.setView(5);
        }else if (event.getTarget() == roastedbtn){
            controller.setView(6);
        }else{
            
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
            stage1.close();
            stage.show();
            BeveragesViewController controller = fxmlLoader.getController();
            getViewBeverages(event, controller);    
       }catch(IOException ex){
           ex.printStackTrace();
       }
   }
   
   
   private void getViewBeverages(ActionEvent event,BeveragesViewController controller){
        if (event.getTarget() == lemonadebtn) {
            controller.setView(1);
        }else if (event.getTarget() == peachbtn){
            controller.setView(2);
        }else if (event.getTarget() == cocktailbtn){
            controller.setView(3);
        }else if (event.getTarget() == machiantobtn){
            controller.setView(4);
        }else if (event.getTarget() == matchabtn){
            controller.setView(5);
        }else if (event.getTarget() == specialitybtn){
            controller.setView(6);
        }else{
            
        }
   }
   
   @FXML
   private void deskripsiBreakfastView(ActionEvent event){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dBreakfast/BreakfastView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1)); 
            stage1.close();
            stage.show();
            BreakfastViewController controller = fxmlLoader.getController();
            getViewBreakfast(event, controller);    
       }catch(IOException ex){
           ex.printStackTrace();
       }
   }
   
   
   private void getViewBreakfast(ActionEvent event,BreakfastViewController controller){
        if (event.getTarget() == bowlbtn) {
            controller.setView(1);
        }else if (event.getTarget() == nasigorengbtn){
            controller.setView(2);
        }else if (event.getTarget() == buburbtn){
            controller.setView(3);
        }else if (event.getTarget() == miegorengbtn){
            controller.setView(4);
        }else{
            
        }
   }
   
   @FXML
   private void deskripsiMainCourseView(ActionEvent event){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dMainCourse/MainCourseView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1)); 
            stage1.close();
            stage.show();
            MainCourseViewController controller = fxmlLoader.getController();
            getViewMainCourse(event, controller);    
       }catch(IOException ex){
           ex.printStackTrace();
       }
   }
   
   
   private void getViewMainCourse(ActionEvent event,MainCourseViewController controller){
        if (event.getTarget() == chicorybtn) {
            controller.setView(1);
        }else if (event.getTarget() == kimchifriedbtn){
            controller.setView(2);
        }else if (event.getTarget() == kimchisushibtn){
            controller.setView(3);
        }else if (event.getTarget() == limebtn){
            controller.setView(4);
        }else if (event.getTarget() == salmonbtn){
            controller.setView(5);
        }else if (event.getTarget() == galletebtn){
            controller.setView(6);
        }else if (event.getTarget() == sphagettibtn){
            controller.setView(7);
        }else if (event.getTarget() == veganbtn){
            controller.setView(8);
        }else if (event.getTarget() == panbtn){
            controller.setView(9);
        }else if (event.getTarget() == wagyubtn){
            controller.setView(10);
        }else{
            
        }
   }
   
   @FXML
   private void deskripsiDessertView(ActionEvent event){
       try{
           FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/dDessert/DessertView.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1)); 
            stage1.close();
            stage.show();
            DessertViewController controller = fxmlLoader.getController();
            getViewDessert(event, controller);    
       }catch(IOException ex){
           ex.printStackTrace();
       }
   }
   
   
   private void getViewDessert(ActionEvent event,DessertViewController controller){
        if (event.getTarget() == arumanisbtn) {
            controller.setView(1);
        }else if (event.getTarget() == bakedbtn){
            controller.setView(2);
        }else if (event.getTarget() == bananabtn){
            controller.setView(3);
        }else if (event.getTarget() == bostonbtn){
            controller.setView(4);
        }else if (event.getTarget() == cherrybtn){
            controller.setView(5);
        }else if (event.getTarget() == icecreambtn){
            controller.setView(6);
        }else{
            
        }
   }

    @FXML
    private void plusBtnBreakfast(ActionEvent event) {
        if (event.getTarget() == plusb001) {
            min_stokb001 = min_stokb001+1;
            txtb001.setText(Integer.toString(min_stokb001));
            if(txtb001.getText().equals("0")){
                minb001.setDisable(true);
            }else if(txtb001.getText().equals(Integer.toString(max_stokb001))){
                plusb001.setDisable(true);
                minb001.setDisable(false);
            }else{
                plusb001.setDisable(false);
                minb001.setDisable(false);
            }
        }else if (event.getTarget() == plusb002) {
            min_stokb002 = min_stokb002+1;
            txtb002.setText(Integer.toString(min_stokb002));
            if(txtb002.getText().equals("0")){
                minb002.setDisable(true);
            }else if(txtb002.getText().equals(Integer.toString(max_stokb002))){
                plusb002.setDisable(true);
                minb002.setDisable(false);
            }else{
                plusb002.setDisable(false);
                minb002.setDisable(false);
            }
        }else if (event.getTarget() == plusb003) {
            min_stokb003 = min_stokb003+1;
            txtb003.setText(Integer.toString(min_stokb003));
            if(txtb003.getText().equals("0")){
                minb003.setDisable(true);
            }else if(txtb003.getText().equals(Integer.toString(max_stokb003))){
                plusb003.setDisable(true);
                minb003.setDisable(false);
            }else{
                plusb003.setDisable(false);
                minb003.setDisable(false);
            }
        }else if (event.getTarget() == plusb004) {
            min_stokb004 = min_stokb004+1;
            txtb004.setText(Integer.toString(min_stokb004));
            if(txtb004.getText().equals("0")){
                minb004.setDisable(true);
            }else if(txtb004.getText().equals(Integer.toString(max_stokb004))){
                plusb004.setDisable(true);
                minb004.setDisable(false);
            }else{
                plusb004.setDisable(false);
                minb004.setDisable(false);
            }
        }
    }

    @FXML
    private void minBtnBreakfast(ActionEvent event) {
        if (event.getTarget() == minb001) {
            min_stokb001 = min_stokb001-1;
            txtb001.setText(Integer.toString(min_stokb001));
            if(txtb001.getText().equals("0")){
                minb001.setDisable(true);
            }else if(txtb001.getText().equals(Integer.toString(max_stokb001))){
                plusb001.setDisable(true);
                minb001.setDisable(false);
            }else{
                plusb001.setDisable(false);
                minb001.setDisable(false);
            }
        }else if (event.getTarget() == minb002) {
            min_stokb002 = min_stokb002-1;
            txtb002.setText(Integer.toString(min_stokb002));
            if(txtb002.getText().equals("0")){
                minb002.setDisable(true);
            }else if(txtb002.getText().equals(Integer.toString(max_stokb002))){
                plusb002.setDisable(true);
                minb002.setDisable(false);
            }else{
                plusb002.setDisable(false);
                minb002.setDisable(false);
            }
        }else if (event.getTarget() == minb003) {
            min_stokb003 = min_stokb003-1;
            txtb003.setText(Integer.toString(min_stokb003));
            if(txtb003.getText().equals("0")){
                minb003.setDisable(true);
            }else if(txtb003.getText().equals(Integer.toString(max_stokb003))){
                plusb003.setDisable(true);
                minb003.setDisable(false);
            }else{
                plusb003.setDisable(false);
                minb003.setDisable(false);
            }
        }else if (event.getTarget() == minb004) {
            min_stokb004 = min_stokb004-1;
            txtb004.setText(Integer.toString(min_stokb004));
            if(txtb004.getText().equals("0")){
                minb004.setDisable(true);
            }else if(txtb004.getText().equals(Integer.toString(max_stokb004))){
                plusb004.setDisable(true);
                minb004.setDisable(false);
            }else{
                plusb004.setDisable(false);
                minb004.setDisable(false);
            }
        }
    }

    @FXML
    private void plusBtnAppetizer(ActionEvent event) {
        if (event.getTarget() == plusa001) {
            min_stoka001 = min_stoka001+1;
            txta001.setText(Integer.toString(min_stoka001));
            if(txta001.getText().equals("0")){
                mina001.setDisable(true);
            }else if(txta001.getText().equals(Integer.toString(max_stoka001))){
                plusa001.setDisable(true);
                mina001.setDisable(false);
            }else{
                plusa001.setDisable(false);
                mina001.setDisable(false);
            }
        }else if (event.getTarget() == plusa002) {
            min_stoka002 = min_stoka002+1;
            txta002.setText(Integer.toString(min_stoka002));
            if(txta002.getText().equals("0")){
                mina002.setDisable(true);
            }else if(txta002.getText().equals(Integer.toString(max_stoka002))){
                plusa002.setDisable(true);
                mina002.setDisable(false);
            }else{
                plusa002.setDisable(false);
                mina002.setDisable(false);
            }
        }else if (event.getTarget() == plusa003) {
            min_stoka003 = min_stoka003+1;
            txta003.setText(Integer.toString(min_stoka003));
            if(txta003.getText().equals("0")){
                mina003.setDisable(true);
            }else if(txta003.getText().equals(Integer.toString(max_stoka003))){
                plusa003.setDisable(true);
                mina003.setDisable(false);
            }else{
                plusa003.setDisable(false);
                mina003.setDisable(false);
            }
        }else if (event.getTarget() == plusa004) {
            min_stoka004 = min_stoka004+1;
            txta004.setText(Integer.toString(min_stoka004));
            if(txta004.getText().equals("0")){
                mina004.setDisable(true);
            }else if(txta004.getText().equals(Integer.toString(max_stoka004))){
                plusa004.setDisable(true);
                mina004.setDisable(false);
            }else{
                plusa004.setDisable(false);
                mina004.setDisable(false);
            }
        }else if (event.getTarget() == plusa005) {
            min_stoka005 = min_stoka005+1;
            txta005.setText(Integer.toString(min_stoka005));
            if(txta005.getText().equals("0")){
                mina005.setDisable(true);
            }else if(txta005.getText().equals(Integer.toString(max_stoka005))){
                plusa005.setDisable(true);
                mina005.setDisable(false);
            }else{
                plusa005.setDisable(false);
                mina005.setDisable(false);
            }
        }else if (event.getTarget() == plusa006) {
            min_stoka006 = min_stoka006+1;
            txta006.setText(Integer.toString(min_stoka006));
            if(txta006.getText().equals("0")){
                mina006.setDisable(true);
            }else if(txta006.getText().equals(Integer.toString(max_stoka006))){
                plusa006.setDisable(true);
                mina006.setDisable(false);
            }else{
                plusa006.setDisable(false);
                mina006.setDisable(false);
            }
        }
    }

    @FXML
    private void minBtnAppetizer(ActionEvent event) {
        if (event.getTarget() == mina001) {
            min_stoka001 = min_stoka001-1;
            txta001.setText(Integer.toString(min_stoka001));
            if(txta001.getText().equals("0")){
                mina001.setDisable(true);
            }else if(txta001.getText().equals(Integer.toString(max_stoka001))){
                plusa001.setDisable(true);
                mina001.setDisable(false);
            }else{
                plusa001.setDisable(false);
                mina001.setDisable(false);
            }
        }else if (event.getTarget() == mina002) {
            min_stoka002 = min_stoka002-1;
            txta002.setText(Integer.toString(min_stoka002));
            if(txta002.getText().equals("0")){
                mina002.setDisable(true);
            }else if(txta002.getText().equals(Integer.toString(max_stoka002))){
                plusa002.setDisable(true);
                mina002.setDisable(false);
            }else{
                plusa002.setDisable(false);
                mina002.setDisable(false);
            }
        }else if (event.getTarget() == mina003) {
            min_stoka003 = min_stoka003-1;
            txta003.setText(Integer.toString(min_stoka003));
            if(txta003.getText().equals("0")){
                mina003.setDisable(true);
            }else if(txta003.getText().equals(Integer.toString(max_stoka003))){
                plusa003.setDisable(true);
                mina003.setDisable(false);
            }else{
                plusa003.setDisable(false);
                mina003.setDisable(false);
            }
        }else if (event.getTarget() == mina004) {
            min_stoka004 = min_stoka004-1;
            txta004.setText(Integer.toString(min_stoka004));
            if(txta004.getText().equals("0")){
                mina004.setDisable(true);
            }else if(txta004.getText().equals(Integer.toString(max_stoka004))){
                plusa004.setDisable(true);
                mina004.setDisable(false);
            }else{
                plusa004.setDisable(false);
                mina004.setDisable(false);
            }
        }else if (event.getTarget() == mina005) {
            min_stoka005 = min_stoka005-1;
            txta005.setText(Integer.toString(min_stoka005));
            if(txta005.getText().equals("0")){
                mina005.setDisable(true);
            }else if(txta005.getText().equals(Integer.toString(max_stoka005))){
                plusa005.setDisable(true);
                mina005.setDisable(false);
            }else{
                plusa005.setDisable(false);
                mina005.setDisable(false);
            }
        }else if (event.getTarget() == mina006) {
            min_stoka006 = min_stoka006-1;
            txta006.setText(Integer.toString(min_stoka006));
            if(txta006.getText().equals("0")){
                mina006.setDisable(true);
            }else if(txta006.getText().equals(Integer.toString(max_stoka006))){
                plusa006.setDisable(true);
                mina006.setDisable(false);
            }else{
                plusa006.setDisable(false);
                mina006.setDisable(false);
            }
        }
    }

    @FXML
    private void plusBtnMaincourse(ActionEvent event) {
        if (event.getTarget() == plusm001) {
            min_stokm001 = min_stokm001+1;
            txtm001.setText(Integer.toString(min_stokm001));
            if(txtm001.getText().equals("0")){
                minm001.setDisable(true);
            }else if(txtm001.getText().equals(Integer.toString(max_stokm001))){
                plusm001.setDisable(true);
                minm001.setDisable(false);
            }else{
                plusm001.setDisable(false);
                minm001.setDisable(false);
            }
        }else if (event.getTarget() == plusm002) {
            min_stokm002 = min_stokm002+1;
            txtm002.setText(Integer.toString(min_stokm002));
            if(txtm002.getText().equals("0")){
                minm002.setDisable(true);
            }else if(txtm002.getText().equals(Integer.toString(max_stokm002))){
                plusm002.setDisable(true);
                minm002.setDisable(false);
            }else{
                plusm002.setDisable(false);
                minm002.setDisable(false);
            }
        }else if (event.getTarget() == plusm003) {
            min_stokm003 = min_stokm003+1;
            txtm003.setText(Integer.toString(min_stokm003));
            if(txtm003.getText().equals("0")){
                minm003.setDisable(true);
            }else if(txtm003.getText().equals(Integer.toString(max_stokm003))){
                plusm003.setDisable(true);
                minm003.setDisable(false);
            }else{
                plusm003.setDisable(false);
                minm003.setDisable(false);
            }
        }else if (event.getTarget() == plusm004) {
            min_stokm004 = min_stokm004+1;
            txtm004.setText(Integer.toString(min_stokm004));
            if(txtm004.getText().equals("0")){
                minm004.setDisable(true);
            }else if(txtm004.getText().equals(Integer.toString(max_stokm004))){
                plusm004.setDisable(true);
                minm004.setDisable(false);
            }else{
                plusm004.setDisable(false);
                minm004.setDisable(false);
            }
        }else if (event.getTarget() == plusm005) {
            min_stokm005 = min_stokm005+1;
            txtm005.setText(Integer.toString(min_stokm005));
            if(txtm005.getText().equals("0")){
                minm005.setDisable(true);
            }else if(txtm005.getText().equals(Integer.toString(max_stokm005))){
                plusm005.setDisable(true);
                minm005.setDisable(false);
            }else{
                plusm005.setDisable(false);
                minm005.setDisable(false);
            }
        }else if (event.getTarget() == plusm006) {
            min_stokm006 = min_stokm006+1;
            txtm006.setText(Integer.toString(min_stokm006));
            if(txtm006.getText().equals("0")){
                minm006.setDisable(true);
            }else if(txtm006.getText().equals(Integer.toString(max_stokm006))){
                plusm006.setDisable(true);
                minm006.setDisable(false);
            }else{
                plusm006.setDisable(false);
                minm006.setDisable(false);
            }
        }else if (event.getTarget() == plusm007) {
            min_stokm007 = min_stokm007+1;
            txtm007.setText(Integer.toString(min_stokm007));
            if(txtm007.getText().equals("0")){
                minm007.setDisable(true);
            }else if(txtm007.getText().equals(Integer.toString(max_stokm007))){
                plusm007.setDisable(true);
                minm007.setDisable(false);
            }else{
                plusm007.setDisable(false);
                minm007.setDisable(false);
            }
        }else if (event.getTarget() == plusm008) {
            min_stokm008 = min_stokm008+1;
            txtm008.setText(Integer.toString(min_stokm008));
            if(txtm008.getText().equals("0")){
                minm008.setDisable(true);
            }else if(txtm008.getText().equals(Integer.toString(max_stokm008))){
                plusm008.setDisable(true);
                minm008.setDisable(false);
            }else{
                plusm008.setDisable(false);
                minm008.setDisable(false);
            }
        }else if (event.getTarget() == plusm009) {
            min_stokm009 = min_stokm009+1;
            txtm009.setText(Integer.toString(min_stokm009));
            if(txtm009.getText().equals("0")){
                minm009.setDisable(true);
            }else if(txtm009.getText().equals(Integer.toString(max_stokm009))){
                plusm009.setDisable(true);
                minm009.setDisable(false);
            }else{
                plusm009.setDisable(false);
                minm009.setDisable(false);
            }
        }else if (event.getTarget() == plusm010) {
            min_stokm010 = min_stokm010+1;
            txtm010.setText(Integer.toString(min_stokm010));
            if(txtm010.getText().equals("0")){
                minm010.setDisable(true);
            }else if(txtm010.getText().equals(Integer.toString(max_stokm010))){
                plusm010.setDisable(true);
                minm010.setDisable(false);
            }else{
                plusm010.setDisable(false);
                minm010.setDisable(false);
            }
        }
    }

    @FXML
    private void minBtnMaincourse(ActionEvent event) {
        if (event.getTarget() == minm001) {
            min_stokm001 = min_stokm001-1;
            txtm001.setText(Integer.toString(min_stokm001));
            if(txtm001.getText().equals("0")){
                minm001.setDisable(true);
            }else if(txtm001.getText().equals(Integer.toString(max_stokm001))){
                plusm001.setDisable(true);
                minm001.setDisable(false);
            }else{
                plusm001.setDisable(false);
                minm001.setDisable(false);
            }
        }else if (event.getTarget() == minm002) {
            min_stokm002 = min_stokm002-1;
            txtm002.setText(Integer.toString(min_stokm002));
            if(txtm002.getText().equals("0")){
                minm002.setDisable(true);
            }else if(txtm002.getText().equals(Integer.toString(max_stokm002))){
                plusm002.setDisable(true);
                minm002.setDisable(false);
            }else{
                plusm002.setDisable(false);
                minm002.setDisable(false);
            }
        }else if (event.getTarget() == minm003) {
            min_stokm003 = min_stokm003-1;
            txtm003.setText(Integer.toString(min_stokm003));
            if(txtm003.getText().equals("0")){
                minm003.setDisable(true);
            }else if(txtm003.getText().equals(Integer.toString(max_stokm003))){
                plusm003.setDisable(true);
                minm003.setDisable(false);
            }else{
                plusm003.setDisable(false);
                minm003.setDisable(false);
            }
        }else if (event.getTarget() == minm004) {
            min_stokm004 = min_stokm004-1;
            txtm004.setText(Integer.toString(min_stokm004));
            if(txtm004.getText().equals("0")){
                minm004.setDisable(true);
            }else if(txtm004.getText().equals(Integer.toString(max_stokm004))){
                plusm004.setDisable(true);
                minm004.setDisable(false);
            }else{
                plusm004.setDisable(false);
                minm004.setDisable(false);
            }
        }else if (event.getTarget() == minm005) {
            min_stokm005 = min_stokm005-1;
            txtm005.setText(Integer.toString(min_stokm005));
            if(txtm005.getText().equals("0")){
                minm005.setDisable(true);
            }else if(txtm005.getText().equals(Integer.toString(max_stokm005))){
                plusm005.setDisable(true);
                minm005.setDisable(false);
            }else{
                plusm005.setDisable(false);
                minm005.setDisable(false);
            }
        }else if (event.getTarget() == minm006) {
            min_stokm006 = min_stokm006-1;
            txtm006.setText(Integer.toString(min_stokm006));
            if(txtm006.getText().equals("0")){
                minm006.setDisable(true);
            }else if(txtm006.getText().equals(Integer.toString(max_stokm006))){
                plusm006.setDisable(true);
                minm006.setDisable(false);
            }else{
                plusm006.setDisable(false);
                minm006.setDisable(false);
            }
        }else if (event.getTarget() == minm007) {
            min_stokm007 = min_stokm007-1;
            txtm007.setText(Integer.toString(min_stokm007));
            if(txtm007.getText().equals("0")){
                minm007.setDisable(true);
            }else if(txtm007.getText().equals(Integer.toString(max_stokm007))){
                plusm007.setDisable(true);
                minm007.setDisable(false);
            }else{
                plusm007.setDisable(false);
                minm007.setDisable(false);
            }
        }else if (event.getTarget() == minm008) {
            min_stokm008 = min_stokm008-1;
            txtm008.setText(Integer.toString(min_stokm008));
            if(txtm008.getText().equals("0")){
                minm008.setDisable(true);
            }else if(txtm008.getText().equals(Integer.toString(max_stokm008))){
                plusm008.setDisable(true);
                minm008.setDisable(false);
            }else{
                plusm008.setDisable(false);
                minm008.setDisable(false);
            }
        }else if (event.getTarget() == minm009) {
            min_stokm009 = min_stokm009-1;
            txtm009.setText(Integer.toString(min_stokm009));
            if(txtm009.getText().equals("0")){
                minm009.setDisable(true);
            }else if(txtm009.getText().equals(Integer.toString(max_stokm009))){
                plusm009.setDisable(true);
                minm009.setDisable(false);
            }else{
                plusm009.setDisable(false);
                minm009.setDisable(false);
            }
        }else if (event.getTarget() == minm010) {
            min_stokm010 = min_stokm010-1;
            txtm010.setText(Integer.toString(min_stokm010));
            if(txtm010.getText().equals("0")){
                minm010.setDisable(true);
            }else if(txtm010.getText().equals(Integer.toString(max_stokm010))){
                plusm010.setDisable(true);
                minm010.setDisable(false);
            }else{
                plusm010.setDisable(false);
                minm010.setDisable(false);
            }
        }
    }

    @FXML
    private void plusBtnDessert(ActionEvent event) {
    }

    @FXML
    private void minBtnDessert(ActionEvent event) {
    }
   
}
