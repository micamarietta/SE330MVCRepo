/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package micamvcapp;
import micamvcapp.Models.BandModel;
import micamvcapp.Models.SongModel;

/**
 *
 * @author rmari
 */
public class MicaMVCApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BandModel theBeatles = new BandModel();
        theBeatles.setName("The Beatles\n");
        theBeatles.setInfo("Underground artist you probably haven't heard of");
        
        System.out.print(theBeatles.getName());
        System.out.println(theBeatles.getInfo());
        
    }
    
}
