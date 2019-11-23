/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Alimento;
import Modelos.ElementoCarrito;
import Modelos.Sistema;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Santi
 */
public class FXMLElementoCarritoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    private FXMLCarritoController controlador;

    Sistema sis;
    private int id;
    private ElementoCarrito elementoCarrito;
    private Alimento alimento;

    public void setController(FXMLCarritoController controlador) {
        this.controlador = controlador;
    }

    public void setSistema(Sistema sis) {
        this.sis = sis;
    }

    public void cargarDatos(String nombre, Boolean envase, int unidades, int precio, Alimento alimento, ElementoCarrito a) {
        this.lblNombre.setText(nombre);
        if (envase) {
            compostableBox.setSelected(true);
            reutilizableBox.setSelected(false);
        } else {
            reutilizableBox.setSelected(true);
            compostableBox.setSelected(false);
        }
        a.setCompostable(envase);
        this.lblUnidades.setText(Integer.toString(unidades));
        a.setUnidades(unidades);
        this.lblPrecio.setText(Integer.toString(precio * unidades));
        this.id = alimento.getId();
        this.elementoCarrito = a;
        this.alimento = alimento;
    }

    private void actualizarPrecio(int unidades) {

        int precioActual = this.alimento.getPrecio() * unidades;
        this.lblPrecio.setText(Integer.toString(precioActual));
        controlador.cargarElementos();
    }

    @FXML
    private Label lblPrecio;

    @FXML
    private Label lblNombre;

    @FXML
    private Label lblUnidades;

    @FXML
    private CheckBox reutilizableBox;

    @FXML
    private CheckBox compostableBox;

    @FXML
    private void handleReutilizableBox() {
        this.elementoCarrito.setCompostable(false);
        if (reutilizableBox.isSelected()) {
            compostableBox.setSelected(false);
        } else {
            reutilizableBox.setSelected(true);
        }
    }

    @FXML
    private void handleCompostableBox() {
        this.elementoCarrito.setCompostable(true);
        if (compostableBox.isSelected()) {
            reutilizableBox.setSelected(false);
        } else {
            compostableBox.setSelected(true);
        }
    }

    @FXML
    public void eliminarElemento(ActionEvent event) {
        this.sis.eliminarElementoPorId(this.id);
        this.controlador.cargarElementos();
    }

    @FXML
    public void agregarUnidad(ActionEvent event) {
        int unidades = Integer.parseInt(this.lblUnidades.getText()) + 1;
        this.lblUnidades.setText(Integer.toString(unidades));
        this.elementoCarrito.setUnidades(unidades);
        actualizarPrecio(unidades);
    }

    @FXML
    public void quitarUnidad(ActionEvent event) {
        int unidades = Integer.parseInt(this.lblUnidades.getText()) - 1;
        if (unidades > 0) {
            this.lblUnidades.setText(Integer.toString(unidades));
            this.elementoCarrito.setUnidades(unidades);
            actualizarPrecio(unidades);
        } else {
            this.sis.eliminarElementoPorId(this.id);
            this.controlador.cargarElementos();
        }

    }

}
