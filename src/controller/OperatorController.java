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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.HidanganModel;
import model.PesananModel;
import object.Hidangans;
import object.Orders;

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
    @FXML
    private TableColumn<Map, ?> keyFoodColumn;
    @FXML
    private TableColumn<Map, ?> FoodNameColumn;
    @FXML
    private TableColumn<Map, ?> priceFoodColumn;
    @FXML
    private TableColumn<Map, ?> stockFoodColumn;
    
    
    List<Hidangans> listHidangan;
    
    PesananModel pesananModel = new PesananModel();
    List<Orders> listPesanan;
    @FXML
    private TableView<Map> table_foodmng;
    
    @FXML
    private TableView<Map> table_restomng;
    @FXML
    private TableColumn<Map, ?> noRestColumn;
    @FXML
    private TableColumn<Map, ?> tableRestColumn;
    @FXML
    private TableColumn<Map, ?> dateRestColumn;
    @FXML
    private TableColumn<Map, ?> nameRestColumn;
    @FXML
    private TableColumn<Map, ?> informasiRestColumn;
    @FXML
    private JFXTextField txtFoodCode;
    @FXML
    private JFXTextField txtFoodPrice;
    @FXML
    private JFXTextField txtFoodStock;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        fillTable();
        
    }    
    
    private void fillTable(){
        table_foodmng.getItems().clear();
        table_restomng.getItems().clear();
        
        keyFoodColumn.setCellValueFactory(new MapValueFactory("keyword"));
        FoodNameColumn.setCellValueFactory(new MapValueFactory("food"));
        priceFoodColumn.setCellValueFactory(new MapValueFactory("price"));
        stockFoodColumn.setCellValueFactory(new MapValueFactory("stock"));
        
        noRestColumn.setCellValueFactory(new MapValueFactory("norest"));
        tableRestColumn.setCellValueFactory(new MapValueFactory("tablerest"));
        dateRestColumn.setCellValueFactory(new MapValueFactory("daterest"));
        nameRestColumn.setCellValueFactory(new MapValueFactory("namerest"));
        informasiRestColumn.setCellValueFactory(new MapValueFactory("informasirest"));
    
        table_foodmng.setItems(generateDataHidangan());
        table_foodmng.setEditable(false);
       // table_foodmng.getSelectionModel().setCellSelectionEnabled(true);
        
        table_restomng.setItems(generateDataPesanan());
        table_restomng.setEditable(false);
       // table_restomng.getSelectionModel().setCellSelectionEnabled(true);
       
            //       tblEmoyeeList.getColumns().setAll(clmEmployeName);
            //        tblEmoyeeList.refresh();
        
    }
    
    public void Refresh() throws InterruptedException, InterruptedException{
        while(true){
            try{
                    Thread.sleep(1000);
                    table_foodmng.setItems(generateDataHidangan());
                    table_restomng.setItems(generateDataPesanan());
            } 
            catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            
            
        }
    }
    
    private ObservableList<Map> generateDataHidangan() {
        HidanganModel hidanganModel = new HidanganModel();
        listHidangan = hidanganModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listHidangan.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            String value0 = listHidangan.get(i).getKode_hidangan();
            String value1 = listHidangan.get(i).getNama_hidangan();
            String value2 = listHidangan.get(i).getDeskripsi();
            double value3 = listHidangan.get(i).getHarga();
            //String value4 = Double.toString(value3);
            int value4 = listHidangan.get(i).getStok();
            dataRow.put("keyword", value0);
            dataRow.put("food", value1);
            dataRow.put("stock", Integer.toString(value4));
            dataRow.put("price", Double.toString(value3));
            allData.add(dataRow);
        }
        return allData;
    }
    
    private ObservableList<Map> generateDataPesanan() {
        listPesanan = pesananModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listPesanan.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            int value0 = listPesanan.get(i).getNomor_meja();
            String value1 = listPesanan.get(i).getDate();
            String value2 = listPesanan.get(i).getName();
            int value3 = listPesanan.get(i).getInformasi();
            dataRow.put("norest", Integer.toString(i+1));
            dataRow.put("tablerest", Integer.toString(value0));
            dataRow.put("daterest", value1);
            dataRow.put("namerest", value2);
            dataRow.put("informasirest", Integer.toString(value3));
            allData.add(dataRow);
        }
        return allData;
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
            fillTable();
        } else if (event.getTarget() == bttn_restomanage) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage.setTextFill(Paint.valueOf("#ffffff"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#b07e6a"));
            food_mng.setVisible(false);
            resto_mng.setVisible(true);
            dailyreport_opt.setVisible(false);
            cashier_opt.setVisible(false);
            fillTable();
        }else if (event.getTarget() == bttn_restomanage1) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#ffffff"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#b07e6a"));
            food_mng.setVisible(false);
            resto_mng.setVisible(false);
            dailyreport_opt.setVisible(true);
            cashier_opt.setVisible(false);
            fillTable();
        }else if (event.getTarget() == bttn_restomanage11) {
            bttn_foodmanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage1.setTextFill(Paint.valueOf("#b07e6a"));
            bttn_restomanage11.setTextFill(Paint.valueOf("#ffffff"));
            food_mng.setVisible(false);
            resto_mng.setVisible(false);
            dailyreport_opt.setVisible(false);
            cashier_opt.setVisible(true);
            fillTable();
        } else {
            fillTable();
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

    @FXML
    private void btnSearchFood(ActionEvent event) {
        HidanganModel hidanganModel = new HidanganModel();
        String key = txtFoodCode.getText();
        Hidangans m = hidanganModel.get(key);
       // String value0 = m.getKode_hidangan();
            double value1 = m.getHarga();
            int value2 = m.getStok();
            txtFoodPrice.setText(Double.toString(value1));
            txtFoodStock.setText(Integer.toString(value2));
    }
}
