/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Models;

/**
 *
 * @author rmari
 */
public class PersonModel {
    //model for people in band
    
    public String personName;
    public String instrument;
    
    public PersonModel(String name, String instrument){
        this.personName = name;
        this.instrument = instrument;
    }


    //getters
     public String getName(){
        return personName;
    }
    
     public String getInst(){
         return instrument;
     }
     
    
    //setters
       public void setName(String name){
        personName = name;
    }
    
    public void setInstrument(String inst){
        instrument = inst;
    }
    
   
    
    
    
    
    
    
}
