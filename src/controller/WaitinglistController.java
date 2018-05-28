/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import model.AntrianModel;
import object.Antrian;

/**
 * FXML Controller class
 *
 * @author Yuuki
 */
public class WaitinglistController implements Initializable {

    @FXML
    private Label txtWaktu;
    List<Antrian> listAntrian;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        AntrianModel antrianModel = new AntrianModel();
                listAntrian = antrianModel.getAll();
                for (int i = 0; i < listAntrian.size(); i++) {
                int value0 = listAntrian.get(i).getAntrian();
                txtWaktu.setText("Jumlah Antrian : " + Integer.toString(value0));
           }
    }    
    
    @FXML
    private void orderAgain(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/view/menu.fxml"));
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
}
