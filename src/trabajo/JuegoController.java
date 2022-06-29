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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Arley
 */
public class JuegoController implements Initializable {

    @FXML
    private Button piedra1;

    @FXML
    private Button Menu;

    @FXML
    private ImageView imagenpiedra;

    @FXML
    private Button papel1;

    @FXML
    private ImageView imagenpapel;

    @FXML
    private Button tijera1;

    @FXML
    private ImageView imagentijera;

    @FXML
    private Button Maquina;

    @FXML
    private Button Jugador;

    @FXML
    private Stage stage;
    @FXML
    private Usuario usuario;

    @FXML
    private Label nombreEnpantalla;

    @FXML
    private CienciasController controladorusuario2;
    @FXML
    private SocialesController controladorusuario3;
    @FXML
    private MatematicasController controladorusuario4;
    @FXML
    private InglesController controladorusuario5;

    @FXML

    int elecciojugador;
    int piedra = 1;
    int papel = 2;
    int tijera = 3;
    int puntosext = 0;
    
    
    
    int eleccionpc = (int) ((Math.random() * 3) + 1);

    @FXML
    private void opc1(ActionEvent event) {

        elecciojugador = piedra;
        colocarimagenes();

        if (elecciojugador == eleccionpc) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Piedra Papel o Tijeras");
            alert.setHeaderText("No obtuviste ni perdiste puntos");
            alert.setContentText("Empate");
            alert.showAndWait();
            puntosext = 0;

        } else {
            if (eleccionpc == 2) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Piedra Papel o Tijeras");
                alert.setHeaderText(" -20 Puntos");
                alert.setContentText("Has perdido :(");
                alert.showAndWait();
                puntosext = -20;

            } else {
                if (eleccionpc == 3) {

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Piedra Papel o Tijeras");
                    alert.setHeaderText("Obtuviste 50 puntos");
                    alert.setContentText("Has ganado :)");
                    alert.showAndWait();
                    puntosext = 50;

                }

            }

        }
        usuario.getPuntajes()[4] = puntosext;
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Piedra Papel o Tijera");
        alert.setHeaderText("Porfavor precione el boton de home para regresar el menu de cuestionarios");
        alert.setContentText("Juego terminado");
        alert.showAndWait();

    }

    @FXML
    private void opc2(ActionEvent event) {

        elecciojugador = papel;
        colocarimagenes();

        if (elecciojugador == eleccionpc) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Piedra Papel o Tijeras");
            alert.setHeaderText("No obtuviste ni perdiste puntos");
            alert.setContentText("Empate");
            alert.showAndWait();
            puntosext = 0;

        } else {
            if (eleccionpc == 3) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Piedra Papel o Tijeras");
                alert.setHeaderText(" -20 Puntos");
                alert.setContentText("Has perdido :(");
                alert.showAndWait();
                puntosext = -20;

            } else {
                if (eleccionpc == 1) {

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Piedra Papel o Tijeras");
                    alert.setHeaderText("Obtuviste 50 puntos");
                    alert.setContentText("Has ganado :)");
                    alert.showAndWait();
                    puntosext = 50;

                }

            }

        }
        usuario.getPuntajes()[4] = puntosext;
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Piedra Papel o Tijera");
        alert.setHeaderText("Porfavor precione el boton de home para regresar el menu de cuestionarios");
        alert.setContentText(" Juego terminado ");
        alert.showAndWait();
    }

    @FXML
    private void opc3(ActionEvent event) {

        elecciojugador = tijera;
        colocarimagenes();

        if (elecciojugador == eleccionpc) {

            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Piedra Papel o Tijeras");
            alert.setHeaderText("No obtuviste ni perdiste puntos");
            alert.setContentText("Empate");
            alert.showAndWait();
            puntosext = 0;

        } else {
            if (eleccionpc == 1) {

                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Piedra Papel o Tijeras");
                alert.setHeaderText(" -20 Puntos");
                alert.setContentText("Has perdido :(");
                alert.showAndWait();
                puntosext = -20;

            } else {
                if (eleccionpc == 2) {

                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Piedra Papel o Tijeras");
                    alert.setHeaderText("Obtuviste 50 puntos");
                    alert.setContentText("Has ganado :)");
                    alert.showAndWait();
                    puntosext = 50;
                }

            }

        }
        usuario.getPuntajes()[4] = puntosext;
          Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Piedra Papel o Tijera");
        alert.setHeaderText("Porfavor precione el boton de home para regresar el menu de cuestionarios");
        alert.setContentText("Juego Terminado");
        alert.showAndWait();

    }

    @FXML
    private void colocarimagenes() {

        if (eleccionpc == 1) {

            URL imgMaquina = getClass().getResource("iconos/piedra_1.png");
            Image imgnuevo1 = new Image(imgMaquina.toString(), 120, 100, false, true);
            Maquina.setGraphic(new ImageView(imgnuevo1));

        } else {

            if (eleccionpc == 2) {

                URL imgMaquina2 = getClass().getResource("iconos/papel_1.png");
                Image imgnuevo2 = new Image(imgMaquina2.toString(), 120, 100, false, true);
                Maquina.setGraphic(new ImageView(imgnuevo2));

            } else {
                if (eleccionpc == 3) {

                    URL imgMaquina3 = getClass().getResource("iconos/tijera_1.png");
                    Image imgnuevo3 = new Image(imgMaquina3.toString(), 120, 100, false, true);
                    Maquina.setGraphic(new ImageView(imgnuevo3));
                } else {

                }
            }

        }

        if (elecciojugador == 1) {

            URL imgJugador1 = getClass().getResource("iconos/piedra_1.png");
            Image img1 = new Image(imgJugador1.toString(), 120, 100, false, true);
            Jugador.setGraphic(new ImageView(img1));

        } else {

            if (elecciojugador == 2) {

                URL imgJugador2 = getClass().getResource("iconos/papel_1.png");
                Image img2 = new Image(imgJugador2.toString(), 120, 100, false, true);
                Jugador.setGraphic(new ImageView(img2));

            } else {
                if (elecciojugador == 3) {

                    URL imgJugador3 = getClass().getResource("iconos/tijera_1.png");
                    Image img3 = new Image(imgJugador3.toString(), 120, 100, false, true);
                    Jugador.setGraphic(new ImageView(img3));
                } else {

                }
            }

        }
        piedra1.setDisable(true);
        papel1.setDisable(true);
        tijera1.setDisable(true);
        Menu.setDisable(false);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Menu.setDisable(true);

    }

    public void closeWindows() {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Menu.fxml"));

            Parent root = loader.load();

            MenuController controlador = loader.getController();

            Scene scene = new Scene(root);
            Stage stage = new Stage();

            controlador.init(this.usuario, stage);

            stage.setScene(scene);
            stage.show();

            Stage myStage = (Stage) this.Maquina.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(JuegoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void Regresar(ActionEvent event) {

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

            controlador.init(this.usuario, stage);
            controlador.init(usuario, stage);

            // Asocio el stage con el scene
            stage.setScene(scene);
            stage.show();
            // Indico que debe hacer al cerrar

            // Cierro la ventana donde estoy
            Stage myStage = (Stage) this.Menu.getScene().getWindow();
            myStage.close();

        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @FXML
    void init(Usuario usuario, Stage stage, CienciasController cienciascontroller) {

        this.controladorusuario2 = cienciascontroller;
        this.stage = stage;
        this.usuario = usuario;

    }

    @FXML
    void init(Usuario usuario, Stage stage, SocialesController socialesController) {
        this.controladorusuario3 = socialesController;
        this.stage = stage;
        this.usuario = usuario;

    }

    @FXML
    void init(Usuario usuario, Stage stage, MatematicasController matematicasController) {
        this.controladorusuario4 = matematicasController;
        this.stage = stage;
        this.usuario = usuario;

    }

    @FXML
    void init(Usuario usuario, Stage stage, InglesController inglesController) {
        this.controladorusuario5 = inglesController;
        this.stage = stage;
        this.usuario = usuario;

    }

}
