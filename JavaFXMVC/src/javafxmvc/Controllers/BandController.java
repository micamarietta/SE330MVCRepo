/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Controllers;

import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.BandModel_1;
import javafxmvc.Models.PersonModel;

/**
 *
 * @author rmari
 */
public class BandController {
    List<BandModel_1> bandList = new ArrayList();
    List<PersonModel> memberList = new ArrayList();
    
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
        
        //set band member names/info
        PersonModel beatles1 = new PersonModel("Paul McCartney", "Bass guitar. vocals");
        PersonModel beatles2 = new PersonModel("John Lennon", "Rhythm guitar, vocals");
        PersonModel beatles3 = new PersonModel("George Harrison", "Lead guitar");
        PersonModel beatles4 = new PersonModel("Ringo Starr", "Drums");
        PersonModel am1 = new PersonModel("Alex Turner", "Rhythm guitar, vocals");
        PersonModel am2 = new PersonModel("Nick O-Malley", "Bass guitar");
        PersonModel am3 = new PersonModel("Jamie Cook", "Lead Guitar");
        PersonModel am4 = new PersonModel("Matt Helders", "Drums");
        PersonModel clairo1 = new PersonModel("Claire Elizabeth Cotrell", "Vocals, keyboard, guitar");
        
        memberList.add(beatles1);
        memberList.add(beatles2);
        memberList.add(beatles3);
        memberList.add(beatles4);
        memberList.add(am1);
        memberList.add(am2);
        memberList.add(am3);
        memberList.add(am4);
        memberList.add(clairo1);
       
        band1.setBandMembers(memberList);
        
        //set values in arrayList
        bandList.add(band1);
        bandList.add(band2);
        bandList.add(band3);
    }
    
    //search for stringEntry in list of bandObjects, return the bandObject
    public BandModel_1 searchBandList(String bandName){
        System.out.println("bandName: " + bandName);
        Boolean objectFound = false;
        BandModel_1 returnObject = new BandModel_1();
        
        //loop through elements in list, if name matches, return BandModel object
        for(int i = 0; i < bandList.size(); i++){
            System.out.println(bandList.get(i).getName());
            if(bandList.get(i).getName().equals(bandName)){
                System.out.println("Band found!");
                objectFound = true;
                returnObject = bandList.get(i);
                System.out.println(returnObject.getName());
            }
        }
        //if object is not found in list, return object with temp info
        //else, object will be returned
        if(!objectFound){
            System.out.println("Band not found in list");
        }
        return returnObject;
    }

    
    //locate band member in list, return concatenated string regarding BandMemberInfo
//    public String returnBandMemberInfo(String bandName){
//         Boolean objectFound = false;
//         String returnString = "";
//         
//         //loop through elements in list, if name matches, return BandModel object
//        for(int i = 0; i < bandList.size(); i++){
//            System.out.println(bandList.get(i).getName());
//            if(bandList.get(i).getName().equals(bandName)){
//                System.out.println("Band found!");
//                objectFound = true;
//                
//                //loop through members in memberList on band object
//                for(int j = 0; j < bandList.get(i).getMembers().size(); j++){
//                    returnString = returnString + bandList.get(i).getMembers().get(j).getName() + ": " + bandList.get(i).getMembers().get(j).getInst();
//                }
//            }
//        }
//        
//        
//        if(!objectFound){
//            System.out.println("Band not found in list");
//        }
//        
//        return returnString;
//    }
    
    
    
    //add entry function for user to input string of band/ artists name and add them to the page

    
    
}
