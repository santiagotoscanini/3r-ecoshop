package Vistas;

import Modelos.Sistema;
import Modelos.Usuario;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Sistema sis;

    public static void main(String[] args) {
        sis = new Sistema();
        //Valores iniciales al sistema
        sis.addUsuario(new Usuario("Maria Garcia","49927391"));
        sis.setSelectedUser(sis.getRanking().get(0));
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setResizable(false);
        primaryStage.setTitle("EcoFood");

        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLInicio.fxml"));
        Parent root = loader.load();
        FXMLInicioController controlador = loader.getController();
        controlador.setSistema(sis);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
