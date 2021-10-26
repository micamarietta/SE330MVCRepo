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
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
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
        
        
        //create ListView for different bands the user can view
        ListView bandList = new ListView();
        
        //add default items to ListView
        bandList.getItems().add("Arctic Monkeys");
        bandList.getItems().add("The Beatles");
        bandList.getItems().add("Clairo");
        
        //set default objects in arrayList
        bandControl.setEntries();
        
        //create horizontal box layout
        HBox hbox = new HBox(bandList);
        
        //create text area for information to pop up
        TextArea text = new TextArea();
        text.setPrefRowCount(10);
        text.setPrefColumnCount(20);
        text.setWrapText(true);
        text.setText("Band-Pedia");
    
        
        //create button for viewing information about the band
        Button readButton = new Button("Show Info");
        
        //on event, get the item that is being pressed
        readButton.setOnAction(event -> {
            ObservableList selectedItem = bandList.getSelectionModel().getSelectedIndices();
            for (Object o : selectedItem){
                //System.out.println("o = " + o + " (" + o.getClass() + ")");
                //change text in text area to BandModel information
                System.out.println(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getName());
               // text.setText(bandControl.searchBandList(bandList.getSelectionModel().getSelectedItem().toString()).getInfo());
            }
        });
                
        //create vertical layout box with button and list
        VBox vbox = new VBox(bandList, readButton, text);
        vbox.setSpacing(5);
        
        //set scene and scene title
        Scene scene = new Scene(vbox, 500, 500);
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
