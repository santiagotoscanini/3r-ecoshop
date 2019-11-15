package Vistas;

import Modelos.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLSucursalController implements Initializable {

    @FXML
    private Label lblIdSucursal;
    @FXML
    private Label lblDireccion;
    @FXML
    private Label lblTelefono;
    
    private Sistema sistema;
    
    public void setSistema(Sistema sis){
        this.sistema = sis;
    }
    
    @FXML
    public void cargarDatos(int id, String direccion, int telefono){
        this.lblIdSucursal.setText(Integer.toString(id));
        this.lblDireccion.setText(direccion);
        this.lblTelefono.setText(Integer.toString(telefono));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
