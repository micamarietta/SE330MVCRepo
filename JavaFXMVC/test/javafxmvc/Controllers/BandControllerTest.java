/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafxmvc.Controllers;

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
        System.out.println("setEntries");
        BandController instance = new BandController();
        instance.setEntries();
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of searchBandList method, of class BandController.
     */
    @Test
    public void testSearchBandList() {
        System.out.println("searchBandList");
        String bandName = "";
        BandController instance = new BandController();
        BandModel_1 expResult = null;
        BandModel_1 result = instance.searchBandList(bandName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
