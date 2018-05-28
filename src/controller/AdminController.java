/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import damairesto.DamaiResto;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.FinanceModel;
import model.HidanganModel;
import model.PesananModel;
import model.UserModel;
import object.Finance;
import object.Hidangans;
import object.Orders;
import object.User;

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
    private TableView<Map> table_user;
    @FXML
    private AnchorPane food_mng_adm;
    @FXML
    private AnchorPane resto_mng_adm;
    @FXML
    private TableColumn<Map, ?> firstUsernameColumn;
    @FXML
    private TableColumn<Map, ?> firstNameColumn;
    @FXML
    private TableColumn<Map, ?> firstStatusColumn;
    @FXML
    private JFXTextField TxtUsername;
    @FXML
    private JFXPasswordField TxtPassword;
    @FXML
    private JFXTextField TxtName;
    @FXML
    private JFXTextField TxtStatus;
    
    
    // Reference to the main application.
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
    private TableView<Map> table_resto;
    @FXML
    private JFXTextField lbl_user;
    @FXML
    private TableColumn<Map, ?> noColumnResto;
    @FXML
    private TableColumn<Map, ?> dateColumnResto;
    @FXML
    private TableColumn<Map, ?> tableColumnResto;
    @FXML
    private TableColumn<Map, ?> earningColumnResto;
    @FXML
    private TableColumn<Map, ?> operatorColumnResto;
    @FXML
    private TableColumn<Map, ?> informationColumnResto;
    
    List<Hidangans> listFoodCode;

    List<User> listUser;
    
   
    @FXML
    private JFXTextField txtFoodKode;
    @FXML
    private JFXTextField txtFoodName;
    @FXML
    private JFXTextField txtFoodPrice;
    @FXML
    private JFXTextField txtFoodStock;
    @FXML
    private TableView<Map> table_foodmng;
    @FXML
    private TableColumn<Map, ?> keyFoodColumn;
    @FXML
    private TableColumn<Map, ?> FoodNameColumn;
    @FXML
    private TableColumn<Map, ?> priceFoodColumn;
    @FXML
    private TableColumn<Map, ?> stockFoodColumn;
    List<Finance> listFinance;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       fillTable();
    }    
    private void fillTable(){
        table_user.getItems().clear();
        table_foodmng.getItems().clear();
        
        firstUsernameColumn.setCellValueFactory(new MapValueFactory("username"));
        firstNameColumn.setCellValueFactory(new MapValueFactory("name"));
        firstStatusColumn.setCellValueFactory(new MapValueFactory("status"));
        
        keyFoodColumn.setCellValueFactory(new MapValueFactory("keyfood"));
        FoodNameColumn.setCellValueFactory(new MapValueFactory("foodname"));
        priceFoodColumn.setCellValueFactory(new MapValueFactory("pricefood"));
        stockFoodColumn.setCellValueFactory(new MapValueFactory("stockfood"));
        
        noColumnResto.setCellValueFactory(new MapValueFactory("noearning"));
        dateColumnResto.setCellValueFactory(new MapValueFactory("dateearning"));
        tableColumnResto.setCellValueFactory(new MapValueFactory("tableearning"));
        earningColumnResto.setCellValueFactory(new MapValueFactory("earnings"));
        operatorColumnResto.setCellValueFactory(new MapValueFactory("nameearning"));
        informationColumnResto.setCellValueFactory(new MapValueFactory("infoearnings"));

        table_user.setItems(generateDataUser());
        table_user.setEditable(false);
        table_foodmng.setItems(generateFood());
        table_foodmng.setEditable(false);
        table_resto.setItems(generateDataEarning());
        table_resto.setEditable(false);
       // table_foodmng.getSelectionModel().setCellSelectionEnabled(true);

    }
    
    private ObservableList<Map> generateDataUser() {
        UserModel userModel = new UserModel();
        listUser = userModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listUser.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            String value0 = listUser.get(i).getUsername();
            String value1 = listUser.get(i).getName();
            String value2 = listUser.get(i).getStatus();
            //String value4 = Double.toString(value3);
            dataRow.put("username", value0);
            dataRow.put("name", value1);
            dataRow.put("status", value2);
            allData.add(dataRow);
        }
        return allData;
    }
    
    private ObservableList<Map> generateFood() {
        HidanganModel hidanganModel = new HidanganModel();
        listFoodCode = hidanganModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listFoodCode.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            String value0 = listFoodCode.get(i).getKode_hidangan();
            String value1 = listFoodCode.get(i).getNama_hidangan();
            Double value2 = listFoodCode.get(i).getHarga();
            int value3 = listFoodCode.get(i).getStok();
            //String value4 = Double.toString(value3);
            dataRow.put("keyfood", value0);
            dataRow.put("foodname", value1);
            dataRow.put("pricefood", Double.toString(value2));
            dataRow.put("stockfood", Integer.toString(value3));
            allData.add(dataRow);
        }
        return allData;
    }
    private ObservableList<Map> generateDataEarning() {
        FinanceModel financeModel = new FinanceModel();
        listFinance = financeModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listFinance.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            int value0 = listFinance.get(i).getTable_number();
            String value1 = listFinance.get(i).getDate();
            String value2 = listFinance.get(i).getOperator_name();
            double value3 = listFinance.get(i).getEarning();
            String value4 = listFinance.get(i).getInformation();
            dataRow.put("noearning", Integer.toString(i+1));
            dataRow.put("tableearning", Integer.toString(value0));
            dataRow.put("dateearning", value1);
            dataRow.put("nameearning", value2);
            dataRow.put("earnings", Double.toString(value3));
            dataRow.put("infoearnings", value4);
            allData.add(dataRow);
        }
        return allData;
    }
    
    public void setUser(String user){
        this.lbl_user.setText(user);
    }
    @FXML
    public void Register(ActionEvent event) {
        // Add observable list data to the table
        // Add some sample data
       
        String name = TxtName.getText();
        String username = TxtUsername.getText();
        String password = TxtPassword.getText();
        String status = TxtStatus.getText();
        if(name.isEmpty()||password.isEmpty()||status.isEmpty()||username.isEmpty()||password.length()<8||username.length()<5){
            Alert alert = new Alert(AlertType.WARNING);
	    alert.setTitle("Data inputan belum lengkap");
	    alert.setHeaderText("Lengkapi kembali formnya");
            alert.showAndWait();
        }else{
            UserModel userModel = new UserModel();
            userModel.insert(new User(name,username, password ,status));
            table_user.getItems().clear();
            fillTable();
            //userData.add(new Users(name, username,status));
            //table_user.setItems(userData);
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
            table_user.getItems().clear();
            fillTable();
        } else if (event.getTarget() == bttn_food_mng_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#ffffff"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#b07e6a"));
            user_mng_adm.setVisible(false);
            food_mng_adm.setVisible(true);
            resto_mng_adm.setVisible(false);
            statistic_adm.setVisible(false);
            table_user.getItems().clear();
            fillTable();
        }else if (event.getTarget() == bttn_resto_mng_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#ffffff"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#b07e6a"));
            user_mng_adm.setVisible(false);
            food_mng_adm.setVisible(false);
            resto_mng_adm.setVisible(true);
            statistic_adm.setVisible(false);
            table_user.getItems().clear();
            fillTable();
        }else if (event.getTarget() == bttn_stats_adm) {
            bttn_usr_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_food_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_resto_mng_adm.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_stats_adm.setTextFill(Paint.valueOf("#ffffff"));
            user_mng_adm.setVisible(false);
            food_mng_adm.setVisible(false);
            resto_mng_adm.setVisible(false);
            statistic_adm.setVisible(true);
            table_user.getItems().clear();
            fillTable();
        } else {
            table_user.getItems().clear();
            fillTable();
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

    @FXML
    private void btnSearchfood(ActionEvent event) {
        String key = txtFoodKode.getText();
        if(key.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Silahkan isi field kode makanan yang akan dicari");
            alert.showAndWait();
        }else{
            HidanganModel hidanganModel = new HidanganModel();
            Hidangans m = hidanganModel.get(key);
       // String value0 = m.getKode_hidangan();
            String value0 = m.getNama_hidangan();
            double value1 = m.getHarga();
            int value2 = m.getStok();
            txtFoodName.setText(value0);
            txtFoodPrice.setText(Double.toString(value1));
            txtFoodStock.setText(Integer.toString(value2));
        }
        
    }

    @FXML
    private void btnSearchUser(ActionEvent event) {
        if(TxtUsername.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Silahkan isi field username yang dicari");
            alert.showAndWait();
        }else{
            UserModel userModel = new UserModel();
            String key = TxtUsername.getText();
            User u = userModel.get(key);
       // String value0 = m.getKode_hidangan();
            String value1 = u.getName();
            String value2 = u.getUsername();
            String value3 = u.getStatus();
            String value4 = "xxxxxxxxx";
            TxtName.setText(value1);
            TxtUsername.setText(value2);
            TxtPassword.setText(value4);
            TxtStatus.setText(value3);
            table_user.getItems().clear();
            table_user.setItems(generateDataUser());
        }  
    }

    @FXML
    private void btnUpdateUser(ActionEvent event) {
        String name = TxtName.getText();
        String username = TxtUsername.getText();
        String password = TxtPassword.getText();
        String status = TxtStatus.getText();
        if(name.isEmpty()||password.isEmpty()||status.isEmpty()||username.isEmpty()||password.length()<8||username.length()<5){
            Alert alert = new Alert(AlertType.WARNING);
	    alert.setTitle("Data inputan belum lengkap");
	    alert.setHeaderText("Lengkapi kembali formnya");
            alert.showAndWait();     
        }else{
            UserModel userModel = new UserModel();
        //UserModel userModel = new UserModel();
            userModel.update(new User(name,username, password ,status));
            table_user.getItems().clear();
            table_user.setItems(generateDataUser());
            TxtName.setText("");
            TxtUsername.setText("");
            TxtPassword.setText("");
            TxtStatus.setText("");
        } 
    }

    @FXML
    private void btnDeleteUser(ActionEvent event) {
        if(TxtUsername.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Error");
            alert.setHeaderText("Silahkan isi field username yang akan dihapus");
            alert.showAndWait();
        }else{
            UserModel userModel = new UserModel();
            String username = TxtUsername.getText();
            userModel.delete(username);
            table_user.getItems().clear();
            table_user.setItems(generateDataUser());
            TxtName.setText("");
            TxtUsername.setText("");
            TxtPassword.setText("");
            TxtStatus.setText("");
        }
    }
            
        
    
}
