/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micamvcapp.Models;
import micamvcapp.Models.SongModel;
import micamvcapp.Models.PersonModel;
/**
 *
 * @author rmari
 */
public class BandModel {
    //model for band/ artist
    
    public String artistName;
    public String artistInfo;
    public SongModel[] songList;
    public PersonModel[] bandMembers;
    
    //ctor 
    public BandModel(){
        artistName = "Unknown";
        artistInfo = "N/";
    }
    
    //getters
    public String getName(){
        return artistName;
    }
    
    public String getInfo(){
        return artistInfo;
    }
    
    //setters
    public void setName(String name){
        artistName = name;
    }
    
    public void setInfo(String info){
        artistInfo = info;
    }
    
}
