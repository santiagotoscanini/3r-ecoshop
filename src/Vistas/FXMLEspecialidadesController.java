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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXMLEspecialidadesController implements Initializable {

    Sistema sistema;

    @FXML
    private VBox VBoxEspecialidades;
    @FXML
    private JFXTextField txtNombre;
    @FXML
    private JFXTextField txtDescripcion;
    @FXML
    private JFXTextField txtPrecio;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void setSistema(Sistema sis) {
        this.sistema = sis;
    }
    
    public void cargarAlimentos() {

        this.VBoxEspecialidades.getChildren().clear();

        for (Alimento a : this.sistema.getAlimentos()) {
            if (a.getCategoria().equals("Especialidades")) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLAlimentoEspecialidades.fxml"));
                    Parent nodo = loader.load();

                    FXMLAlimentoEspecialidadesController controller = loader.getController();
                    controller.cargarDatos(a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getId());
                    controller.setSistema(this.sistema);
                    controller.setController(this);
                    
                    this.VBoxEspecialidades.getChildren().add(nodo);
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

        if (nombre.length() != 0 && descripcion.length() != 0 && precio.length() != 0 && isNumeric(precio)) {
            Alimento nuevoAlimento = new Alimento(nombre, descripcion, Integer.parseInt(precio), "Especialidades");
            this.sistema.addAlimento(nuevoAlimento);
            this.cargarAlimentos();
            this.txtDescripcion.setText("");
            this.txtNombre.setText("");
            this.txtPrecio.setText("");
            System.out.println(nuevoAlimento.getId()+"add alimento");
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
