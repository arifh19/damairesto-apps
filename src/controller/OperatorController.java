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
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.control.cell.PropertyValueFactory;
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
public class OperatorController implements Initializable {

    @FXML
    private AnchorPane daily_report;
    @FXML
    private Label field_usr;
    @FXML
    private AnchorPane resto_mng;
    @FXML
    private AnchorPane food_mng;
    @FXML
    private AnchorPane dailyreport_opt;
    @FXML
    private AnchorPane cashier_opt;
    @FXML
    private JFXButton bttn_foodmanage;
    @FXML
    private JFXButton bttn_restomanage;
    @FXML
    private JFXButton bttn_restomanage1;
    @FXML
    private JFXButton bttn_restomanage11;
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
    private JFXTextField txtFoodName;
    @FXML
    private JFXTextField txtDeskripsi;
    @FXML
    private JFXTextField txtStock;
    @FXML
    private JFXTextField txtHarga;
    @FXML
    private JFXTextField txtWaktu;
    @FXML
    private JFXTextField txtTableNumber;
    @FXML
    private JFXTextField txtDate;
    @FXML
    private JFXTextField txtName;
    @FXML
    private JFXTextField txtEarning;
    @FXML
    private JFXTextField txtInformation;
    @FXML
    private TableColumn<Map, ?> columnNoEarning;
    @FXML
    private TableColumn<Map, ?> columnTableEarning;
    @FXML
    private TableColumn<Map, ?> columnDateEarning;
    @FXML
    private TableColumn<Map, ?> columnNameEarning;
    @FXML
    private TableColumn<Map, ?> columnEarnings;
    @FXML
    private TableView<Map> table_earning;
    @FXML
    private JFXTextField txtKeyCashier;
    @FXML
    private JFXTextField txtNameCashier;
    @FXML
    private JFXTextField txtTableCashier;
    @FXML
    private JFXTextField txtCash;
    @FXML
    private JFXTextField txtChange;
    @FXML
    private JFXTextField txtTotalCashier;
    @FXML
    private TableView<Map> table_book;
    @FXML
    private TableColumn<Map, ?> columnBookno;
    @FXML
    private TableColumn<Map, ?> columnBookTableNumber;
    @FXML
    private TableColumn<Map, ?> columnBookDate;
    @FXML
    private TableColumn<Map, ?> columnBookName;
    @FXML
    private TableColumn<Map, ?> columnBookInfo;
    @FXML
    private JFXTextField txtFoodCode;
    @FXML
    private JFXTextField txtEarnings;
    
    List<Hidangans> listHidangan;
    List<Finance> listFinance;
    List<Orders> listPesanan;
    List<Orders> listSeluruhPesanan;
    java.util.Date tglsekarang = new java.util.Date();
    private SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
    //diatas adalah pengaturan format penulisan, bisa diubah sesuai keinginan.
    private final String tanggal = smpdtfmt.format(tglsekarang);
    
   
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
        table_earning.getItems().clear();
        
        keyFoodColumn.setCellValueFactory(new MapValueFactory("keyword"));
        FoodNameColumn.setCellValueFactory(new MapValueFactory("food"));
        priceFoodColumn.setCellValueFactory(new MapValueFactory("price"));
        stockFoodColumn.setCellValueFactory(new MapValueFactory("stock"));
        
        noRestColumn.setCellValueFactory(new MapValueFactory("norest"));
        tableRestColumn.setCellValueFactory(new MapValueFactory("tablerest"));
        dateRestColumn.setCellValueFactory(new MapValueFactory("daterest"));
        nameRestColumn.setCellValueFactory(new MapValueFactory("namerest"));
        informasiRestColumn.setCellValueFactory(new MapValueFactory("pricerest"));
        
        columnNoEarning.setCellValueFactory(new MapValueFactory("noearning"));
        columnTableEarning.setCellValueFactory(new MapValueFactory("tableearning"));
        columnDateEarning.setCellValueFactory(new MapValueFactory("dateearning"));
        columnNameEarning.setCellValueFactory(new MapValueFactory("nameearning"));
        columnEarnings.setCellValueFactory(new MapValueFactory("earnings"));
        
        columnBookno.setCellValueFactory(new MapValueFactory("no"));
        columnBookTableNumber.setCellValueFactory(new MapValueFactory("table"));
        columnBookDate.setCellValueFactory(new MapValueFactory("date"));
        columnBookName.setCellValueFactory(new MapValueFactory("name"));
        columnBookInfo.setCellValueFactory(new MapValueFactory("info"));
    
