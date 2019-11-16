package Vistas;

import Modelos.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLDireccionController implements Initializable {

    @FXML
    private Label lblDireccion;

    private FXMLMisDireccionesController parentController;

    @FXML
    public void eliminarDireccion(ActionEvent event) {
        this.parentController.eliminarDireccion(this.lblDireccion.getText());
    }

    public void setDireccion(String direccion) {
        this.lblDireccion.setText(direccion);
    }
    

    public void setParentController(FXMLMisDireccionesController controlador) {
        this.parentController = controlador;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
