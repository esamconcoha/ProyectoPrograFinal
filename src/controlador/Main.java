
package controlador;


//importación de paquetes
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



    public class Main extends Application{//se crea la clase abstracta

    public static void main(String[] args) {
        launch (args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       
        try {
         FXMLLoader loader = new FXMLLoader ();//creacion de FXMLLoader
         loader.setLocation (Main.class.getResource("/vista/Menuprincipal.fxml"));//se establece la ruta del archivo fxml que se quiere mostrar
         Pane ventana = (Pane) loader.load ();
         Scene scene  = new Scene (ventana);//se crea la escena
         
         stage.setResizable(false);
         stage.setScene (scene);
         stage.show();
        } catch (IOException e){
            System.out.println (e.getMessage());
        }
    }
}
