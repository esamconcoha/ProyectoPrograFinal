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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Elí
 */
public class VistaSolicitudController implements Initializable {
 // ID de los botones que existen el en fxml
    @FXML
    private Button op4a;
    @FXML
    private Button op4b;
    @FXML
    private Button op4Cancelar;

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
            
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           Stage myStage = (Stage) this.op4Cancelar.getScene().getWindow();//se designa un boton para terminar la acción
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
     

     
      //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickReservar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaReservarRecurso.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaReservarRecursoController controlador = loader.getController();
            //se obtiene el controlador de la ventana que se quiere conectar
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());
           Stage myStage = (Stage) this.op4a.getScene().getWindow();//se designa un boton para terminar la acción
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaSolicitudController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

     //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickModificar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaModificarReserva.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaModificarReservaController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//creación de escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());
           Stage myStage = (Stage) this.op4b.getScene().getWindow();//se designa un boton para terminar la acción
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaSolicitudController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @FXML
    private void clickCancelar(ActionEvent event) {
    }
    
}
