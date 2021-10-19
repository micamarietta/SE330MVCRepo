/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package micamvcapp.Models;

/**
 *
 * @author rmari
 */
public class PersonModel {
    //model for people in band
    
    public String personName;
    public String instrument;
    public int personAge;
    
    //getters
     public String getName(){
        return personName;
    }
    
     public String getInst(){
         return instrument;
     }
     
     public int getAge(){
         return personAge;
     }
    
    //setters
       public void setName(String name){
        personName = name;
    }
    
    public void setInstrument(String inst){
        instrument = inst;
    }
    
    public void setAge(int age){
        personAge = age;
    }
   
    
    
    
    
    
    
}
