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
import javafxmvc.Views.ArtistPageSceneView;

/**
 *
 * @author rmari
 */
public class MainSceneView {

    public void startScene(Stage primaryStage) {
        
        BandController bandControl = new BandController();
        SceneController sceneControl = new SceneController();
        ArtistPageSceneView artistPageView = new ArtistPageSceneView();
        
        //BandModel_1 bandSelected2 = new BandModel_1();

        
        //define font types for labels
        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 16);
        
        //create ListViews for bands and songs
        ListView bandList = new ListView();
        
        
        //add default items to bandList
        bandList.getItems().add("Arctic Monkeys");
        bandList.getItems().add("The Beatles");
        bandList.getItems().add("Clairo");
        
        //set default objects in arrayList
        bandControl.setEntries();

        // ----------------------------------- TEXT AREAS -----------------------------------
        
        //create text area for band information
        TextArea text = new TextArea();
        text.setPrefRowCount(10);
        text.setPrefColumnCount(20);
        text.setWrapText(true);
        text.setText("Band Information");
        
        //create text area for song information
        TextArea songText = new TextArea();
        text.setPrefRowCount(10);
        text.setPrefColumnCount(20);
        text.setWrapText(true);
        text.setText("Song Information");
        
        
        // -------------------------------- BUTTONS ------------------------------------
        
        //create button for viewing information about the band
        Button infoButton = new Button("Show Summary");
        
        //on event, return the information of the bandItem the user has selected      
        infoButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList selectedItem = bandList.getSelectionModel().getSelectedIndices();
                for (Object o : selectedItem){
                    //change text in text area to BandModel information
                    System.out.println("searching for " + bandList.getSelectionModel().getSelectedItem().toString());
                    System.out.println(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getName());
                    text.setText(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getInfo());
                    //bandSelected2 = bandControl.searchBandList("");
                }
            }
        });
        
        //create button to show band members
        Button showMembersButton = new Button("Show Members");
        
        //on event, return the members of the bandItem the user has selected
//        infoButton.setOnAction(event -> {
//            ObservableList selectedItem = bandList.getSelectionModel().getSelectedIndices();
//            for (Object o : selectedItem){
//                //change text in text area to BandModel information
//                System.out.println("searching for " + bandList.getSelectionModel().getSelectedItem().toString());
//                System.out.println(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getName());
//                text.setText(bandControl.returnBandMemberInfo(bandList.getSelectionModel().getSelectedItem().toString()));
//            }
//        });

        //create button to siwtch to artist scene
        Button viewArtistPageButton = new Button("View Artist Page");
        
        //on event, go to artistPage scene
       
        
        
        viewArtistPageButton.setOnAction(event -> {
           artistPageView.startScene(primaryStage);
        });

  
        
        HBox buttonHbox = new HBox(infoButton, showMembersButton);
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
        
       
        Scene scene = new Scene(sceneHbox, 600, 400);
        sceneControl.changeScene(primaryStage, scene, "Band-Pedia");
        
        

    }
    
    
}
