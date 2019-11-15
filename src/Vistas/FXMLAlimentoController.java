package Vistas;

import Modelos.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLAlimentoController implements Initializable {

    @FXML
    private Label lblNombre;
    @FXML
    private Label lblDesc;
    /*@FXML
    private Label descripcion;
    @FXML
    private Label envase;
    */
    private Sistema sistema;
    
    public void cargarDatos(String nombre, String desc){
        this.lblNombre.setText(nombre);
        this.lblDesc.setText(desc);
    }
    
    @FXML
    public void handleClickAdd(ActionEvent event){
        this.lblNombre.setText("clickeado");
    }
    public void setSistema(Sistema sis){
        this.sistema = sis;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}