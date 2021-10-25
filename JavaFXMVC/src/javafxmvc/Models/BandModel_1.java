/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Models;
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
    public int yearStarted = 0;
    public int yearsInProgress; 
    public SongModel[] songList;
    public PersonModel[] bandMembers;
    
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
    
    public int getYear(){
        return yearStarted;
    }
    
    //setters
    public void setName(String name){
        artistName = name;
    }
    
    public void setInfo(String info){
        artistInfo = info;
    }
    
    public void setYear(int year){
        yearStarted = year;
    } 
    
    public void getYearsInProg(int years){
        yearsInProgress = years;
    }
    
    public int addEndYear(){
        return yearStarted + yearsInProgress;
    }
    
}
