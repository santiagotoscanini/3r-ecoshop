package Vistas;

import static javafx.application.Application.launch;

import Modelos.Sistema;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.application.Application;
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

public class FXMLInicioController implements Initializable {

    @FXML
    private Label lblNombreUsuario;
    @FXML
    private Label lblKgBasura;
    @FXML
    private Label lblEnvasesReutilizados;
    @FXML
    private Label lblEnvasesCompostados;
    @FXML
    private Label lblTotalDeVentas;

    @FXML
    private VBox VBoxMasVendidos;

    private Sistema sistema;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    public void cargarMasVendidos() {
        this.VBoxMasVendidos.getChildren().clear();

        for (int i = 0; i < 10; i++) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAlimento.fxml"));
                Parent nodo = loader.load();
                
                FXMLAlimentoController controller = loader.getController();
                
                
                this.VBoxMasVendidos.getChildren().add(nodo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void setSistema(Sistema sis) {
        this.sistema = sis;

        lblNombreUsuario.setText(this.sistema.getSelectedUser().getNombre());

        lblKgBasura.setText(Double.toString((double) this.sistema.getCantEnvReu() * this.sistema.getCantKilos()));
        lblEnvasesReutilizados.setText(Integer.toString(this.sistema.getCantEnvReu()));
        lblEnvasesCompostados.setText(Integer.toString(this.sistema.getCantEnvComp()));
        lblTotalDeVentas.setText(Integer.toString(this.sistema.getCantEnvReu() + this.sistema.getCantEnvComp()));
        
        cargarMasVendidos();
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

    @FXML
    public void frutosSecosHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLFrutosSecos.fxml"));
            Parent root = loader.load();
            FXMLFrutosSecosController controlador = loader.getController();
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
    public void especialidadesHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLEspecialidades.fxml"));
            Parent root = loader.load();
            FXMLEspecialidadesController controlador = loader.getController();
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
    public void frutasCongeladasHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLFrutasCongeladas.fxml"));
            Parent root = loader.load();
            FXMLFrutasCongeladasController controlador = loader.getController();
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
