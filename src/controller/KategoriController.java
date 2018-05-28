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
import java.text.DecimalFormat;
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
import model.HidanganModel;
import object.Hidangans;
import object.Orders;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class KategoriController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private ObservableList<Orders> orderData = FXCollections.observableArrayList();
    
    private double subtotal=0;
    private int no = 0;
    private MenuController MainApp;
    
    //view
    @FXML
    private AnchorPane v_breakfast,v_appetizer,v_maincourse,v_dessert,v_beverages;
    
    //btn utk pindah view
    @FXML
    private JFXButton l_breakfast, l_appetizer, l_maincourse, l_dessert,l_beverages;
    
    /**
     * Tombol Deskripsi
     */
    
    //btn deskripsi beverages
    @FXML
    private JFXButton lemonadebtn,specialitybtn,peachbtn,cocktailbtn,machiantobtn,matchabtn;
    
    //btn deskripsi appetizer
    @FXML
    private JFXButton cajunbtn,friedbtn,jackbtn,roastedbtn,potatoesbtn,buffalobtn;
    
    //btn deskripsi breakfast
    @FXML
    private JFXButton buburbtn,miegorengbtn,bowlbtn,nasigorengbtn;
    
    //btn deskripsi main course
    @FXML
    private JFXButton sphagettibtn,veganbtn,chicorybtn,salmonbtn,panbtn,kimchifriedbtn,wagyubtn,limebtn,galletebtn,kimchisushibtn;
    
    //btn deskripsi dessert
    @FXML
    private JFXButton bostonbtn, cherrybtn, bananabtn, icecreambtn, arumanisbtn, bakedbtn;
    
    //label stock breakfast
    @FXML
    private TextField txtb001,txtb002, txtb003,txtb004;
    
    //btn plus stok breakfast
    @FXML
    private Button plusb001,plusb002, plusb003, plusb004;
    
    //btn min stok breakfast
    @FXML
    private Button minb001, minb002, minb003, minb004;
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
    
    

    @FXML
    private Button plusbe01;
    @FXML
    private Button minbe01;
    @FXML
    private Button plusbe02;
    @FXML
    private Button minbe02;
    @FXML
    private Button plusbe03;
    @FXML
    private Button minbe03;
    @FXML
    private Button plusbe04;
    @FXML
    private Button minbe04;
    @FXML
    private Button plusbe05;
    @FXML
    private Button minbe05;
    @FXML
    private Button plusbe06;
    @FXML
    private Button minbe06;

    @FXML
    private TextField txtbe01;
    @FXML
    private TextField txtbe02;
    @FXML
    private TextField txtbe03;
    @FXML
    private TextField txtbe04;
    @FXML
    private TextField txtbe05;
    @FXML
    private TextField txtbe06;
    @FXML
    private Label lblb001;
    @FXML
    private Label priceb001;
    @FXML
    private Label lblb002;
    @FXML
    private Label priceb002;
    @FXML
    private Label lblb003;
    @FXML
    private Label priceb003;
    @FXML
    private Label lblb004;
    @FXML
    private Label priceb004;
    @FXML
    private Label lbla001;
    @FXML
    private Label pricea001;
    @FXML
    private Label lbla002;
    @FXML
    private Label pricea002;
    @FXML
    private Label lbla003;
    @FXML
    private Label pricea003;
    @FXML
    private Label lbla004;
    @FXML
    private Label pricea004;
    @FXML
    private Label lbla005;
    @FXML
    private Label pricea005;
    @FXML
    private Label lbla006;
    @FXML
    private Label pricea006;
    @FXML
    private Label pricem001;
    @FXML
    private Label lblm001;
    @FXML
    private Label pricem002;
    @FXML
    private Label lblm002;
    @FXML
    private Label pricem003;
    @FXML
    private Label lblm003;
    @FXML
    private Label pricem004;
    @FXML
    private Label lblm004;
    @FXML
    private Label pricem005;
    @FXML
    private Label lblm005;
    @FXML
    private Label pricem006;
    @FXML
    private Label lblm006;
    @FXML
    private Label pricem007;
    @FXML
    private Label lblm007;
    @FXML
    private Label pricem008;
    @FXML
    private Label lblm008;
    @FXML
    private Label pricem009;
    @FXML
    private Label lblm009;
    @FXML
    private Label pricem010;
    @FXML
    private Label lblm010;
    @FXML
    private Label lbld001;
    @FXML
    private Label priced001;
    @FXML
    private Label lbld002;
    @FXML
    private Label priced002;
    @FXML
    private Label lbld003;
    @FXML
    private Label priced003;
    @FXML
    private Label lbld004;
    @FXML
    private Label priced004;
    @FXML
    private Label lbld005;
    @FXML
    private Label priced005;
    @FXML
    private Label lbld006;
    @FXML
    private Label priced006;
    @FXML
    private Label lblbe01;
    @FXML
    private Label pricebe01;
    @FXML
    private Label lblbe02;
    @FXML
    private Label pricebe02;
    @FXML
    private Label lblbe03;
    @FXML
    private Label pricebe03;
    @FXML
    private Label lblbe04;
    @FXML
    private Label pricebe04;
    @FXML
    private Label lblbe05;
    @FXML
    private Label pricebe05;
    @FXML
    private Label lblbe06;
    @FXML
    private Label pricebe06;
    
    /**
     * Variabel untuk menyimpan jumlah stock
     * 
     */
    //Variabel max stock
    //appetizer
    private int max_stoka001 =0;
    private int max_stoka002 =0;
    private int max_stoka003 =0;
    private int max_stoka004 =0;
    private int max_stoka005 =0;
    private int max_stoka006 =0;
    //breakfast
    private int max_stokb001 =0;
    private int max_stokb002 =0;
    private int max_stokb003 =0;
    private int max_stokb004 =0;
    //main course
    private int max_stokm001 =0;
    private int max_stokm002 =0;
    private int max_stokm003 =0;
    private int max_stokm004 =0;
    private int max_stokm005 =0;
    private int max_stokm006 =0;
    private int max_stokm007 =0;
    private int max_stokm008 =0;
    private int max_stokm009 =0;
    private int max_stokm010 =0;
    //dessert
    private int max_stokd001 =0;
    private int max_stokd002 =0;
    private int max_stokd003 =0;
    private int max_stokd004 =0;
    private int max_stokd005 =0;
    private int max_stokd006 =0;
    //beverages
    private int max_stokbe01 =0;
    private int max_stokbe02 =0;
    private int max_stokbe03 =0;
    private int max_stokbe04 =0;
    private int max_stokbe05 =0;
    private int max_stokbe06 =0;
    
    //variabel min stock
   //appetizer
    private int min_stoka001 =0;
    private int min_stoka002 =0;
    private int min_stoka003 =0;
    private int min_stoka004 =0;
    private int min_stoka005 =0;
    private int min_stoka006 =0;
    //breakfast
    private int min_stokb001 =0;
    private int min_stokb002 =0;
    private int min_stokb003 =0;
    private int min_stokb004 =0;
    //maincourse 
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
    //dessert
    private int min_stokd001 =0;
    private int min_stokd002 =0;
    private int min_stokd003 =0;
    private int min_stokd004 =0;
    private int min_stokd005 =0;
    private int min_stokd006 =0;
    //beverages
    private int min_stokbe01 =0;
    private int min_stokbe02 =0;
    private int min_stokbe03 =0;
    private int min_stokbe04 =0;
    private int min_stokbe05 =0;
    private int min_stokbe06 =0;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        refreshStock();
        
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
    
    public void refreshStock(){
        HidanganModel hidanganModel = new HidanganModel();
        Hidangans h;
        String[] appetizer={"A001","A002","A003","A004","A005","A006"};
        String[] breakfast={"B001","B002","B003","B004"};
        String[] maincourse={"M001","M002","M003","M004","M005","M006","M007","M008","M009","M010"};
        String[] dessert={"D001","D002","D003","D004","D005","D006"};
        String[] beverages={"BE01","BE02","BE03","BE04","BE05","BE06"};
        
        
        h = hidanganModel.get(appetizer[0]);
        this.max_stoka001 = h.getStok();
        h = hidanganModel.get(appetizer[1]);
        this.max_stoka002 = h.getStok(); 
        h = hidanganModel.get(appetizer[2]);
        this.max_stoka003 = h.getStok();       
        h = hidanganModel.get(appetizer[3]);
        this.max_stoka004 = h.getStok();
        h = hidanganModel.get(appetizer[4]);
        this.max_stoka005 = h.getStok();
        h = hidanganModel.get(appetizer[5]);
        this.max_stoka006 = h.getStok();
        
        h = hidanganModel.get(breakfast[0]);
        this.max_stokb001 = h.getStok();
        h = hidanganModel.get(breakfast[1]);
        this.max_stokb002 = h.getStok(); 
        h = hidanganModel.get(breakfast[2]);
        this.max_stokb003 = h.getStok();       
        h = hidanganModel.get(breakfast[3]);
        this.max_stokb004 = h.getStok();
        
        h = hidanganModel.get(maincourse[0]);
        this.max_stokm001 = h.getStok();
        h = hidanganModel.get(maincourse[1]);
        this.max_stokm002 = h.getStok(); 
        h = hidanganModel.get(maincourse[2]);
        this.max_stokm003 = h.getStok();       
        h = hidanganModel.get(maincourse[3]);
        this.max_stokm004 = h.getStok();
        h = hidanganModel.get(maincourse[4]);
        this.max_stokm005 = h.getStok();
        h = hidanganModel.get(maincourse[5]);
        this.max_stokm006 = h.getStok();
        h = hidanganModel.get(maincourse[6]);
        this.max_stokm007 = h.getStok();
        h = hidanganModel.get(maincourse[7]);
        this.max_stokm008 = h.getStok(); 
        h = hidanganModel.get(maincourse[8]);
        this.max_stokm009 = h.getStok();       
        h = hidanganModel.get(maincourse[9]);
        this.max_stokm010 = h.getStok();
        
        h = hidanganModel.get(dessert[0]);
        this.max_stokd001 = h.getStok();
        h = hidanganModel.get(dessert[1]);
        this.max_stokd002 = h.getStok(); 
        h = hidanganModel.get(dessert[2]);
        this.max_stokd003 = h.getStok();       
        h = hidanganModel.get(dessert[3]);
        this.max_stokd004 = h.getStok();
        h = hidanganModel.get(dessert[4]);
        this.max_stokd005 = h.getStok();
        h = hidanganModel.get(dessert[5]);
        this.max_stokd006 = h.getStok();
        
        h = hidanganModel.get(beverages[0]);
        this.max_stokbe01 = h.getStok();
        h = hidanganModel.get(beverages[1]);
        this.max_stokbe02 = h.getStok(); 
        h = hidanganModel.get(beverages[2]);
        this.max_stokbe03 = h.getStok();       
        h = hidanganModel.get(beverages[3]);
        this.max_stokbe04 = h.getStok();
        h = hidanganModel.get(beverages[4]);
        this.max_stokbe05 = h.getStok();
        h = hidanganModel.get(beverages[5]);
        this.max_stokbe06 = h.getStok();
        
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
            CheckoutController controller = fxmlLoader.getController();
	    controller.setMainApp(this);
            getOrderBreakfast();
            getOrderAppetizer();
            getOrderMainCourse();
            getOrderDessert();
            getOrderBeverages();
            controller.getSubtotal(this.subtotal, this.no);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public ObservableList<Orders> getPersonData() {
        return orderData;
    }
    
    public void getOrderBreakfast(){
        
        if(!txtb001.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priceb001.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtb001.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "B001",lblb001.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtb002.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priceb002.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtb002.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "B002",lblb002.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtb003.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priceb003.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtb003.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "B003",lblb003.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtb004.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priceb004.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtb004.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "B004",lblb004.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
    }
    
    public void getOrderAppetizer(){
        
        if(!txta001.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricea001.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txta001.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "A001",lbla001.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txta002.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricea002.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txta002.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "A002",lbla002.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txta003.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricea003.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txta003.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "A003",lbla003.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txta004.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricea004.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txta004.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "A004",lbla004.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        if(!txta005.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricea005.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txta005.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "A005",lbla005.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txta006.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricea006.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txta006.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "A006",lbla006.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
    }
       
    public void getOrderMainCourse(){
        
        if(!txtm001.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem001.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm001.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M001",lblm001.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm002.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem002.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm002.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M002",lblm002.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm003.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem003.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm003.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M003",lblm003.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm004.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem004.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm004.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M004",lblm004.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        if(!txtm005.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem005.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(3).toString());
            int kuantitas =Integer.parseInt(txtm005.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M005",lblm005.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm006.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem006.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm006.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M006",lblm006.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm007.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem007.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(3).toString());
            int kuantitas =Integer.parseInt(txtm007.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M007",lblm007.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm008.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem008.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm008.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M008",lblm008.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm009.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem009.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(3).toString());
            int kuantitas =Integer.parseInt(txtm009.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M009",lblm009.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtm010.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricem010.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtm010.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "M010",lblm010.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
    }
    
    public void getOrderDessert(){
        
        if(!txtd001.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priced001.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtd001.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "D001",lbld001.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtd002.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priced002.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtd002.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "D002",lbld002.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtd003.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priced003.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtd003.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "D003",lbld003.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtd004.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priced004.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtd004.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "D004",lbld004.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        if(!txtd005.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priced005.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtd005.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "D005",lbld005.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtd006.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(priced006.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtd006.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "D006",lbld006.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
    }

    public void getOrderBeverages(){
        
        if(!txtbe01.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricebe01.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtbe01.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "BE01",lblbe01.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtbe02.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricebe02.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtbe02.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "BE02",lblbe02.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtbe03.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricebe03.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtbe03.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "BE03",lblbe03.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtbe04.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricebe04.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtbe04.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "BE04",lblbe04.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        if(!txtbe05.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricebe05.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtbe05.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "BE05",lblbe05.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
        }
        
        if(!txtbe06.getText().equals("0")){
            no++;
            StringBuffer price;
            price = new StringBuffer(pricebe06.getText().substring(3));
            double harga = Double.parseDouble(price.deleteCharAt(2).toString());
            int kuantitas =Integer.parseInt(txtbe06.getText());
            Double subharga = harga*kuantitas;
            orderData.add(new Orders(no, "BE06",lblbe06.getText(), kuantitas, subharga));
            this.subtotal = this.subtotal+subharga;
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
        if (event.getTarget() == plusd001) {
            min_stokd001 = min_stokd001+1;
            txtd001.setText(Integer.toString(min_stokd001));
            if(txtd001.getText().equals("0")){
                mind001.setDisable(true);
            }else if(txtd001.getText().equals(Integer.toString(max_stokd001))){
                plusd001.setDisable(true);
                mind001.setDisable(false);
            }else{
                plusd001.setDisable(false);
                mind001.setDisable(false);
            }
        }else if (event.getTarget() == plusd002) {
            min_stokd002 = min_stokd002+1;
            txtd002.setText(Integer.toString(min_stokd002));
            if(txtd002.getText().equals("0")){
                mind002.setDisable(true);
            }else if(txtd002.getText().equals(Integer.toString(max_stokd002))){
                plusd002.setDisable(true);
                mind002.setDisable(false);
            }else{
                plusd002.setDisable(false);
                mind002.setDisable(false);
            }
        }else if (event.getTarget() == plusd003) {
            min_stokd003 = min_stokd003+1;
            txtd003.setText(Integer.toString(min_stokd003));
            if(txtd003.getText().equals("0")){
                mind003.setDisable(true);
            }else if(txtd003.getText().equals(Integer.toString(max_stokd003))){
                plusd003.setDisable(true);
                mind003.setDisable(false);
            }else{
                plusd003.setDisable(false);
                mind003.setDisable(false);
            }
        }else if (event.getTarget() == plusd004) {
            min_stokd004 = min_stokd004+1;
            txtd004.setText(Integer.toString(min_stokd004));
            if(txtd004.getText().equals("0")){
                mind004.setDisable(true);
            }else if(txtd004.getText().equals(Integer.toString(max_stokd004))){
                plusd004.setDisable(true);
                mind004.setDisable(false);
            }else{
                plusd004.setDisable(false);
                mind004.setDisable(false);
            }
        }else if (event.getTarget() == plusd005) {
            min_stokd005 = min_stokd005+1;
            txtd005.setText(Integer.toString(min_stokd005));
            if(txtd005.getText().equals("0")){
                mind005.setDisable(true);
            }else if(txtd005.getText().equals(Integer.toString(max_stokd005))){
                plusd005.setDisable(true);
                mind005.setDisable(false);
            }else{
                plusd005.setDisable(false);
                mind005.setDisable(false);
            }
        }else if (event.getTarget() == plusd006) {
            min_stokd006 = min_stokd006+1;
            txtd006.setText(Integer.toString(min_stokd006));
            if(txtd006.getText().equals("0")){
                mind006.setDisable(true);
            }else if(txtd006.getText().equals(Integer.toString(max_stokd006))){
                plusd006.setDisable(true);
                mind006.setDisable(false);
            }else{
                plusd006.setDisable(false);
                mind006.setDisable(false);
            }
        }
    }

    @FXML
    private void minBtnDessert(ActionEvent event) {
        if (event.getTarget() == mind001) {
            min_stokd001 = min_stokd001-1;
            txtd001.setText(Integer.toString(min_stokd001));
            if(txtd001.getText().equals("0")){
                mind001.setDisable(true);
            }else if(txtd001.getText().equals(Integer.toString(max_stokd001))){
                plusd001.setDisable(true);
                mind001.setDisable(false);
            }else{
                plusd001.setDisable(false);
                mind001.setDisable(false);
            }
        }else if (event.getTarget() == mind002) {
            min_stokd002 = min_stokd002-1;
            txtd002.setText(Integer.toString(min_stokd002));
            if(txtd002.getText().equals("0")){
                mind002.setDisable(true);
            }else if(txtd002.getText().equals(Integer.toString(max_stokd002))){
                plusd002.setDisable(true);
                mind002.setDisable(false);
            }else{
                plusd002.setDisable(false);
                mind002.setDisable(false);
            }
        }else if (event.getTarget() == mind003) {
            min_stokd003 = min_stokd003-1;
            txtd003.setText(Integer.toString(min_stokd003));
            if(txtd003.getText().equals("0")){
                mind003.setDisable(true);
            }else if(txtd003.getText().equals(Integer.toString(max_stokd003))){
                plusd003.setDisable(true);
                mind003.setDisable(false);
            }else{
                plusd003.setDisable(false);
                mind003.setDisable(false);
            }
        }else if (event.getTarget() == mind004) {
            min_stokd004 = min_stokd004-1;
            txtd004.setText(Integer.toString(min_stokd004));
            if(txtd004.getText().equals("0")){
                mind004.setDisable(true);
            }else if(txtd004.getText().equals(Integer.toString(max_stokd004))){
                plusd004.setDisable(true);
                mind004.setDisable(false);
            }else{
                plusd004.setDisable(false);
                mind004.setDisable(false);
            }
        }else if (event.getTarget() == mind005) {
            min_stokd005 = min_stokd005-1;
            txtd005.setText(Integer.toString(min_stokd005));
            if(txtd005.getText().equals("0")){
                mind005.setDisable(true);
            }else if(txtd005.getText().equals(Integer.toString(max_stokd005))){
                plusd005.setDisable(true);
                mind005.setDisable(false);
            }else{
                plusd005.setDisable(false);
                mind005.setDisable(false);
            }
        }else if (event.getTarget() == mind006) {
            min_stokd006 = min_stokd006-1;
            txtd006.setText(Integer.toString(min_stokd006));
            if(txtd006.getText().equals("0")){
                mind006.setDisable(true);
            }else if(txtd006.getText().equals(Integer.toString(max_stokd006))){
                plusd006.setDisable(true);
                mind006.setDisable(false);
            }else{
                plusd006.setDisable(false);
                mind006.setDisable(false);
            }
        }
    }

    @FXML
    private void plusBtnBeverages(ActionEvent event) {
        if (event.getTarget() == plusbe01) {
            min_stokbe01 = min_stokbe01+1;
            txtbe01.setText(Integer.toString(min_stokbe01));
            if(txtbe01.getText().equals("0")){
                minbe01.setDisable(true);
            }else if(txtbe01.getText().equals(Integer.toString(max_stokbe01))){
                plusbe01.setDisable(true);
                minbe01.setDisable(false);
            }else{
                plusbe01.setDisable(false);
                minbe01.setDisable(false);
            }
        }else if (event.getTarget() == plusbe02) {
            min_stokbe02 = min_stokbe02+1;
            txtbe02.setText(Integer.toString(min_stokbe02));
            if(txtbe02.getText().equals("0")){
                minbe02.setDisable(true);
            }else if(txtbe02.getText().equals(Integer.toString(max_stokbe02))){
                plusbe02.setDisable(true);
                minbe02.setDisable(false);
            }else{
                plusbe02.setDisable(false);
                minbe02.setDisable(false);
            }
        }else if (event.getTarget() == plusbe03) {
            min_stokbe03 = min_stokbe03+1;
            txtbe03.setText(Integer.toString(min_stokbe03));
            if(txtbe03.getText().equals("0")){
                minbe03.setDisable(true);
            }else if(txtbe03.getText().equals(Integer.toString(max_stokbe03))){
                plusbe03.setDisable(true);
                minbe03.setDisable(false);
            }else{
                plusbe03.setDisable(false);
                minbe03.setDisable(false);
            }
        }else if (event.getTarget() == plusbe04) {
            min_stokbe04 = min_stokbe04+1;
            txtbe04.setText(Integer.toString(min_stokbe04));
            if(txtbe04.getText().equals("0")){
                minbe04.setDisable(true);
            }else if(txtbe04.getText().equals(Integer.toString(max_stokbe04))){
                plusbe04.setDisable(true);
                minbe04.setDisable(false);
            }else{
                plusbe04.setDisable(false);
                minbe04.setDisable(false);
            }
        }else if (event.getTarget() == plusbe05) {
            min_stokbe05 = min_stokbe05+1;
            txtbe05.setText(Integer.toString(min_stokbe05));
            if(txtbe05.getText().equals("0")){
                minbe05.setDisable(true);
            }else if(txtbe05.getText().equals(Integer.toString(max_stokbe05))){
                plusbe05.setDisable(true);
                minbe05.setDisable(false);
            }else{
                plusbe05.setDisable(false);
                minbe05.setDisable(false);
            }
        }else if (event.getTarget() == plusbe06) {
            min_stokbe06 = min_stokbe06+1;
            txtbe06.setText(Integer.toString(min_stokbe06));
            if(txtbe06.getText().equals("0")){
                minbe06.setDisable(true);
            }else if(txtbe06.getText().equals(Integer.toString(max_stokbe06))){
                plusbe06.setDisable(true);
                minbe06.setDisable(false);
            }else{
                plusbe06.setDisable(false);
                minbe06.setDisable(false);
            }
        }
    }

    @FXML
    private void minBtnBeverages(ActionEvent event) {
        if (event.getTarget() == minbe01) {
            min_stokbe01 = min_stokbe01-1;
            txtbe01.setText(Integer.toString(min_stokbe01));
            if(txtbe01.getText().equals("0")){
                minbe01.setDisable(true);
            }else if(txtbe01.getText().equals(Integer.toString(max_stokbe01))){
                plusbe01.setDisable(true);
                minbe01.setDisable(false);
            }else{
                plusbe01.setDisable(false);
                minbe01.setDisable(false);
            }
        }else if (event.getTarget() == minbe02) {
            min_stokbe02 = min_stokbe02-1;
            txtbe02.setText(Integer.toString(min_stokbe02));
            if(txtbe02.getText().equals("0")){
                minbe02.setDisable(true);
            }else if(txtbe02.getText().equals(Integer.toString(max_stokbe02))){
                plusbe02.setDisable(true);
                minbe02.setDisable(false);
            }else{
                plusbe02.setDisable(false);
                minbe02.setDisable(false);
            }
        }else if (event.getTarget() == minbe03) {
            min_stokbe03 = min_stokbe03-1;
            txtbe03.setText(Integer.toString(min_stokbe03));
            if(txtbe03.getText().equals("0")){
                minbe03.setDisable(true);
            }else if(txtbe03.getText().equals(Integer.toString(max_stokbe03))){
                plusbe03.setDisable(true);
                minbe03.setDisable(false);
            }else{
                plusbe03.setDisable(false);
                minbe03.setDisable(false);
            }
        }else if (event.getTarget() == minbe04) {
            min_stokbe04 = min_stokbe04-1;
            txtbe04.setText(Integer.toString(min_stokbe04));
            if(txtbe04.getText().equals("0")){
                minbe04.setDisable(true);
            }else if(txtbe04.getText().equals(Integer.toString(max_stokbe04))){
                plusbe04.setDisable(true);
                minbe04.setDisable(false);
            }else{
                plusbe04.setDisable(false);
                minbe04.setDisable(false);
            }
        }else if (event.getTarget() == minbe05) {
            min_stokbe05 = min_stokbe05-1;
            txtbe05.setText(Integer.toString(min_stokbe05));
            if(txtbe05.getText().equals("0")){
                minbe05.setDisable(true);
            }else if(txtbe05.getText().equals(Integer.toString(max_stokbe05))){
                plusbe05.setDisable(true);
                minbe05.setDisable(false);
            }else{
                plusbe05.setDisable(false);
                minbe05.setDisable(false);
            }
        }else if (event.getTarget() == minbe06) {
            min_stokbe06 = min_stokbe06-1;
            txtbe06.setText(Integer.toString(min_stokbe06));
            if(txtbe06.getText().equals("0")){
                minbe06.setDisable(true);
            }else if(txtbe06.getText().equals(Integer.toString(max_stokbe06))){
                plusbe06.setDisable(true);
                minbe06.setDisable(false);
            }else{
                plusbe06.setDisable(false);
                minbe06.setDisable(false);
            }
        }
    }
   
}
