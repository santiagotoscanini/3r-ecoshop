package Vistas;

import Modelos.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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

    private FXMLInicioController parentController;

    @FXML
    public void eliminarSucursal(ActionEvent event) {
        this.parentController.eliminarSucursal(Integer.parseInt(this.lblIdSucursal.getText()));
    }

    public void setParentController(FXMLInicioController controlador) {
        this.parentController = controlador;
    }

    @FXML
    public void cargarDatos(int id, String direccion, int telefono) {
        this.lblIdSucursal.setText(Integer.toString(id));
        this.lblDireccion.setText(direccion);
        this.lblTelefono.setText(Integer.toString(telefono));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
