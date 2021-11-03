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

/**
 *
 * @author rmari
 */
public class MainSceneView {

    public void startScene(Stage primaryStage) {
        //vars
        BandController bandControl = new BandController();
        
        //define font types for labels
        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 16);
        
        //create variable to track band currently selected
        
        //create ListViews for bands and songs
        ListView bandList = new ListView();
        ListView songList = new ListView();
        
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
        infoButton.setOnAction(event -> {
            ObservableList selectedItem = bandList.getSelectionModel().getSelectedIndices();
            for (Object o : selectedItem){
                //change text in text area to BandModel information
                System.out.println("searching for " + bandList.getSelectionModel().getSelectedItem().toString());
                System.out.println(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getName());
                text.setText(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getInfo());
                //bandSelected = bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getName();
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


  
        
        HBox buttonHbox = new HBox(infoButton, showMembersButton);
        buttonHbox.setSpacing(5);
                
        //create label above first vbox
        Label bandsLabel = new Label("  Artist List");
        bandsLabel.setFont(font);
        Label bandInfoLabel = new Label("  Artist Information");
        bandInfoLabel.setFont(font);
        Label songlistLabel = new Label("  Songs by ");
        bandInfoLabel.setFont(font);
        
        //create vertical layout box with button and list
        VBox vbox = new VBox(bandsLabel, bandList, bandInfoLabel, buttonHbox, text);
        vbox.setSpacing(5);
        
        //create vbox for the songList
        VBox songListVbox = new VBox(songlistLabel, songList);
        
        //create text area for right side of UI
        TextArea newText = new TextArea();
        newText.setWrapText(true);
        
        TextArea testTextArea = new TextArea();
        testTextArea.setText("Trying to test");
        
        HBox newHBox = new HBox(testTextArea);
        
        //set scene and scene title
        
        Scene newScene = new Scene(newHBox, 900, 600);
        
        Button testButton = new Button("test button");
         testButton.setOnAction(event -> {
            primaryStage.setScene(newScene);
            primaryStage.show();
        });
        
         HBox sceneHbox = new HBox(vbox, songListVbox, newText, testButton);
        
        Scene scene = new Scene(sceneHbox, 900, 600, Color.AQUAMARINE);
        
        
        primaryStage.setTitle("Band-Pedia");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
