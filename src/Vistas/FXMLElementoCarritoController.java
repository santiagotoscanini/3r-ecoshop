/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Alimento;
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
    
    public void setController(FXMLCarritoController controlador) {
        this.controlador = controlador;
    }
    
    public void setSistema(Sistema sis) {
        this.sis = sis;
    }
    
    public void cargarDatos(String nombre, Boolean envase, int unidades, int precio, Alimento alimento) {
        this.lblNombre.setText(nombre);
        if(envase){
            compostableBox.setSelected(true);
            reutilizableBox.setSelected(false);
        }else{
            reutilizableBox.setSelected(true);
            compostableBox.setSelected(false);
        }
       this.lblUnidades.setText(Integer.toString(unidades));
       this.lblPrecio.setText(Integer.toString(precio));
       this.id = alimento.getId();
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
    private void handleReutilizableBox(){
        if(reutilizableBox.isSelected()){
            compostableBox.setSelected(false);
        }
    }
    
    @FXML
    private void handleCompostableBox(){
        if(compostableBox.isSelected()){
            reutilizableBox.setSelected(false);
        }
    }
    
//    @FXML
//    public void eliminarElemento(ActionEvent event) {
//        this.sis.eliminarElementoPorId(this.id);
//        this.controlador.cargarElementos();
//    }
//    

}
