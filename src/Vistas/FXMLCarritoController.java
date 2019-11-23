package Vistas;

import Modelos.Alimento;
import Modelos.ElementoCarrito;
import Modelos.Factura;
import Modelos.Sistema;
import Modelos.Usuario;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTimePicker;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
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

    public void setSistema(Sistema sis) {
        this.sistema = sis;
        for (String direccion : sis.getSelectedUser().getDirecciones()) {
            list.add(direccion);
        }
        cBoxDirecciones.setItems(list);
    }

    @FXML
    private ComboBox<String> cBoxDirecciones;

    ObservableList<String> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

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
        System.out.println("oli");
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
        //if (this.sistema.getSelectedUser().getElementosCarrito().size() > 0 && this.sistema.getSelectedUser().getDirecciones().size() > 0) {
            //if (!(reloj.getValue().toString().equals("null")) && !(calendario.getValue().toString().equals("null")) && !(cBoxDirecciones.getValue().equals("null"))) {
                try {
                    String strFechaSeleccionada = calendario.getValue().toString() + " " + reloj.getValue().toString();
                    //System.out.println(strFechaSeleccionada);
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

                        for (ElementoCarrito elem : this.sistema.getSelectedUser().getElementosCarrito()) {
                            this.sistema.addCantidadAlimento(elem.getAlimento().getId(), elem.getUnidades());
                        }

                        this.sistema.getSelectedUser().addFactura(factura);
                        System.out.println(this.sistema.getSelectedUser().getFacturas().size());
                    } else{
                        System.out.println("Antes de ahroa no");
                    }
                } catch (ParseException e) {
                    System.out.println(e);
                }
          //  }
        //}
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
