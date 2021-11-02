/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxmvc.Views;
import javafxmvc.Models.BandModel_1;
import javafxmvc.Controllers.BandController;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.control.ListView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author rmari
 */
public class JavaFXMVC extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //vars
        BandController bandControl = new BandController();
        
        //define font types for labels
        Font font = Font.font("Verdana", FontWeight.BOLD, FontPosture.ITALIC, 16);
        
        
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
        
        //create vertical layout box with button and list
        VBox vbox = new VBox(bandsLabel, bandList, bandInfoLabel, buttonHbox, text);
        vbox.setSpacing(5);
        
        //create text area for right side of UI
        TextArea newText = new TextArea();
        newText.setWrapText(true);
        
        HBox sceneHbox = new HBox(vbox, newText);
        
        //set scene and scene title
        Scene scene = new Scene(sceneHbox, 900, 600, Color.AQUAMARINE);
        primaryStage.setTitle("Band-Pedia");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
