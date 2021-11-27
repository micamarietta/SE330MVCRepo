/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import java.io.File;
import java.util.ArrayList;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author rmari
 */
public class MediaController {
    //declaring variables for playing mp3s
    private Media media;
    private MediaPlayer mediaPlayer;
    
    //referencing file in project folder
    private File directory = new File("Music");
    
    //gets different files/songs within our directory
    private File[] files = directory.listFiles();
    private ArrayList<File> songs = new ArrayList<File>();
    
    public void initFiles(){
        if(files != null){
            for(File file : files){
                songs.add(file);
                System.out.println(file);
            }
        }
    }
    
    //plays song based on file mp3 index
    public void playSong(int index){
        System.out.println("Playing song");
        System.out.println(songs.get(index).toURI().toString());
        media = new Media(songs.get(index).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
    
}
