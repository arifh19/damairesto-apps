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
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class OperatorController implements Initializable {

    @FXML
    private AnchorPane daily_report;
    @FXML
    private JFXTextField field_usr;
    @FXML
    private AnchorPane resto_mng;
    @FXML
    private AnchorPane food_mng;
    @FXML
    private AnchorPane dailyreport_opt;
    @FXML
    private AnchorPane cashier_opt;
    @FXML
    private JFXTextField price_lbl;
    @FXML
    private JFXTextField quantity_lbl;
    @FXML
    private JFXTextField name_lbl;
    @FXML
    private JFXTextField tableno_lbl;
    @FXML
    private JFXButton bttn_foodmanage;
    @FXML
    private JFXButton bttn_restomanage;
    @FXML
    private JFXButton bttn_restomanage1;
    @FXML
    private JFXButton bttn_restomanage11;
    @FXML
    private JFXTextField quantity_lbl1;
    @FXML
    private JFXButton logout_bttn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getTarget() == bttn_foodmanage) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#ffffff"));
            bttn_restomanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#b07e6a"));
            food_mng.setVisible(true);
            resto_mng.setVisible(false);
            dailyreport_opt.setVisible(false);
            cashier_opt.setVisible(false);
        } else if (event.getTarget() == bttn_restomanage) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage.setTextFill(Paint.valueOf("#ffffff"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#b07e6a"));
            food_mng.setVisible(false);
            resto_mng.setVisible(true);
            dailyreport_opt.setVisible(false);
            cashier_opt.setVisible(false);
        }else if (event.getTarget() == bttn_restomanage1) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#ffffff"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#b07e6a"));
            food_mng.setVisible(false);
            resto_mng.setVisible(false);
            dailyreport_opt.setVisible(true);
            cashier_opt.setVisible(false);
        }else if (event.getTarget() == bttn_restomanage11) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#ffffff"));
            food_mng.setVisible(false);
            resto_mng.setVisible(false);
            dailyreport_opt.setVisible(false);
            cashier_opt.setVisible(true);
        } else {
            
        }
    }
    
    private void LogoutAction(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/login.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));  
            stage.show();
            stage1.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
