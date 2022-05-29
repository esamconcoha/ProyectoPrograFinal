//importación de paquetes
package controlador;

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
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class GestionOrganizaciónController implements Initializable {

    // ID de los botones que existen el en fxml
    @FXML
    private Button op1a;
    @FXML
    private Button op1b;
    @FXML
    private Button op1c;
    @FXML
    private Button op1Cancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    //se crea este metodo para la funcionalidad de cerrar una ventana y regresar al menú anterior, esto se enlaza con el menú al que se enlazó este archivo
    public void closeWindows(){
         try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/Menuprincipal.fxml"));//se obtiene la ruta del archivo fxml del menú al que se enlazó la ventana
            Parent root =loader.load();
            
           MenuprincipalController controlador = loader.getController();//se obtiene el controlador del menú al que se enlazó el archivo
            
           Scene scene = new Scene(root);//se crea escena
           Stage stage = new Stage();//se crea stage
           stage.setScene(scene);
           stage.show();
           Stage myStage = (Stage) this.op1Cancelar.getScene().getWindow();//se designa un boton para terminar la acción
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
    
    
 //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickCrear(ActionEvent event) {
           try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaCrearOrganización.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaCrearOrganizaciónController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);// se crea escena
           Stage stage = new Stage();//se crea stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op1a.getScene().getWindow();//se designa un boton para terminar la acción
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(GestionOrganizaciónController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

     //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickModificar(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaModificarOrganizacion.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaModificarOrganizacionController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//se crea escena
           Stage stage = new Stage();//se crea stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op1b.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(GestionOrganizaciónController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

     //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickActivar(ActionEvent event) {
         try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaActivarOrganizacion.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaActivarOrganizacionController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//se crea escena
           Stage stage = new Stage();//se crea stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op1c.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(GestionOrganizaciónController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @FXML
    private void clickCancelar(ActionEvent event) {
    }
    
    
}
