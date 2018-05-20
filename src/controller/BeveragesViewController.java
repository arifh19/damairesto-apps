/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class BeveragesViewController implements Initializable {

    @FXML
    private Pane LemonadeView;
    @FXML
    private Pane peachView;
    @FXML
    private Pane cockTailView;
    @FXML
    private Pane MacchiatoView;
    @FXML
    private Pane MatchalatteView;
    @FXML
    private Pane SpecialityTeaView;
    
    private MenuController MainApp;
    @FXML
    private ImageView closebtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setMainApp(MenuController mainApp) {
        this.MainApp = mainApp;
        // Add obserVievable list data to the table
    }
    
    public void setView(int event){
        if(event ==1){
            LemonadeView.setVisible(true);
        }else if(event ==2){
            peachView.setVisible(true);
        }else if(event ==3){
            cockTailView.setVisible(true);
        }else if(event ==4){
            MacchiatoView.setVisible(true);
        }else if(event ==5){
            MatchalatteView.setVisible(true);
        }else{
            SpecialityTeaView.setVisible(true);
        }
    }
    
    @FXML
    private void backButtonAction(MouseEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/kategori.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage1 = (Stage) ((Node) (event.getSource())).getScene().getWindow();
            Stage stage = new Stage();
            stage.initStyle(StageStyle.UNDECORATED);
            stage.setScene(new Scene(root1));  
            stage.show();
            stage1.close();
            KategoriController controller = fxmlLoader.getController();
            controller.setKategori(5);
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    
    @FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) closebtn.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
    
}
