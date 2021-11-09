/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author rmari
 */
public class SceneController {
    //manages scenes in each view
    //method to change a scene
    public void changeScene(Stage stage, Scene scene, String title){
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }
    
    
}
