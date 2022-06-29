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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;


/**
 * FXML Controller class
 *
 * @author Arley
 */
public class InglesController implements Initializable {

    @FXML
    private Label texto;
    @FXML
    private Label imagenlabel;
     @FXML
    private Label puntos;
    @FXML
    private Button boton1;
    @FXML
    private Button boton2;
    @FXML
    private Button boton3;
    @FXML
    private Button boton4;
    @FXML
    private Button piedrapapelotijera; 
    @FXML
    private Text Nombre;
    @FXML
    private Text nombreEnpantalla;

    @FXML
    private MenuController controllermenu;
    @FXML
    private InglesController controladorusuario2;
    @FXML
    private Stage stage;
    @FXML
    private Usuario usuario;

    @FXML
    public void init(Usuario usuario, Stage stage, MenuController UsuarioController) {
        nombreEnpantalla.setText(usuario.getNombre());
        this.controllermenu = UsuarioController;
        this.stage = stage;
        this.usuario = usuario;
    }

 @FXML
    static String textobase = "traduce,¿como te llamas?\twhat's your name?\tMy name is?\tHow are you? \tHellow ?"
            + "\n"
            + "¿Como se escribe mariposa en ingles?\tButterfly\tCaterpillar\tBird\tAnt"
            + "\n"
            + "¿Cual de estas es una prenda?\tScarf\tScar\tScare\tScarm"
            + "\n"
            + "Responde a la pregunta. How do you feel to day? :\tI am sick\tI want to go for a walk \tI feel like a plane \t I am a swimmig  "
             + "\n"
            + "Que palabra completa la siguiente frase: Today the sky has... \tStars\tCars\tStir\thouses";
 
    static String[] renglones4 = textobase.split("\n");
    static int cantpreguntas = renglones4.length;

    static String[][] preguntasbase4 = new String[cantpreguntas][5];

    String[] preguntaescogida;

    ArrayList<String> opciones = new ArrayList<>();
    int n_puntage = 0;
    int n_puntage2 = 0;
    int n_pregunta;
    
    String respuesta;
    String pregunta;
    String img;

    public void escogerpregunta(int n) {
        preguntaescogida = preguntasbase4[n];
        pregunta = preguntaescogida[0];
        respuesta = preguntaescogida[1];
        if (preguntaescogida.length > 5) {

        } else {
            img = "";
        }
        opciones.clear();
        for (int i = 1; i < 5; i++) {
            opciones.add(preguntaescogida[i]);
        }
        for (int i = 0; i < 4; i++) {
            Collections.shuffle(opciones);
        }
    }

    public void mostrarpregunta() {
        texto.setText(pregunta);
        boton1.setText(opciones.get(0));
        boton2.setText(opciones.get(1));
        boton3.setText(opciones.get(2));
        boton4.setText(opciones.get(3));
    }

    void escogerRespuesta(int n) {
        if (opciones.get(n).equals(respuesta)) {
            n_puntage = n_puntage + 10;
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Respuesta");
            alert.setHeaderText("Cabecera");
            alert.setContentText("Su respuesta es correcta");
            alert.showAndWait();
        } else {
            n_puntage2 = n_puntage2 - 5;
           

           
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Respuesta");
            alert.setHeaderText("Cabecera");
            alert.setContentText("Su respuesta incorrecta" + respuesta);
            alert.showAndWait();
        }

        /*
                Usuario
                    - Nombre: Arley
                    - Puntajes: [ 0, 0, 0, 0]

        Primer puntaje siempre es ciencia
         */
        usuario.getPuntajes()[3] = n_puntage + n_puntage2 ;
        int total = n_puntage + n_puntage2;
          puntos.setText("Puntos: " + total);
        jugar();
      
    }

    public void jugar() {
        if (n_pregunta == cantpreguntas) {
            int totalpuntos = n_puntage + n_puntage2;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Respuesta");
            alert.setHeaderText("Cabecera");
            alert.setContentText("el juego ha terminado, numero de puntos acumulados :" + totalpuntos);
            alert.showAndWait();
            piedrapapelotijera.setDisable(false);
            boton1.setDisable(true);
            boton2.setDisable(true);
            boton3.setDisable(true);
            boton4.setDisable(true);
        } else {
            escogerpregunta(n_pregunta);
            mostrarpregunta();
            n_pregunta++;
        }
    }

    @FXML
    private void Boton1(ActionEvent event) {

        escogerRespuesta(0);
    }

    @FXML
    private void Boton2(ActionEvent event) {

        escogerRespuesta(1);
    }

    @FXML
    private void Boton3(ActionEvent event) {

        escogerRespuesta(2);
    }

    @FXML
    private void Boton4(ActionEvent event) {

        escogerRespuesta(3);
    }
    
       @FXML
    private void MostrarVentana(ActionEvent event) {

        try {
            // Cargo la vista
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Juego.fxml"));

            // Cargo el padre
            Parent root = loader.load();

            // Obtengo el controlador
            JuegoController controlador = loader.getController();

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
            Stage myStage = (Stage) this.piedrapapelotijera.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InglesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public  void closeWindows() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

            Parent root = loader.load();

            MenuController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            controlador.init(this.usuario, stage);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.boton1.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(InglesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
          URL imgMaquina = getClass().getResource("iconos/juego.png");
            Image imgnuevo1 = new Image(imgMaquina.toString(), 64, 64, false, true);
            piedrapapelotijera.setGraphic(new ImageView(imgnuevo1));
            piedrapapelotijera.setDisable(true);


        jugar();
    }

}
