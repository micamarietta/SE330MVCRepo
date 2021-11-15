/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.BandModel_1;

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
    }
    
    //search for stringEntry in list of bandObjects, return the bandObject
    public BandModel_1 searchBandList(String bandName){
        //System.out.println("bandName: " + bandName);
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
        }
        return returnObject;
    }
    
    
    
    
}
