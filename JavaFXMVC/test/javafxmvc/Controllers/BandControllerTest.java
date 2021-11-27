/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafxmvc.Controllers;

import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.BandModel_1;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class BandControllerTest {
    
    public BandControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setEntries method, of class BandController.
     */
    @Test
    public void testSetEntries() {
        //test 1
        //ensuring that the returned list of bands is not null
        System.out.println("setEntries; list is not null");
        BandController instance = new BandController();
        instance.setEntries();
        List<BandModel_1> expList = null;
        assertNotEquals(expList, instance.bandList);
        
        
        //test 2
        //ensuring that the returned list of bands has a length of three (three default entries)
        System.out.println("setEntries; list has three bands");
        BandController instance2 = new BandController();
        instance2.setEntries();
        BandController expResult2 = new BandController();
        expResult2.setEntries();
        assertEquals(expResult2.bandList.size(), instance2.bandList.size());
    }

    /**
     * Test of searchBandList method, of class BandController.
     */
    @Test
    public void testSearchBandList() {
        //test 1
        //if the item is not found in the list, a null value will be returned
        System.out.println("searchBandList; item not found in list");
        String bandName = "";
        BandController instance = new BandController();
        BandModel_1 expResult = null;
        BandModel_1 result = instance.searchBandList(bandName);
        assertEquals(expResult, result);
        
        
        //test 2
        //if the item is found in the list after the default entries are set, a BandModel_1 will be returned
        System.out.println("searchBandList; item found in list");
        String bandNameFound = "The Beatles";
        BandController instance2 = new BandController();
        //set default entries on instanceFound
        instance2.setEntries();
        
        //result should be a band model with the name "The Beatles"
        BandModel_1 expResult2 = new BandModel_1("The Beatles");
        BandModel_1 result2 = instance2.searchBandList(bandNameFound);
        
        //ensure the models returned both have the name "The Beatles"
        assertEquals(expResult2.getName(),result2.getName());
    }
    
    
}
