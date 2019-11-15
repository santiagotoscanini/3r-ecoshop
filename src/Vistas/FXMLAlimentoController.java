package Vistas;

import Modelos.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLAlimentoController implements Initializable {

    @FXML
    private Label nombre;
    @FXML
    private Label tipo;
    @FXML
    private Label descripcion;
    @FXML
    private Label envase;
    
    private Sistema sis;
    
    public void cargarDatos(){
        
    }
    
    public void setSistema(Sistema sis){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}