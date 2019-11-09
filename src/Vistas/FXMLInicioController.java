package Vistas;

import static javafx.application.Application.launch;

import Modelos.Sistema;
import java.awt.event.MouseEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class FXMLInicioController extends Application {
    
    
    private static Sistema sistema;
    
    public static void main(String[] args) {
        sistema = new Sistema();
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLInicio.fxml"));
        Scene scene = new Scene(root);
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @FXML
    public void misDireccionesHandleClick(ActionEvent event){
        System.out.println("mis direcciones");
    }
    
    @FXML
    public void misBoletasHandleClick(ActionEvent event){
        System.out.println("mis boletas");
    }
    
    @FXML
    public void misLogrosHandleClick(ActionEvent event){
        System.out.println("mis logros");
    }
}
