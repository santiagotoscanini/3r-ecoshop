package Vistas;

import Modelos.Alimento;
import Modelos.ElementoCarrito;
import Modelos.Factura;
import Modelos.Sistema;
import Modelos.Usuario;
import java.util.Date;
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
        sis.addUsuario(new Usuario("Maria Garcia", "49927391"));
        sis.setSelectedUser(sis.getRanking().get(0));

        sis.addAlimento(new Alimento("1kg de nueces", "nueces molidas para cocinar", 150, "Frutos Secos"));
        sis.addAlimento(new Alimento("15 ravioles", "ravioles hechos de harina, con salsa carusso", 270, "Especialidades"));

        sis.getSelectedUser().agregarElementoCarrito(new ElementoCarrito(sis.getAlimentos().get(0)));
        sis.getSelectedUser().agregarElementoCarrito(new ElementoCarrito(sis.getAlimentos().get(1)));
        sis.getSelectedUser().getElementosCarrito().get(1).setCompostable(false);
        sis.getSelectedUser().getElementosCarrito().get(1).setUnidades(4);
        
        sis.getSelectedUser().addDireccion("mi casa 233");
        sis.getSelectedUser().addDireccion("mi otra casita");

        sis.getSelectedUser().addFactura(new Factura(
                new Date(),
                true,
                sis.getSelectedUser().getElementosCarrito(),
                sis.getSelectedUser().getDirecciones().get(0),
                sis.getSelectedUser(),
                1230
        ));
        
        sis.getSelectedUser().addFactura(new Factura(
                new Date(),
                true,
                sis.getSelectedUser().getElementosCarrito(),
                sis.getSelectedUser().getDirecciones().get(0),
                sis.getSelectedUser(),
                1230
        ));
        
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
