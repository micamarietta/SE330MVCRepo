/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.BandModel_1;
import javafxmvc.Models.SongModel;
import javafxmvc.Models.SetListModel;

/**
 *
 * @author rmari
 */
public class BandController {
    List<BandModel_1> bandList = new ArrayList();
    
    
    //set default entries in band/artist list
    public void setEntries(){
        //create three default entries with name and information
        //set names
        BandModel_1 band1 = new BandModel_1();
        band1.setName("Arctic Monkeys");
        BandModel_1 band2 = new BandModel_1();
        band2.setName("The Beatles");
        BandModel_1 band3 = new BandModel_1();
        band3.setName("Clairo");
        
        //set info
        band1.setInfo("Arctic Monkeys are an English rock band formed in Sheffield in 2002. The group consists of Alex Turner, Jamie Cook, Nick O'Malley, and Matt Helders. Former band member Andy Nicholson left the band in 2006 shortly after their debut album was released.");
        band2.setInfo("The Beatles were an English rock band formed in Liverpool in 1960. The group, whose best-known line-up comprised John Lennon, Paul McCartney, George Harrison and Ringo Starr, are regarded as the most influential band of all time.");
        band3.setInfo("Claire Elizabeth Cottrill, known professionally as Clairo, is an American singer-songwriter. Born in Atlanta, Georgia, and raised in Carlisle, Massachusetts, she began posting music on the internet at age 13.");
        
        //set values in arrayList
        bandList.add(band1);
        bandList.add(band2);
        bandList.add(band3);
        
        //create songs
        SongModel band1Song1 = new SongModel("A Certain Romance",
            "Well, oh, they might wear classic Reeboks\n" +
            "Or knackered Converse\n" +
            "Or tracky bottoms tucked in socks\n" +
            "But all of that's what the point is not\n" +
            "The point's that there ain't no romance around there\n" +
            "And there's the truth that they can't see\n" +
            "They'd probably like to throw a punch at me\n" +
            "And if you could only see 'em, then you would agree\n" +
            "Agree that there ain't no romance around there\n" +
            "You know, oh, it's a funny thing you know\n" +
            "We'll tell 'em if you like\n" +
            "We'll tell 'em all tonight\n" +
            "They'll never listen\n" +
            "Because their minds are made up\n" +
            "And course it's all okay to carry on that way\n" +
            "'Cause over there, there's broken bones\n" +
            "There's only music, so that there's new ringtones\n" +
            "And it don't take no Sherlock Holmes\n" +
            "To see it's a little different around here\n" +
            "Don't get me wrong, though, there's boys in bands\n" +
            "And kids who like to scrap with pool cues in their hands\n" +
            "And just 'cause he's had a couple o' cans\n" +
            "He thinks it's all right to act like a dickhead\n" +
            "Don't you know, oh' it's a funny thing you know\n" +
            "We'll tell 'em if you like\n" +
            "We'll tell 'em all tonight\n" +
            "They'll never listen\n" +
            "Because their minds are made up\n" +
            "And course it's all okay to carry on that way\n" +
            "But I said no\n" +
            "Oh no\n" +
            "Well, you won't get me to go\n" +
            "Not anywhere, not anywhere\n" +
            "No, I won't go\n" +
            "Oh no no\n" +
            "Well, over there, there's friends of mine\n" +
            "What can I say? I've known 'em for a long long time\n" +
            "And, yeah, they might overstep the line\n" +
            "But you just cannot get angry in the same way\n" +
            "No, not in the same way\n" +
            "Said, not in the same way\n" +
            "Oh no, oh no no");
        
        //set songs in songList
        band1.songList.addSongs(band1Song1);
    }
    
    //search for stringEntry in list of bandObjects, return the bandObject
    public BandModel_1 searchBandList(String bandName){
        Boolean objectFound = false;
        BandModel_1 returnObject = new BandModel_1();
        
        //loop through elements in list, if name matches, return BandModel object
        for(int i = 0; i < bandList.size(); i++){
            //System.out.println(bandList.get(i).getName());
            if(bandList.get(i).getName().equals(bandName)){
                //System.out.println("Band found!");
                objectFound = true;
                returnObject = bandList.get(i);
                //System.out.println(returnObject.getName());
            }
        }
        //if object is not found in list, return object with temp info
        //else, object will be returned
        if(!objectFound){
            System.out.println("Band not found in list");
            return null;
        }else{
            return returnObject;
        }
    }
    
    //search for string Name of the song in the setList, return the Song lyrics
    public SongModel searchSetList(BandModel_1 band, String songName){
        Boolean objectFound = false;
        SongModel returnSong = new SongModel();
        
        System.out.println("Searching for " + songName);
                //loop through elements in list, if name matches, return BandModel object

        for(int i = 0; i < band.songList.setList.size(); i++){
            if(band.songList.setList.get(i).getName().equals(songName)){
                System.out.println("On this band in the list: " + band.songList.setList.get(i).getName());
                objectFound = true;
                returnSong = band.songList.setList.get(i);
            }
        }
        
        if(!objectFound){
            System.out.println("Song was not found in list");
            return null;
        }else{
            return returnSong;
        }
    }
    
    
    
    
}
