/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import damairesto.DamaiResto;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import object.Users;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class AdminController implements Initializable {

    @FXML
    private JFXButton bttn_stats_adm;
    @FXML
    private AnchorPane user_mng_adm;
    @FXML
    private TableView<Users> table_user;
    @FXML
    private AnchorPane food_mng_adm;
    @FXML
    private AnchorPane resto_mng_adm;
    @FXML
    private TableColumn<Users, String> firstUsernameColumn;
    @FXML
    private TableColumn<Users, String> firstNameColumn;
    @FXML
    private TableColumn<Users, String> firstStatusColumn;
    @FXML
    private JFXTextField TxtUsername;
    @FXML
    private JFXTextField TxtPassword;
    @FXML
    private JFXTextField TxtName;
    @FXML
    private JFXTextField TxtStatus;
    
    
    // Reference to the main application.
    private ObservableList<Users> userData = FXCollections.observableArrayList();
    @FXML
    private JFXButton bttn_usr_mng_adm;
    @FXML
    private JFXButton bttn_food_mng_adm;
    @FXML
    private JFXButton bttn_resto_mng_adm;
    @FXML
    private JFXButton bttn_logout_adm;
    @FXML
    private AnchorPane statistic_adm;
    @FXML
    private JFXButton bttn_financialstats;
    @FXML
    private JFXButton bttn_custstats;
    @FXML
    private JFXButton bttn_dailyreport;
    @FXML
    private AnchorPane cust_report;
    @FXML
    private LineChart<?, ?> custreport_stats;
    @FXML
    private TableView<?> custreport_table;
    @FXML
    private LineChart<?, ?> financial_statistic;
    @FXML
    private TableView<?> financial_table;
    @FXML
    private AnchorPane dailyreport;
    @FXML
    private TableView<?> dailyreport_table;
    @FXML
    private TableView<?> table_resto;
    @FXML
    private JFXTextField lbl_user;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // Initialize the person table with the two columns.
        firstUsernameColumn.setCellValueFactory(cellData -> cellData.getValue().UsernameProperty());
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().NameProperty());
        firstStatusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

     // Clear person details.
        //showPersonDetails(null);

     // Listen for selection changes and show the person details when changed.
//        table_user.getSelectionModel().selectedItemProperty().addListener(
//                (observable, oldValue, newValue) -> showPersonDetails(newValue));
    }    
    
    @FXML
    public void Register(ActionEvent event) {
        // Add observable list data to the table
        // Add some sample data
        String name = TxtName.getText();
        String username = TxtUsername.getText();
        String password = TxtPassword.getText();
        String status = TxtStatus.getText();
        if(name.isEmpty()||name.isEmpty()||name.isEmpty()||name.isEmpty()){
            Alert alert = new Alert(AlertType.WARNING);
	    alert.setTitle("Data inputan belum lengkap");
	    alert.setHeaderText("Lengkapi kembali formnya");
            alert.showAndWait();
        }else{
       
            userData.add(new Users(name, username,status));
            table_user.setItems(userData);
            TxtName.setText("");
            TxtUsername.setText("");
            TxtPassword.setText("");
            TxtStatus.setText("");
        
        }
        
    }
    
//    public ObservableList<Users> getUserData() {
//        return userData;
//    }
    @FXML
    public void handleButtonAction(ActionEvent event) {
        if (event.getTarget() == bttn_usr_mng_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#ffffff"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#b07e6a"));
            user_mng_adm.setVisible(true);
            food_mng_adm.setVisible(false);
            resto_mng_adm.setVisible(false);
            statistic_adm.setVisible(false);
        } else if (event.getTarget() == bttn_food_mng_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#ffffff"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#b07e6a"));
            user_mng_adm.setVisible(false);
            food_mng_adm.setVisible(true);
            resto_mng_adm.setVisible(false);
            statistic_adm.setVisible(false);
        }else if (event.getTarget() == bttn_resto_mng_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#ffffff"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#b07e6a"));
            user_mng_adm.setVisible(false);
            food_mng_adm.setVisible(false);
            resto_mng_adm.setVisible(true);
            statistic_adm.setVisible(false);
        }else if (event.getTarget() == bttn_stats_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#ffffff"));
            user_mng_adm.setVisible(false);
            food_mng_adm.setVisible(false);
            resto_mng_adm.setVisible(false);
            statistic_adm.setVisible(true);
        } else {
            
        }
    }
    
    @FXML
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
