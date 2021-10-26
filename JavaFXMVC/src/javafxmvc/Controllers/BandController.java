/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import javafxmvc.Models.BandModel_1;

/**
 *
 * @author rmari
 */
public class BandController {
    BandModel_1[] bandList = new BandModel_1[30];
    
    //set default entries in band/artist list
    public void setEntries(){
        //create three default entries
        BandModel_1 band1 = new BandModel_1();
        band1.setName("Arctic Monkeys");
        BandModel_1 band2 = new BandModel_1();
        band2.setName("The Beatles");
        BandModel_1 band3 = new BandModel_1();
        band3.setName("Clairo");
        
        //set values in arrayList
        bandList[0] = band1;
        bandList[1] = band2;
        bandList[2] = band3;
    }
    
    //search for stringEntry in list of bandObjects, return the bandObject
    public BandModel_1 searchBandList(String bandName){
        Boolean objectFound = false;
        BandModel_1 returnObject = new BandModel_1();
        
        //loop through elements in list, if name matches, return BandModel object
        for(int i = 0; i <= bandList.length; i++){
            if(bandList[i].getName().equals(bandName)){
                System.out.println("Object found!");
                objectFound = true;
                returnObject = bandList[i];
                System.out.println(returnObject.getName());
            }
        }
        //if object is not found in list, return object with temp info
        //else, object will be returned
            return returnObject;
    }
    
    
    
    //add entry function for user to input string of band/ artists name and add them to the page

    
    
}
