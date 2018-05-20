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
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class MainCourseViewController implements Initializable {

    @FXML
    private Pane chicoryView;
    @FXML
    private Pane kimchifriedView;
    @FXML
    private Pane kimchisushiView;
    @FXML
    private Pane limeView;
    @FXML
    private Pane salmonView;
    @FXML
    private Pane galleteView;
    @FXML
    private Pane sphagettiView;
    @FXML
    private Pane veganView;
    @FXML
    private Pane panView;
    @FXML
    private Pane wagyuView;
    @FXML
    private ImageView closebtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void setView(int event){
        if(event ==1){
            chicoryView.setVisible(true);
        }else if(event ==2){
            kimchifriedView.setVisible(true);
        }else if(event ==3){
            kimchisushiView.setVisible(true);
        }else if(event ==4){
            limeView.setVisible(true);
        }else if(event ==5){
            salmonView.setVisible(true);
        }else if(event ==6){
            galleteView.setVisible(true);
        }else if(event ==7){
            sphagettiView.setVisible(true);
        }else if(event ==8){
            veganView.setVisible(true);
        }else if(event ==9){
            panView.setVisible(true);
        }else if(event ==10){
            wagyuView.setVisible(true);
        }else {
            
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
            controller.setKategori(3);
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
