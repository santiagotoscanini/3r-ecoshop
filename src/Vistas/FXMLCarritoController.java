package Vistas;

import Modelos.ElementoCarrito;
import Modelos.Factura;
import Modelos.Sistema;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLCarritoController implements Initializable {

    private Sistema sistema;
    @FXML
    private Label lblErrorFecha;
    @FXML
    private Label lblErrorHora;
    @FXML
    private Label lblErrorCarrito;
    @FXML
    private ComboBox<String> cBoxDirecciones;
    @FXML
    private JFXDatePicker calendario;
    @FXML
    private JFXTimePicker reloj;

    @FXML
    private Label lblMontoTotal;

    @FXML
    private VBox VBoxElementosCarrito;

    @FXML
    private CheckBox efectivoBox;

    @FXML
    private CheckBox tarjetaBox;

    public void setSistema(Sistema sis) {
        this.sistema = sis;
        for (String direccion : sis.getSelectedUser().getDirecciones()) {
            list.add(direccion);
        }
        cBoxDirecciones.setItems(list);
        cBoxDirecciones.getSelectionModel().selectFirst();
        this.cargarElementos();
        this.lblErrorFecha.setVisible(false);
        this.lblErrorHora.setVisible(false);
        this.lblErrorCarrito.setVisible(false);
    }

    ObservableList<String> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleEfectivoBox() {
        if (efectivoBox.isSelected()) {
            tarjetaBox.setSelected(false);
        } else {
            efectivoBox.setSelected(true);
        }
    }

    @FXML
    private void handleTarjetaBox() {
        if (tarjetaBox.isSelected()) {
            efectivoBox.setSelected(false);
        } else {
            tarjetaBox.setSelected(true);
        }
    }

    public void cargarElementos() {

        this.VBoxElementosCarrito.getChildren().clear();
        int montoTotal = 0;
        for (ElementoCarrito a : this.sistema.getSelectedUser().getElementosCarrito()) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLElementoCarrito.fxml"));
                Parent nodo = loader.load();

                FXMLElementoCarritoController controller = loader.getController();
                controller.setSistema(this.sistema);
                controller.cargarDatos(a.getAlimento().getNombre(), a.getCompostable(), a.getUnidades(), (a.getAlimento().getPrecio()), a.getAlimento(), a);
                controller.setController(this);

                this.VBoxElementosCarrito.getChildren().add(nodo);
                montoTotal = montoTotal + (a.getAlimento().getPrecio() * a.getUnidades());
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        this.lblMontoTotal.setText(Integer.toString(montoTotal));
    }

    @FXML
    public void comprarHandleClick(ActionEvent event) {
        if (this.sistema.getSelectedUser().getElementosCarrito().size() > 0) {
            if (reloj.getValue() == null) {
                this.lblErrorHora.setText("Error, seleccione una hora");
                this.lblErrorHora.setVisible(true);
            }else{
                this.lblErrorHora.setVisible(false);
            }
            if (calendario.getValue() == null) {
                this.lblErrorFecha.setText("Error, seleccione una fecha");
                this.lblErrorFecha.setVisible(true);
            }else{
                this.lblErrorFecha.setVisible(false);
            }
            if (reloj.getValue() != null && calendario.getValue() != null) {
                try {
                    String strFechaSeleccionada = calendario.getValue().toString() + " " + reloj.getValue().toString();
                    Date fechaSeleccionada = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(strFechaSeleccionada);

                    if (fechaSeleccionada.compareTo(new Date()) == 1) {

                        Factura factura = new Factura(
                                fechaSeleccionada,
                                this.tarjetaBox.isSelected(),
                                this.sistema.getSelectedUser().getElementosCarrito(),
                                cBoxDirecciones.getValue(),
                                this.sistema.getSelectedUser(),
                                Integer.parseInt(this.lblMontoTotal.getText())
                        );
                        
                        int puntos = 0;

                        for (ElementoCarrito elem : this.sistema.getSelectedUser().getElementosCarrito()) {
                            puntos += elem.getUnidades();
                            this.sistema.addCantidadAlimento(elem.getAlimento().getId(), elem.getUnidades());
                        }
                        
                        this.sistema.getSelectedUser().addFactura(factura);
                        this.sistema.getSelectedUser().sumarPuntos(puntos);
                        this.lblErrorFecha.setVisible(false);
                        this.lblErrorHora.setVisible(false);
                        this.lblErrorCarrito.setVisible(false);
                        this.sistema.getSelectedUser().resetearCarrito();
                        this.cargarElementos();
                    } else {
                        this.lblErrorFecha.setText("Error, fecha anterior a hoy");
                        this.lblErrorFecha.setVisible(true);
                    }
                } catch (ParseException e) {
                    System.out.println(e);
                }
            }
        } else {
            this.lblErrorCarrito.setText("Error, no tiene elementos para comprar");
            this.lblErrorCarrito.setVisible(true);
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
            System.out.println("error");
        }
    }

}
