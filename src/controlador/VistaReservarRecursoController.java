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


public class VistaReservarRecursoController implements Initializable {
// ID de los botones que existen el en fxml
    @FXML
    private Button op4a1;

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
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaSolicitud.fxml"));//se obtiene la ruta del archivo fxml del menú al que se enlazó la ventana
            Parent root =loader.load();
            
           VistaSolicitudController controlador = loader.getController();//se obtiene el controlador del menú al que se enlazó el archivo
            
           Scene scene = new Scene(root);
           Stage stage = new Stage();
           stage.setScene(scene);
           stage.show();
           Stage myStage = (Stage) this.op4a1.getScene().getWindow();//se designa un boton para terminar la acción
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaSolicitudController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }

       //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void ClickGuardar(ActionEvent event) {
    }
    
}
