/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Modelos.Alimento;
import Modelos.Sistema;
import com.jfoenix.controls.JFXTextField;
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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Santi
 */
public class FXMLFrutosSecosController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Sistema sistema;

    @FXML
    private VBox VBoxFrutosSecos;
    @FXML
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtDescripcion;
    @FXML
    private JFXTextField txtPrecio;
    @FXML
    private Label lblErrorNombre;
    @FXML
    private Label lblErrorDesc;
    @FXML
    private Label lblErrorPrecio;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setSistema(Sistema sis) {
        this.sistema = sis;
        this.lblErrorPrecio.setText("");
        this.lblErrorDesc.setText("");
        this.lblErrorNombre.setText("");
    }

    public void cargarAlimentos() {

        this.VBoxFrutosSecos.getChildren().clear();

        for (Alimento a : this.sistema.getAlimentos()) {
            if (a.getCategoria().equals("Frutos Secos")) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAlimentoFrutosSecos.fxml"));
                    Parent nodo = loader.load();

                    FXMLAlimentoFrutosSecosController controller = loader.getController();
                    controller.cargarDatos(a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getId());
                    controller.setSistema(this.sistema);
                    controller.setController(this);

                    this.VBoxFrutosSecos.getChildren().add(nodo);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }

    @FXML
    public void addAlimento(ActionEvent event) {
        String nombre = this.txtNombre.getText();
        String descripcion = this.txtDescripcion.getText();
        String precio = this.txtPrecio.getText();

        if (nombre.length() == 0) {
            this.lblErrorNombre.setText("Error, nombre vacio");
        } else {
            this.lblErrorNombre.setText("");
        }
        if (descripcion.length() == 0) {
            this.lblErrorDesc.setText("Error, descripcion vacia");
        } else {
            this.lblErrorDesc.setText("");
        }
        if (precio.length() == 0) {
            this.lblErrorPrecio.setText("Error, precio vacio");
        } else {
            if (!isNumeric(precio)) {
                this.lblErrorPrecio.setText("Error, precio no numerico");
            } else {
                this.lblErrorPrecio.setText("");
            }
        }

        if (nombre.length() != 0 && descripcion.length() != 0 && precio.length() != 0 && isNumeric(precio)) {
            this.sistema.addAlimento(new Alimento(nombre, descripcion, Integer.parseInt(precio), "Frutos Secos"));
            this.cargarAlimentos();
            this.txtDescripcion.setText("");
            this.txtNombre.setText("");
            this.txtPrecio.setText("");
            this.lblErrorPrecio.setText("");
            this.lblErrorDesc.setText("");
            this.lblErrorNombre.setText("");
        }
    }

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
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
    public void irAlCarritoHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLCarrito.fxml"));
            Parent root = loader.load();
            FXMLCarritoController controlador = loader.getController();

            controlador.setSistema(this.sistema);
            controlador.cargarElementos();

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
