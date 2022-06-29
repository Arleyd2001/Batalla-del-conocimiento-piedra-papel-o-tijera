/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package trabajo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Arley
 */
public class MenuController implements Initializable {

   
    @FXML
    private Button btnAtomo;

    @FXML
    private ImageView imagenview1;

    @FXML
    private Button Botton2;

    @FXML
    private ImageView imagenview2;

    @FXML
    private Button Botton3;

    @FXML
    private ImageView imagenview3;

    @FXML
    private Button Botton4;

    @FXML
    private ImageView imagenview4;

    @FXML
    private Text Nombre;

    @FXML
    private Label importnombre;

    @FXML
    private Text Nombre1;

    @FXML
    private Label puntajeCiencia;

    @FXML
    private Text Nombre2;

    @FXML
    private Text Nombre3;

    @FXML
    private Text Nombre4;

    @FXML
    private Label PuntosCiencias;

    @FXML
    private Label PuntosSociales;

    @FXML
    private Label puntosmatematicas;

    @FXML
    private Label puntosingles; 
    
     @FXML
    private CienciasController controladorusuario2;
    @FXML
    private Stage stage;
    @FXML
    private Usuario usuario;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    public void init(Usuario usuario, Stage stage) {
        this.stage = stage;
        this.usuario = usuario;

        importnombre.setText(usuario.getNombre());
        if (usuario.getPuntajes()[0] == 0) {
            this.PuntosCiencias.setText("0");
        } else {
            this.PuntosCiencias.setText(String.valueOf(usuario.getPuntajes()[0] + usuario.getPuntajes()[4]));
        }
        
        if (usuario.getPuntajes()[1] == 0) {
            this.puntosmatematicas.setText("0");
        } else {
            this.puntosmatematicas.setText(String.valueOf(usuario.getPuntajes()[1] + usuario.getPuntajes()[4]));
        }

        if (usuario.getPuntajes()[2] == 0) {
            this.PuntosSociales.setText("0");
        } else {
            this.PuntosSociales.setText(String.valueOf(usuario.getPuntajes()[2] + usuario.getPuntajes()[4]));
        }
        if (usuario.getPuntajes()[3] == 0) {
            this.puntosingles.setText("0");
        } else {
            this.puntosingles.setText(String.valueOf(usuario.getPuntajes()[3] + usuario.getPuntajes()[4]));
        }
    }

    @FXML
    private void MostrarVentanaCiencias(ActionEvent event) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ciencias.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            CienciasController controlador = loader.getController();

            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            // Asocio el stage con el scene
            controlador.init(this.usuario, stage, this);
            stage.setScene(scene);
            stage.show();
            // Indico que debe hacer al cerrar
            stage.setOnCloseRequest(e -> controlador.closeWindows());

            // Cierro la ventana donde estoy
            Stage myStage = (Stage) this.btnAtomo.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void MostrarVentanaSociales(ActionEvent event) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Sociales.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            SocialesController controlador = loader.getController();

            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            // Asocio el stage con el scene
            controlador.init(this.usuario, stage, this);
            stage.setScene(scene);
            stage.show();
            // Indico que debe hacer al cerrar
            stage.setOnCloseRequest(e -> controlador.closeWindows());

            // Cierro la ventana donde estoy
            Stage myStage = (Stage) this.Botton3.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void MostrarVentanaMatematicas(ActionEvent event) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Matematicas.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            MatematicasController controlador = loader.getController();

            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            // Asocio el stage con el scene
            controlador.init(this.usuario, stage, this);
            stage.setScene(scene);
            stage.show();
            // Indico que debe hacer al cerrar
            stage.setOnCloseRequest(e -> controlador.closeWindows());

            // Cierro la ventana donde estoy
            Stage myStage = (Stage) this.Botton2.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void MostrarVentanaIngles(ActionEvent event) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Ingles.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            InglesController controlador = loader.getController();

            // Creo la scene y el stage
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            // Asocio el stage con el scene
            controlador.init(this.usuario, stage, this);
            stage.setScene(scene);
            stage.show();
            // Indico que debe hacer al cerrar
            stage.setOnCloseRequest(e -> controlador.closeWindows());

            // Cierro la ventana donde estoy
            Stage myStage = (Stage) this.Botton4.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
