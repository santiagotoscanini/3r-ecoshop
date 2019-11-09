package Vistas;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.stage.Stage;

public class FXMLMisDireccionesController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
//
//    @FXML
//    public void volverHandleClick(ActionEvent event) {
//        System.out.println("mis direcciones");
//        FXMLLoader loader = new FXMLLoader(
//                getClass().getResource("FXMLMisDirecciones.fxml"));
//
//        try {
//            Parent tableViewParent = loader.load();
//            Scene tableViewScene = new Scene(tableViewParent);
//            
//            
//            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
//
//            window.setScene(tableViewScene);
//            window.show();
//        } catch (IOException ex) {
//            System.out.println("pito");//Logger.getLogger(Utilitarios.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
}
