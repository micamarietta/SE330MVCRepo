/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Models;
import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.SongModel;
/**
 *
 * @author rmari
 */
public class BandModel_1 {
    //model for band/ artist
    
    public String artistName;
    public String artistInfo;
    public List<SongModel> songList = new ArrayList();
    
    //ctor 
    public BandModel_1(){
        artistName = "Unknown";
        artistInfo = "N/A";
    }
    
    //getters
    public String getName(){
        return artistName;
    }
    
    
    public String getInfo(){
        return artistInfo;
    }
    
    public List getSongList(){
        return songList;
    }
    
    //setters
    public void setName(String name){
        artistName = name;
    }
    
    public void setInfo(String info){
        artistInfo = info;
    }
    
    public void addToSongList(SongModel song){
        songList.add(song);
    }

    
}
