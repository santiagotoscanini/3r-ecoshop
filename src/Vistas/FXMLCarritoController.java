package Vistas;

import Modelos.Alimento;
import Modelos.ElementoCarrito;
import Modelos.Sistema;
import Modelos.Usuario;
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
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLCarritoController implements Initializable {
    
    private Sistema sistema;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void setSistema(Sistema sis){
        this.sistema = sis;
    }
    
    @FXML
    private VBox VBoxElementosCarrito;
    
    @FXML
    private CheckBox efectivoBox;
    
    @FXML
    private CheckBox tarjetaBox;
    
    @FXML
    private void handleEfectivoBox(){
        if(efectivoBox.isSelected()){
            tarjetaBox.setSelected(false);
        }
    }
    
    
    @FXML
    private void handleTarjetaBox(){
        if(tarjetaBox.isSelected()){
            efectivoBox.setSelected(false);
        }
    }
    
    public void cargarElementos() {

        this.VBoxElementosCarrito.getChildren().clear();
        System.out.println("oli");
        for (ElementoCarrito a : this.sistema.getSelectedUser().getElementosCarrito()) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLElementoCarrito.fxml"));
                    Parent nodo = loader.load();

                    FXMLElementoCarritoController controller = loader.getController();
                    controller.setSistema(this.sistema);
                    
                    controller.cargarDatos(a.getAlimento().getNombre(), a.getEnvase(),a.getUnidades(), (a.getAlimento().getPrecio()*a.getUnidades()), a.getAlimento());
                    
                    controller.setController(this);
                    
                    this.VBoxElementosCarrito.getChildren().add(nodo);
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
    }
    
    @FXML
    public void volverHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInicio.fxml"));
            Parent root = loader.load();
            FXMLInicioController controlador = loader.getController();
            controlador.setSistema(this.sistema);
            Scene escena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
    
    @FXML
    public void misLogrosHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMisLogros.fxml"));
            Parent root = loader.load();
            FXMLMisLogrosController controlador = loader.getController();
            controlador.setSistema(this.sistema);
            Scene escena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    @FXML
    public void misRecibosHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMisRecibos.fxml"));
            Parent root = loader.load();
            FXMLMisRecibosController controlador = loader.getController();
            controlador.setSistema(this.sistema);
            Scene escena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

    @FXML
    public void misDireccionesHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLMisDirecciones.fxml"));
            Parent root = loader.load();
            FXMLMisDireccionesController controlador = loader.getController();
            controlador.setSistema(this.sistema);
            controlador.cargarDirecciones();
            Scene escena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}
