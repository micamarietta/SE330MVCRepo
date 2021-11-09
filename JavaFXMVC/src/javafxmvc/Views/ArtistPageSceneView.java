/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Views;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafxmvc.Controllers.BandController;
import javafxmvc.Controllers.SceneController;
import javafxmvc.Models.BandModel_1;

/**
 *
 * @author rmari
 */
public class ArtistPageSceneView {
    
    public void startScene(Stage primaryStage){
    //creates the scene for the artist page
    //displays band info
    //displays song list
    //displays song information
        SceneController sceneControl = new SceneController();
        
        ListView songList = new ListView(); 
        
        Label songlistLabel = new Label("  Songs by ");   

        //create vbox for the songList
        VBox songListVbox = new VBox(songlistLabel, songList);
        
        Scene artistPageScene = new Scene(songListVbox, 600, 400);
        sceneControl.changeScene(primaryStage, artistPageScene, "Artist Page");
        
        
    }
   
    
    
}
