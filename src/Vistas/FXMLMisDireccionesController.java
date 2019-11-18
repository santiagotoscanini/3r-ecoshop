package Vistas;

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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLMisDireccionesController implements Initializable {

    private Sistema sistema;

    @FXML
    private JFXTextField txtDireccion;
    @FXML
    private VBox VBoxMisDirecciones;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void eliminarDireccion(String direccion) {
        if (this.sistema.getSelectedUser().getDirecciones().size() > 1) {
            this.sistema.getSelectedUser().removeDireccion(direccion);
            this.cargarDirecciones();
        }
    }

    public void setSistema(Sistema sis) {
        this.sistema = sis;
    }

    @FXML
    public void btnAddDireccion(ActionEvent event) {
        if (txtDireccion.getText().length() != 0 && !this.sistema.getSelectedUser().getDirecciones().contains(txtDireccion.getText())) {
            this.sistema.getSelectedUser().addDireccion(txtDireccion.getText());
            txtDireccion.setText("");
            this.cargarDirecciones();
        }
    }

    public void cargarDirecciones() {
        this.VBoxMisDirecciones.getChildren().clear();

        for (String direccion : this.sistema.getSelectedUser().getDirecciones()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLDireccion.fxml"));
                Parent nodo = loader.load();

                FXMLDireccionController controller = loader.getController();

                controller.setParentController(this);
                controller.setDireccion(direccion);

                this.VBoxMisDirecciones.getChildren().add(nodo);
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
    public void irAlCarritoHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLCarrito.fxml"));
            Parent root = loader.load();
            FXMLCarritoController controlador = loader.getController();
            controlador.setSistema(this.sistema);
            Scene escena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

}
