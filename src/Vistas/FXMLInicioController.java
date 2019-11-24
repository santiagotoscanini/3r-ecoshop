package Vistas;

import Modelos.Alimento;
import Modelos.Sistema;
import Modelos.Sucursal;
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

    @FXML
    private VBox VBoxPuntosDeVenta;
    @FXML
    private JFXTextField txtDireccion;
    @FXML
    private JFXTextField txtTelefono;

    private Sistema sistema;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }

    @FXML
    public void agregarPuntoDeVenta() {

        String direccion = this.txtDireccion.getText();

        if (direccion.length() != 0 && isNumeric(this.txtTelefono.getText()) && this.txtTelefono.getText().length() < 10) {
            int telefono = Integer.parseInt(this.txtTelefono.getText());
            this.sistema.addSucursal(new Sucursal(direccion, telefono));
            this.cargarPuntosDeVenta();
            this.txtDireccion.setText("");
            this.txtTelefono.setText("");
        }
    }

    public void eliminarSucursal(int id) {
        this.sistema.eliminarSucursalPorId(id);
        this.cargarPuntosDeVenta();
    }

    public static boolean isNumeric(String strNum) {
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }

    public void setSistema(Sistema sis) {
        this.sistema = sis;

        //Formulario lateral
        lblNombreUsuario.setText(this.sistema.getSelectedUser().getNombre());

        this.cargarEstadisticas();
        this.cargarMasVendidos();
        this.cargarPuntosDeVenta();

    }

    public void cargarPuntosDeVenta() {
        this.VBoxPuntosDeVenta.getChildren().clear();

        for (Sucursal suc : this.sistema.getSucursales()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLSucursal.fxml"));
                Parent nodo = loader.load();

                FXMLSucursalController controller = loader.getController();

                controller.setParentController(this);
                controller.cargarDatos(suc.getId(), suc.getDireccion(), suc.getTelefono());

                this.VBoxPuntosDeVenta.getChildren().add(nodo);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public void cargarEstadisticas() {
        lblKgBasura.setText(Double.toString((double) this.sistema.getCantEnvReu() * this.sistema.getCantKilos()));
        lblEnvasesReutilizados.setText(Integer.toString(this.sistema.getCantEnvReu()));
        lblEnvasesCompostados.setText(Integer.toString(this.sistema.getCantEnvComp()));
        lblTotalDeVentas.setText(Integer.toString(this.sistema.getCantEnvReu() + this.sistema.getCantEnvComp()));
    }

    public void cargarMasVendidos() {
        this.VBoxMasVendidos.getChildren().clear();

        for (Alimento alimento : this.sistema.getMasVendidos()) {
            try {
                if (alimento.getCategoria().equals("Frutos Secos")) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAlimentoFrutosSecos.fxml"));
                    Parent nodo = loader.load();
                    FXMLAlimentoFrutosSecosController controller = loader.getController();
                    controller.setSistema(this.sistema);
                    controller.cargarDatos(alimento.getNombre(), alimento.getDescripcion(), alimento.getPrecio(), alimento.getId());
                    this.VBoxMasVendidos.getChildren().add(nodo);
                } else if (alimento.getCategoria().equals("Especialidades")) {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAlimentoEspecialidades.fxml"));
                    Parent nodo = loader.load();
                    FXMLAlimentoEspecialidadesController controller = loader.getController();
                    controller.setSistema(this.sistema);
                    controller.cargarDatos(alimento.getNombre(), alimento.getDescripcion(), alimento.getPrecio(), alimento.getId());
                    this.VBoxMasVendidos.getChildren().add(nodo);
                } else {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAlimentoFrutas.fxml"));
                    Parent nodo = loader.load();
                    FXMLAlimentoFrutasController controller = loader.getController();
                    controller.setSistema(this.sistema);
                    controller.cargarDatos(alimento.getNombre(), alimento.getDescripcion(), alimento.getPrecio(), alimento.getId());
                    this.VBoxMasVendidos.getChildren().add(nodo);
                }

            } catch (IOException e) {
                System.out.println(e);
            }
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
            controlador.cargarDatos();
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
            System.out.println(ex);
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
            System.out.println(ex);
        }
    }

    @FXML
    public void frutosSecosHandleClick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLFrutosSecos.fxml"));
            Parent root = loader.load();
            FXMLFrutosSecosController controlador = loader.getController();
            controlador.setSistema(this.sistema);
            controlador.cargarAlimentos();
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
            controlador.cargarAlimentos();

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
            controlador.cargarAlimentos();

            Scene escena = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(escena);
            stage.show();
        } catch (IOException ex) {
            System.out.println("error");
        }
    }
}
