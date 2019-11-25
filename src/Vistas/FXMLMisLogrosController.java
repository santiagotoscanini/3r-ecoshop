package Vistas;

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
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLMisLogrosController implements Initializable {

    private Sistema sistema;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void setSistema(Sistema sis) {
        this.sistema = sis;
        cargarEstadisticas();
        cargarRanking();
    }

    @FXML
    private VBox VBoxRanking;

    @FXML
    private Label lblKgBasura;

    @FXML
    private Label lblEnvasesReutilizados;

    @FXML
    private Label lblEnvasesCompostados;

    @FXML
    private Label lblTotalDeCompras;

    private int[] cantEnvReuAndComp() {
        int cantEnvReu = 0;
        int cantEnvComp = 0;
        for (int i = 0; i < this.sistema.getSelectedUser().getFacturas().size(); i++) {
            for (ElementoCarrito producto : this.sistema.getSelectedUser().getFacturas().get(i).getProductos()) {
                if (producto.getCompostable()) {
                    cantEnvComp += producto.getUnidades();
                } else {
                    cantEnvReu += producto.getUnidades();
                }
            }
        }
        int cantEnv[] = {cantEnvReu, cantEnvComp};
        return cantEnv;
    }

    public void cargarEstadisticas() {
        int[] cantEnv = this.cantEnvReuAndComp();
        lblKgBasura.setText(Double.toString((double) cantEnv[0] * this.sistema.getCantKilos()));
        lblEnvasesReutilizados.setText(Integer.toString(cantEnv[0]));
        lblEnvasesCompostados.setText(Integer.toString(cantEnv[1]));
        lblTotalDeCompras.setText(Integer.toString(sistema.getSelectedUser().getFacturas().size()));
    }

    public void cargarRanking() {
        this.VBoxRanking.getChildren().clear();
        int i = 1;
        for (Usuario usuario : this.sistema.getRanking()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLUsuario.fxml"));
                Parent nodo = loader.load();

                FXMLUsuarioController controller = loader.getController();

                controller.cargarDatos(usuario.getNombre(), i, usuario.getPuntos());

                this.VBoxRanking.getChildren().add(nodo);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
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
