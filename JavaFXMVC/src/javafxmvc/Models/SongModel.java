/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Models;

/**
 *
 * @author rmari
 */
public class SongModel {
    public String songName;
    public String trackLink;
    public String songLyrics;
    public int numberOfListens;
    
    //ctor
    public SongModel(){
    }
    
    //overloaded ctor
    public SongModel(String name, String link, String lyrics){
        songName = name;
        trackLink = link;
        songLyrics = lyrics;
        numberOfListens = 0;
    }
    
    //getters
    public String getName(){
        return songName;
    }
    
    public String getLink(){
        return trackLink;
    }

    public int getListens(){
        return numberOfListens;
    }
    
    public String getSongLyrics(){
        return songLyrics;
    }
    
    //setters
    public void setName(String name){
        songName = name;
    }
    
    public void setTrackLink(String link){
        trackLink = link;
    }
    
    public void setListens(int listens){
        numberOfListens = listens;
    }
    
    public void setSongLyrics(String lyrics){
        songLyrics = lyrics;
    }
}
