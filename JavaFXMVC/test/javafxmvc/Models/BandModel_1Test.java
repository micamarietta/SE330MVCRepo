/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafxmvc.Models;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class BandModel_1Test {
    
    public BandModel_1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BandModel_1 instance = new BandModel_1();
        String expResult = "Unknown";
        System.out.println(expResult);
        String result = instance.getName();
        assertTrue(expResult.equals(result));
    }

    /**
     * Test of getInfo method
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        BandModel_1 instance = new BandModel_1();
        String expResult = "N/A";
        String result = instance.getInfo();
        assertTrue(expResult.equals(result)); 
    }
    /**
     * Test of setName method
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        BandModel_1 instance = new BandModel_1();
        instance.setName(name);
    }

    /**
     * Test of setInfo method
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        String info = "";
        BandModel_1 instance = new BandModel_1();
        instance.setInfo(info);
    }
    
    /**
     * Test of add to song list method
     */
    @Test
    public void testAddToSongList(){
        System.out.println("addToSongList");
        
    }
        


    
}