        table_foodmng.setItems(generateDataHidangan());
        table_foodmng.setEditable(false);
       // table_foodmng.getSelectionModel().setCellSelectionEnabled(true);
        
        table_restomng.setItems(generateDataPesanan());
        table_restomng.setEditable(false);
        
        table_earning.setItems(generateDataEarning());
        table_earning.setEditable(false);
        
        table_book.setItems(generateDataBook());
        table_book.setEditable(false);
        
        FinanceModel financeModel = new FinanceModel();
        double earnings = financeModel.earnings();
        txtEarnings.setText(Double.toString(earnings));
  
       // table_restomng.getSelectionModel().setCellSelectionEnabled(true);
       
            //       tblEmoyeeList.getColumns().setAll(clmEmployeName);
            //        tblEmoyeeList.refresh();
        
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
        PesananModel pesananModel = new PesananModel();
        listPesanan = pesananModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listPesanan.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            int value0 = listPesanan.get(i).getNomor_meja();
            String value1 = listPesanan.get(i).getDate();
            String value2 = listPesanan.get(i).getName();
            double value3 = listPesanan.get(i).getPrice();
            dataRow.put("norest", Integer.toString(i+1));
            dataRow.put("tablerest", Integer.toString(value0));
            dataRow.put("daterest", value1);
            dataRow.put("namerest", value2);
            dataRow.put("pricerest", Double.toString(value3));
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
            dataRow.put("noearning", Integer.toString(i+1));
            dataRow.put("tableearning", Integer.toString(value0));
            dataRow.put("dateearning", value1);
            dataRow.put("nameearning", value2);
            dataRow.put("earnings", Double.toString(value3));
            allData.add(dataRow);
        }
        return allData;
    }
    
    private ObservableList<Map> generateDataBook() {
        FinanceModel financeModel = new FinanceModel();
        listFinance = financeModel.getAll();
        ObservableList<Map> allData = FXCollections.observableArrayList();
        allData.removeAll(allData);
        for (int i = 0; i < listFinance.size(); i++) {
            Map<String, String> dataRow = new HashMap<>();
            String name = listFinance.get(i).getNama_pelanggan();
            int table = listFinance.get(i).getTable_number();
            String information = listFinance.get(i).getInformation();
            dataRow.put("no", Integer.toString(i+1));
            dataRow.put("table", Integer.toString(table));
            dataRow.put("date", tanggal);
            dataRow.put("name", name);
            dataRow.put("info", information);
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
    private void btnSearchFood(ActionEvent event) {
        HidanganModel hidanganModel = new HidanganModel();
        String key = txtFoodCode.getText();
        Hidangans m = hidanganModel.get(key);
       // String value0 = m.getKode_hidangan();
        String kode_hidangan = m.getKode_hidangan();
        String nama_hidangan = m.getNama_hidangan();
        String deskripsi = m.getDeskripsi();
        int stok = m.getStok();
        double harga = m.getHarga();
        int waktu = m.getWaktu();

        txtFoodName.setText(nama_hidangan);
        txtDeskripsi.setText(deskripsi);
        txtStock.setText(Integer.toString(stok));
        txtHarga.setText(Double.toString(harga));
        txtWaktu.setText(Integer.toString(waktu));
        fillTable();
            
    }

    @FXML
    private void btnUpdateFood(ActionEvent event) {
        HidanganModel hidanganModel = new HidanganModel();
        String key = txtFoodCode.getText();
        String name = txtFoodName.getText();
        String deskripsi = txtDeskripsi.getText();
        int stok = Integer.parseInt(txtStock.getText());
        double harga = Double.parseDouble(txtHarga.getText());
        int waktu = Integer.parseInt(txtWaktu.getText());
        //UserModel userModel = new UserModel();
        hidanganModel.update(new Hidangans(key, name, deskripsi ,stok,harga,waktu));
        txtFoodCode.setText("");
        txtFoodName.setText("");
        txtDeskripsi.setText("");
        txtStock.setText("");
        txtHarga.setText("");
        txtWaktu.setText("");
        fillTable();
    }

    @FXML
    private void btnSaveFood(ActionEvent event) {
        HidanganModel hidanganModel = new HidanganModel();
        String key = txtFoodCode.getText();
        String name = txtFoodName.getText();
        String deskripsi = txtDeskripsi.getText();
        int stok = Integer.parseInt(txtStock.getText());
        double harga = Double.parseDouble(txtHarga.getText());
        int waktu = Integer.parseInt(txtWaktu.getText());
        //UserModel userModel = new UserModel();
        hidanganModel.insert(new Hidangans(key, name, deskripsi ,stok,harga,waktu));
        txtFoodCode.setText("");
        txtFoodName.setText("");
        txtDeskripsi.setText("");
        txtStock.setText("");
        txtHarga.setText("");
        txtWaktu.setText("");
        fillTable();
    }

    @FXML
    private void btnDeleteFood(ActionEvent event){
        HidanganModel hidanganModel = new HidanganModel();
        String key = txtFoodCode.getText();
        hidanganModel.delete(key);
    }

    private void btnFinish(ActionEvent event) {
        HidanganModel hidanganModel = new HidanganModel();
        String key = txtFoodCode.getText();
        Hidangans m = hidanganModel.get(key);
       // String value0 = m.getKode_hidangan();
        String kode_hidangan = m.getKode_hidangan();
        String nama_hidangan = m.getNama_hidangan();
        String deskripsi = m.getDeskripsi();
        int stok = m.getStok();
        double harga = m.getHarga();
        int waktu = m.getWaktu();

        txtFoodName.setText(nama_hidangan);
        txtDeskripsi.setText(deskripsi);
        txtStock.setText(Integer.toString(stok));
        txtHarga.setText(Double.toString(harga));
        txtWaktu.setText(Integer.toString(waktu));
        fillTable();
    }

    @FXML
    private void btnSearchRest(ActionEvent event) {
        PesananModel pesananModel = new PesananModel();
        int key = Integer.parseInt(txtTableNumber.getText());
        Orders m = pesananModel.get(key);
       // String value0 = m.getKode_hidangan();
        int table_number = m.getNomor_meja();
        String date = m.getDate();
        String nama_pelanggan = m.getName();
        double price = m.getPrice();

        txtDate.setText(date);
        txtName.setText(nama_pelanggan);
        txtEarning.setText(Double.toString(price));
        txtInformation.setText(txtInformation.getText());
        fillTable();
    }
    private double total_harga=0;
    @FXML
    private void btnSearchCashier(ActionEvent event) {
        PesananModel pesananModel = new PesananModel();
        int key = Integer.parseInt(txtKeyCashier.getText());
        Orders m = pesananModel.get(key);
       // String value0 = m.getKode_hidangan();
        int table_number = m.getNomor_meja();
        String tanggal = m.getDate();
        String nama_pelanggan = m.getName();
        double price = m.getPrice();
        this.total_harga=price;

        txtDate.setText(tanggal);
        txtNameCashier.setText(nama_pelanggan);
        txtTableCashier.setText(Integer.toString(table_number));
        txtTotalCashier.setText(Double.toString(price));
        fillTable();
    }

    @FXML
    private void btnFinishCashier(ActionEvent event) {
        double total = Double.parseDouble(txtCash.getText());
        double earning = total-this.total_harga;
        txtChange.setText(Double.toString(earning));
    }

    @FXML
    private void btnFinishOrder(ActionEvent event) {
        String date = txtDate.getText();
        String name = txtName.getText();
        int table = Integer.parseInt(txtTableNumber.getText());
        double earning = Double.parseDouble(txtEarning.getText());
        String information = txtInformation.getText();
        String operatorname = field_usr.getText();
        if(date.isEmpty()||name.isEmpty()||earning==0||information.isEmpty()){
            Alert alert = new Alert(AlertType.WARNING);
	    alert.setTitle("Data inputan belum lengkap");
	    alert.setHeaderText("Lengkapi kembali formnya");
            alert.showAndWait();
        }else{
            PesananModel pesananModel = new PesananModel();
            FinanceModel financeModel = new FinanceModel();
            financeModel.insert(new Finance(table,tanggal, earning ,information, operatorname));
            int a = pesananModel.getHitung(table);
            for(int i=0;i<a;i++){
                pesananModel.delete(table);
            }
            table_book.getItems().clear();
            table_restomng.getItems().clear();
            fillTable();
            txtTableNumber.setText("");
            txtDate.setText("");
            txtName.setText("");
            txtEarning.setText("");
            txtInformation.setText("");
        
        }
    }
    
       public void setUsername(String user){
           field_usr.setText(user);
       } 
 
    }
