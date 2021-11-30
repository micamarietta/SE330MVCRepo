/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Views;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafxmvc.Controllers.BandController;
import javafxmvc.Controllers.SceneController;
import javafxmvc.Models.BandModel_1;
import javafxmvc.Views.MainSceneView;
import javafxmvc.Models.SongModel;

/**
 *
 * @author rmari
 */
public class ArtistPageSceneView {
    
    public BandModel_1 bandSelected;
    public Label songlistLabel;
    public MediaPlayer mediaPlay;
    public SongModel songSelected;
    
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
        
        //define font types for labels
        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 16);
        
        ListView bandSelectedSetList = new ListView(); 
        
        //labels
        Label songTextLabel = new Label("Song lyrics:");
        songTextLabel.setFont(font);
        songlistLabel = new Label("Songs by " + bandSelected.getName());
        songlistLabel.setFont(font);
        Label numberOfListensLabel = new Label("Number of Listens:");
        numberOfListensLabel.setFont(font);
        
        
        TextArea songText = new TextArea();
        songText.setPrefRowCount(15);
        songText.setPrefColumnCount(20);
        songText.setWrapText(true);
        
        //populate list view with all songs for the band the user has selected
        for(int i = 0; i < bandSelected.songList.setList.size(); i++){
            //add name of each song to the array
            bandSelectedSetList.getItems().add(bandSelected.songList.setList.get(i).getName());
            numberOfListensLabel.setText("Number of Listens: " + bandSelected.songList.setList.get(i).numberOfListens);
        }
        
        
        //when tracking user selections in  song setlist, display the lyrics in the text box
        bandSelectedSetList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
           @Override
        public void changed(javafx.beans.value.ObservableValue<? extends String> observable, String oldValue, String newValue) {
            //set text box to the right to be the lyrics of the selected song
            songSelected = bandControl.searchSetList(bandSelected, newValue);
            songText.setText(bandControl.searchSetList(bandSelected, newValue).getSongLyrics()); 
        }
    });  
        
        /////////////////////////////////// BUTTONS ///////////////////////////////////////////
        
        //create back button
        Button backButton = new Button("Back");
        backButton.setStyle("-fx-background-color: LIGHTPINK;");
        
        //on button click event, return to previous scene
        backButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               mainScene.startScene(primaryStage);
            }
        });
        
        //create play button
        Button playButton = new Button("Play Song");
        playButton.setStyle("-fx-background-color: PALEGREEN;");
        
         //on play button click event, play the song selected by user
        playButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               //increment number of listens after user chooses to play the song
               songSelected.numberOfListens++;
               numberOfListensLabel.setText("Number of Listens: " + songSelected.numberOfListens);
               
            try{
                 Desktop.getDesktop().browse(new URL(songSelected.getSongTrack()).toURI());
                 } catch(IOException e){
                     e.printStackTrace();
                 } catch (URISyntaxException e){
                     e.printStackTrace();
                 }
            }     
            });

        //create vboxes + hboxes for the songList
        HBox buttonsHbox = new HBox(playButton, backButton);
        buttonsHbox.setSpacing(10);
        HBox labelsHBox = new HBox(songTextLabel, numberOfListensLabel);
        labelsHBox.setSpacing(40);
        VBox songListVbox = new VBox(songlistLabel, bandSelectedSetList);
        VBox songTextVbox = new VBox(labelsHBox, songText, buttonsHbox);
        songTextVbox.setSpacing(5);
        
        
        HBox hbox = new HBox(songListVbox, songTextVbox);
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: PAPAYAWHIP;"); 
        
        
        //set scene
        Scene artistPageScene = new Scene(hbox, 600, 400); 
        sceneControl.changeScene(primaryStage, artistPageScene, "Artist Page");
        
        
    }
   
    
    
}
