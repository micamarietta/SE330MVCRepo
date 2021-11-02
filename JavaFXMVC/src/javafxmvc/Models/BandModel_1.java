/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Models;
import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.SongModel;
import javafxmvc.Models.PersonModel;
/**
 *
 * @author rmari
 */
public class BandModel_1 {
    //model for band/ artist
    
    public String artistName;
    public String artistInfo;
    public SongModel[] songLibrary;
    List<PersonModel> bandMembers = new ArrayList();
    
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
    
    public List<PersonModel> getMembers(){
        return bandMembers;
    }
    
    public SongModel[] getSongLibrary(){
        return songLibrary;
    }
    
    //setters
    public void setName(String name){
        artistName = name;
    }
    
    public void setInfo(String info){
        artistInfo = info;
    }
    
    public void setSongLibrary(SongModel[] songList){
        songLibrary = songList;
    }
    
    public void setBandMembers(List<PersonModel> members){
        bandMembers = members;
    }
    
}
