/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Views;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import javafxmvc.Views.MainSceneView;

/**
 *
 * @author rmari
 */
public class ArtistPageSceneView {
    
    BandModel_1 bandSelected;
    
    //ctor
    ArtistPageSceneView(BandModel_1 band){
        bandSelected = band;
        System.out.println("Band is: " + band);
    }
    
    public void startScene(Stage primaryStage){
    //creates the scene for the artist page
    //displays band info
    //displays song list
    //displays song information
        SceneController sceneControl = new SceneController();
        MainSceneView mainScene = new MainSceneView();
        
        ListView songList = new ListView(); 
        System.out.println("Band selected is:" + bandSelected.getName());
        
        //labels
        Label songlistLabel = new Label(bandSelected.getName());  
        Label songTextLabel = new Label("Song information");
        
        TextArea songText = new TextArea();
        songText.setPrefRowCount(15);
        songText.setPrefColumnCount(20);
        songText.setWrapText(true);
        
        //populate list view
        songList.getItems().add("Song 1 asdfsdf");
        
        //create back button
        Button backButton = new Button("Back");
        
        //on button click event, return to previous scene
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               mainScene.startScene(primaryStage);
            }
        });

        //create vbox for the songList
        VBox songListVbox = new VBox(songlistLabel, songList);
        VBox songTextVbox = new VBox(songTextLabel, songText, backButton);
        songTextVbox.setSpacing(5);
        HBox hbox = new HBox(songListVbox, songTextVbox);
        hbox.setSpacing(10);
        
        
        //set scene
        Scene artistPageScene = new Scene(hbox, 600, 400);
        sceneControl.changeScene(primaryStage, artistPageScene, "Artist Page");
        
        
    }
   
    
    
}
