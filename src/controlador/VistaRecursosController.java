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


public class VistaRecursosController implements Initializable {
// ID de los botones que existen el en fxml
    @FXML
    private Button op3a;
    @FXML
    private Button op3b;
    @FXML
    private Button op3c;
    @FXML
    private Button op3Cancelar;

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
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/Menuprincipal.fxml"));//se obtiene el archivo fxml del menú al que se enlazó la ventana
            Parent root =loader.load();
            
           MenuprincipalController controlador = loader.getController();//se obtiene el controlador del menú al que se enlazó el archivo
            
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           Stage myStage = (Stage) this.op3Cancelar.getScene().getWindow();//no se coloca close window ya que no es necesario
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(MenuprincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
//Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void ClickCrear(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaCrearCurso.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaCrearCursoController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op3a.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaRecursosController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickActualizar(ActionEvent event) {
          try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaModificarRecurso.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaModificarRecursoController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op3b.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaRecursosController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    //Metodo creado al declarar la acción que realiza el boton correspondiente
    @FXML
    private void clickInactivar(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader (getClass().getResource("/vista/vistaActivarRecurso.fxml"));//se establece ruta del fxml de la venta que se desea desencadenar
            Parent root =loader.load();
            
            VistaActivarRecursoController controlador = loader.getController();//se obtiene el controlador de la ventana que se quiere conectar
            
           Scene scene = new Scene(root);//creación escena
           Stage stage = new Stage();//creación stage
           stage.setScene(scene);
           stage.show();
           stage.setOnCloseRequest(e -> controlador.closeWindows());//esta linea de codigo sirve para que al momento que se cierre la ventana que se está enlazando, esta regresa a este punto
           Stage myStage = (Stage) this.op3c.getScene().getWindow();
           myStage.close();
           
            
           
        } catch (IOException ex) {
            Logger.getLogger(VistaRecursosController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    @FXML
    private void clickCancelar(ActionEvent event) {
    }
    
}
