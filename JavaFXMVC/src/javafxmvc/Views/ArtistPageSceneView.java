/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Views;
import javafx.beans.value.ChangeListener;
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
    
    public BandModel_1 bandSelected;
    public Label songlistLabel;
    
    //ctor
    ArtistPageSceneView(){
    }
    
    public void startScene(Stage primaryStage, BandModel_1 band){
    //creates the scene for the artist page
    //displays band info
    //displays song list
    //displays song information
    
        BandController bandControl = new BandController();
        bandSelected = band;
        SceneController sceneControl = new SceneController();
        MainSceneView mainScene = new MainSceneView();
        
        ListView bandSelectedSetList = new ListView(); 
        //System.out.println("Band selected is:" + bandSelected.getName());
        
        //labels
        Label songTextLabel = new Label("Song information");
        songlistLabel = new Label("Songs by " + bandSelected.getName());
        
        TextArea songText = new TextArea();
        songText.setPrefRowCount(15);
        songText.setPrefColumnCount(20);
        songText.setWrapText(true);
        
        //populate list view with all songs for the band the user has selected
        for(int i = 0; i < bandSelected.songList.getSetListSize(); i++){
            //add name of each song to the array
            bandSelectedSetList.getItems().add(bandSelected.songList.setList.get(i).getName());
        }
        
        
        //when tracking user selections in  song setlist, display the lyrics in the text box
        bandSelectedSetList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
           @Override
        public void changed(javafx.beans.value.ObservableValue<? extends String> observable, String oldValue, String newValue) {
            //set text box to the right to be the lyrics of the selected song
            songText.setText(bandControl.searchSetList(bandSelected, newValue).getSongLyrics());
        }
    });  
        
        /////////////////////////////////// BUTTONS ///////////////////////////////////////////
        
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
        VBox songListVbox = new VBox(songlistLabel, bandSelectedSetList);
        VBox songTextVbox = new VBox(songTextLabel, songText, backButton);
        songTextVbox.setSpacing(5);
        HBox hbox = new HBox(songListVbox, songTextVbox);
        hbox.setSpacing(10);
        
        
        //set scene
        Scene artistPageScene = new Scene(hbox, 600, 400);
        sceneControl.changeScene(primaryStage, artistPageScene, "Artist Page");
        
        
    }
   
    
    
}
