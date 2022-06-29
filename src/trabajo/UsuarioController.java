/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package trabajo;

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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arley
 */
public class UsuarioController implements Initializable {
 
    @FXML
    private TextField Nombre;
    @FXML
    private Button aceptar;
    @FXML
    private Text Nombrejugador;
    @FXML
    private ImageView imagenusuario;

         @FXML
    private void Nombredejugador (ActionEvent event) {
        
        
        
             try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            MenuController controlador = loader.getController();
            
           
            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            
            Usuario usuario = new Usuario(Nombre.getText());
             controlador.init(usuario, stage);

            // Asocio el stage con el scene
            stage.setScene(scene);
            stage.show();
          
            // Cierro la ventana donde estoy
            Stage myStage = (Stage) this.aceptar.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    
    
}
