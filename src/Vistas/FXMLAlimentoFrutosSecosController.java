/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Alimento;
import Modelos.ElementoCarrito;
import Modelos.Sistema;
import static Vistas.FXMLFrutasCongeladasController.isNumeric;
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
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Santi
 */
public class FXMLAlimentoFrutosSecosController implements Initializable {

    @FXML
    private Label lblNombre;
    @FXML
    private Label lblDesc;
    @FXML
    private Label lblPrecio;

    private FXMLFrutosSecosController controlador;

    Sistema sis;
    private int id;

    public void setController(FXMLFrutosSecosController controlador) {
        this.controlador = controlador;
    }

    public void setSistema(Sistema sis) {
        this.sis = sis;
    }

    public void cargarDatos(String nombre, String desc, int precio, int id) {
        this.lblNombre.setText(nombre);
        this.lblDesc.setText(desc);
        this.lblPrecio.setText(Integer.toString(precio));
        this.id = id;
    }

    @FXML
    public void eliminarAlimento(ActionEvent event) {
        this.sis.eliminarAlimentoPorId(this.id);
        this.controlador.cargarAlimentos();
    }

    @FXML
    public void agregarAlCarrito(ActionEvent event) {
        Alimento alimento = sis.getAlimento(this.id);
        if(!sis.getSelectedUser().getElementosCarrito().contains(new ElementoCarrito(alimento))){
            sis.getSelectedUser().agregarElementoCarrito(new ElementoCarrito(alimento));
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
