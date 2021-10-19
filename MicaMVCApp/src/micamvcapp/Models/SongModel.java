/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micamvcapp.Models;

/**
 *
 * @author rmari
 */
public class SongModel {
    public String songName;
    public String trackLink;
    public int numberOfListens;
    
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
}
