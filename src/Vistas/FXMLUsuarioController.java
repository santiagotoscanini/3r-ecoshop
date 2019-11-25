package Vistas;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLUsuarioController implements Initializable {

    @FXML
    private Label lblNombre;
    @FXML
    private Label lblPos;
    @FXML
    private Label lblPuntos;

    @FXML
    public void cargarDatos(String nombre, int pos, double puntos) {
        this.lblNombre.setText(nombre);
        this.lblPos.setText(Integer.toString(pos));
        this.lblPuntos.setText(Double.toString(puntos));
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
