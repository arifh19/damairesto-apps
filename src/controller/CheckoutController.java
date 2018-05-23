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
import java.text.DecimalFormat;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.AntrianModel;
import model.PesananModel;
import object.Antrian;
import object.Orders;
/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class CheckoutController implements Initializable {
    
    private int num;
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
    @FXML
    private TableView<Orders> table_order;
    @FXML
    private TableColumn<Orders, Integer> noColumn;
    @FXML
    private TableColumn<Orders, String> foodColumn;
    @FXML
    private TableColumn<Orders, Integer> quantityColumn;
    @FXML
    private TableColumn<Orders, Double> priceColumn;
    
    private KategoriController mainApp;
    @FXML
    public JFXTextField txtSubtotal;
    @FXML
    private TableView<Orders> table_checkout;
    @FXML
    private JFXTextField txtchecksubtotal;
    @FXML
    private TableColumn<Orders, Integer> ColumnNo;
    @FXML
    private TableColumn<Orders, String> ColumnFood;
    @FXML
    private TableColumn<Orders, Integer> ColumnQuantity;
    @FXML
    private TableColumn<Orders, Double> ColumnPrice;
    
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
        // TODO
        //TableColumn<Orders, Integer> noColumn = new TableColumn<>("No");
        noColumn.setCellValueFactory(new PropertyValueFactory<>("no"));
        noColumn.setMinWidth(10);
        //TableColumn<Orders, String> foodColumn = new TableColumn<>("Food");
        foodColumn.setCellValueFactory(new PropertyValueFactory<>("food"));
        foodColumn.setMinWidth(25);
        //TableColumn<Orders, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        quantityColumn.setMinWidth(15);
        //TableColumn<Orders, Integer> noColumn = new TableColumn<>("No");
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        priceColumn.setMinWidth(15);
        
        //TableColumn<Orders, Integer> noColumn = new TableColumn<>("No");
        ColumnNo.setCellValueFactory(new PropertyValueFactory<>("no"));
        ColumnNo.setMinWidth(10);
        //TableColumn<Orders, String> foodColumn = new TableColumn<>("Food");
        ColumnFood.setCellValueFactory(new PropertyValueFactory<>("food"));
        ColumnFood.setMinWidth(25);
        //TableColumn<Orders, Integer> quantityColumn = new TableColumn<>("Quantity");
        ColumnQuantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        ColumnQuantity.setMinWidth(15);
        //TableColumn<Orders, Integer> noColumn = new TableColumn<>("No");
        ColumnPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        ColumnPrice.setMinWidth(15);
    }    
    
    public void getSubtotal(double value, int num){
        String mataUang = String.format("Rp.%,.0f", value).replaceAll(",", ".")+",00";
        txtSubtotal.setText(mataUang);
        txtchecksubtotal.setText(mataUang);
        this.num = num;
    }
    
    public void setMainApp(KategoriController mainApp) {
        this.mainApp = mainApp;
        // Add observable list data to the table
        table_order.setItems(mainApp.getPersonData());
        table_checkout.setItems(mainApp.getPersonData());
    }
    @FXML
    private void backButtonAction(ActionEvent event) {
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
            txtFirstName.setText(firstName);
            txtLastName.setText(lastName);
            txtTableNumber.setText(tableNumber);
            if(txtFirstName.getText().isEmpty()||txtLastName.getText().isEmpty()||txtTableNumber.getText().isEmpty()){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Data inputan belum lengkap");
                alert.setHeaderText("Lengkapi kembali formnya");
                alert.showAndWait();
            }else{
                pertama_checkout.setVisible(false);
                kedua_checkout.setVisible(false);
                ketiga_checkout.setVisible(true);
                checkStep3.setVisible(true);
            }
        } else if (event.getTarget() == btnStep3) {
            pertama_checkout.setVisible(false);
            kedua_checkout.setVisible(false);
            ketiga_checkout.setVisible(false);
            checkStep4.setVisible(true);   
            finalcheckOut(event);
            String name = txtFirstName.getText()+" "+txtLastName.getText();
             //System.out.println(name);
             PesananModel pesananModel = new PesananModel();
             
             //Hitung jumlah antrian
             List<Antrian> listAntrian;
             AntrianModel antrianModel = new AntrianModel();
             listAntrian = antrianModel.getAll();
             int antrian=0;
             
             for (int i = 0; i < listAntrian.size(); i++){
                antrian = listAntrian.get(i).getAntrian();
             }
             
             //insert pesanan berdasarkan row
            for(int i=0; i<this.num;i++){
                Orders tableRow = table_order.getItems().get(i);
                System.out.println(tableRow.getKode_hidangan());
                pesananModel.insert(new Orders(tableRow.getKode_hidangan(),Integer.parseInt(txtTableNumber.getText()),name,tableRow.getQuantity(),antrian));
            }
            
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
}
