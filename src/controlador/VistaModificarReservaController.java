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


public class VistaModificarReservaController implements Initializable {
// ID de los botones que existen el en fxml
    @FXML
    private Button op4b1;

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
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaSolicitud.fxml"));//se obtiene el archivo fxml del menú al que se enlazó la ventana
            Parent root =loader.load();
            
           VistaSolicitudController controlador = loader.getController();//se obtiene el controlador del menú al que se enlazó la ventana
            
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           Stage myStage = (Stage) this.op4b1.getScene().getWindow();//no se coloca close window ya que no es necesario
           myStage.close();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaSolicitudController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }

    
    
    //Creacion de metodos que contienen las acciones de los botones
    @FXML
    private void clickGuardar(ActionEvent event) {
    }
    
}
