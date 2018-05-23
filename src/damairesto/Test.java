/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package damairesto;

import dao.Rest.DAORestPesanan;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import model.AntrianModel;
import model.HidanganModel;
import model.PesananModel;
import model.UserModel;
import object.Antrian;
import object.Hidangans;
import object.Orders;
import object.User;

/**
 *
 * @author Yuuki
 */
public class Test {
    HidanganModel hidanganModel = new HidanganModel();
    List<Antrian> listAntrian;
    
    public static void main(String[] args) {
        Test a = new Test();
        a.haha();

        //  System.out.println("Coba : "+m.getName()+" Coba : "+m.getStatus());
        
        }
    
    public void haha(){
        //UserModel userModel = new UserModel();
//        /Hidangans m = hidanganModel.get("A009");
        //userModel.insert(new User("arifh19","Arif Hidayat", "default saja" ,"admin"));
            //Map<String, String> dataRow = new HashMap<>();
//            String value0 = m.getKode_hidangan();
//            String value1 = m.getNama_hidangan();
//            String value2 = m.getDeskripsi();
//            double value3 = m.getStok();
            //String value4 = userModel.getUser(String.valueOf(listTransaksi.get(i).getUserId())).getUser_displayname();
//            System.out.println(value0);
//            System.out.println(value1);
//            System.out.println(value2);
//            System.out.println(value3);
//            dataRow.put(Column0MapKey, value0);
//            dataRow.put(Column1MapKey, value1);
//            dataRow.put(Column2MapKey, value2);
//            System.out.println("User :"+value4);
//            dataRow.put(Column3MapKey, value3);
//            dataRow.put(Column4MapKey, value4);
//            allData.add(dataRow);
                AntrianModel antrianModel = new AntrianModel();
                listAntrian = antrianModel.getAll();
                for (int i = 0; i < listAntrian.size(); i++) {
                int value0 = listAntrian.get(i).getAntrian();
            System.out.println(value0);
        
        }
    }
}
