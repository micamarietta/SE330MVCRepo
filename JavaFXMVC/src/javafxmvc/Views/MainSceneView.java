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
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
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
import javafxmvc.Views.ArtistPageSceneView;

/**
 *
 * @author rmari
 */
public class MainSceneView {
    
    public static BandModel_1 bandSelected = new BandModel_1();

    public void startScene(Stage primaryStage) {
        
        BandController bandControl = new BandController();
        SceneController sceneControl = new SceneController();
        ArtistPageSceneView artistPageView = new ArtistPageSceneView();
        
        //define font types for labels
        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 16);
        
        //create ListViews for bands and songs
        ListView bandList = new ListView();
        
        
        //add default items to bandList
        bandList.getItems().add("Arctic Monkeys");
        bandList.getItems().add("The Beatles");
        bandList.getItems().add("Clairo");
        bandList.getItems().add("The Strokes");
        bandList.getItems().add("Bruno Mars");
        bandList.getItems().add("Cage the Elephant");
        bandList.getItems().add("Paramore");
        
        //set default objects in arrayList
        bandControl.setEntries();

        // ----------------------------------- TEXT AREAS -----------------------------------
        
        //create text area for band information
        TextArea text = new TextArea();
        text.setPrefRowCount(10);
        text.setPrefColumnCount(20);
        text.setWrapText(true);
        text.setText("Band Information");        
        
        // -------------------------------- BUTTONS/ACTIONS ------------------------------------
        
        //create button to switch to artist scene
        Button viewArtistPageButton = new Button("View Artist Page");
        viewArtistPageButton.setDisable(true);
        viewArtistPageButton.setStyle("-fx-background-color: PALEGREEN;");
        
        //on event, go to artistPage scene
        viewArtistPageButton.setOnAction(event -> {
           artistPageView.startScene(primaryStage, bandSelected);
        });
        
        //tracking user selections in list
        bandList.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
           @Override
        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
            System.out.println("ListView selection changed from oldValue = " 
                    + oldValue + " to newValue = " + newValue);
            viewArtistPageButton.setDisable(false);
            bandSelected = bandControl.searchBandList(newValue);
            System.out.println("Band selected is: " + bandSelected.getName());
        }
    });  
        
        //create button for viewing information about the band
        Button infoButton = new Button("Show Quick Summary");
        infoButton.setStyle("-fx-background-color: LIGHTPINK;");
        
        //on event, return the information of the bandItem the user has selected      
        infoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList selectedItem = bandList.getSelectionModel().getSelectedIndices();
                
                for (Object o : selectedItem){
                    //change text in text area to BandModel information
                    //System.out.println("searching for " + bandList.getSelectionModel().getSelectedItem().toString());
                    //System.out.println("Band has been set: " + bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getName());
                    text.setText(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getInfo());
                }
            }
        });

        HBox buttonHbox = new HBox(infoButton);
        buttonHbox.setSpacing(5);
                
        //create label above first vbox
        Label bandsLabel = new Label("  Artist List");
        bandsLabel.setFont(font);
        Label bandInfoLabel = new Label("  Artist Information");
        bandInfoLabel.setFont(font);
        
        //create vertical layout box with button and list
        VBox vbox = new VBox(bandsLabel, bandList);
        vbox.setSpacing(5);
        VBox vbox2 = new VBox(bandInfoLabel,buttonHbox, text, viewArtistPageButton);
        vbox2.setSpacing(5);
        
        HBox sceneHbox = new HBox(vbox, vbox2);
        sceneHbox.setSpacing(5);
        sceneHbox.setStyle("-fx-background-color: PAPAYAWHIP;"); 
        
        Scene scene = new Scene(sceneHbox, 600, 400);
        sceneControl.changeScene(primaryStage, scene, "Band-Pedia");
        
    }
}
