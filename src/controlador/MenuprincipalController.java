
package controlador;
//importación de paquetes
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MenuprincipalController implements Initializable {
    
// ID de //los botones que existen el en fxml
    @FXML
    private Button op1;
    @FXML
    private Button op2;
    @FXML
    private Button op3;
    @FXML
    private Button op4;
    @FXML
    private Text op0;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
 //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickOrganizacion(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/gestionOrganización.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            GestionOrganizaciónController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//se crea una escena
           Stage stage = new Stage();//se crea un stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op1.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
    
    
 //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickUsuario(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaUsuarios.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaUsuariosController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);// se crea una escena
           Stage stage = new Stage();//se crea un stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op2.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    
    
    
    //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickRecursos(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaRecursos.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaRecursosController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//se crea una escena
           Stage stage = new Stage();//se crea un stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op3.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    
    //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickSolicitud(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaSolicitud.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaSolicitudController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//se crea escena
           Stage stage = new Stage();//se crea stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op4.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    
}
