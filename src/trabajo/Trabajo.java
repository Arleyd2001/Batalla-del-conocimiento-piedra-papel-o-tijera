/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package trabajo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static trabajo.CienciasController.preguntasbase;
import static trabajo.CienciasController.renglones;
import static trabajo.InglesController.preguntasbase4;
import static trabajo.InglesController.renglones4;
import static trabajo.MatematicasController.preguntasbase2;
import static trabajo.MatematicasController.renglones2;
import static trabajo.SocialesController.preguntasbase3;
import static trabajo.SocialesController.renglones3;


/**
 * @author Arley
 */
public class Trabajo extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Usuario.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < renglones.length; i++) {
            String renglon = renglones[i];
            preguntasbase[i] = renglon.split("\t");

        }
        
          for (int i = 0; i < renglones2.length; i++) {
            String renglon = renglones2[i];
            preguntasbase2[i] = renglon.split("\t");

        }
          
              for (int i = 0; i < renglones3.length; i++) {
            String renglon = renglones3[i];
            preguntasbase3[i] = renglon.split("\t");

        }
                  for (int i = 0; i < renglones4.length; i++) {
            String renglon = renglones4[i];
            preguntasbase4[i] = renglon.split("\t");

        }


        launch(args);
    }

}
