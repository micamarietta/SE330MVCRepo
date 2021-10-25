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
     * Test of getName method, of class BandModel_1.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        BandModel_1 instance = new BandModel_1();
        String expResult = "Unknown";
        System.out.println(expResult);
        String result = instance.getName();
        assertTrue(expResult.equals(result));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInfo method, of class BandModel_1.
     */
    @Test
    public void testGetInfo() {
        System.out.println("getInfo");
        BandModel_1 instance = new BandModel_1();
        String expResult = "N/A";
        String result = instance.getInfo();
        assertTrue(expResult.equals(result)); 
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYear method, of class BandModel_1.
     */
    @Test
    public void testGetYear() {
        System.out.println("getYear");
        BandModel_1 instance = new BandModel_1();
        int expResult = 0;
        int result = instance.getYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class BandModel_1.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        BandModel_1 instance = new BandModel_1();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setInfo method, of class BandModel_1.
     */
    @Test
    public void testSetInfo() {
        System.out.println("setInfo");
        String info = "";
        BandModel_1 instance = new BandModel_1();
        instance.setInfo(info);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setYear method, of class BandModel_1.
     */
    @Test
    public void testSetYear() {
        System.out.println("setYear");
        int year = 0;
        BandModel_1 instance = new BandModel_1();
        instance.setYear(year);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getYearsInProg method, of class BandModel_1.
     */
    @Test
    public void testGetYearsInProg() {
        System.out.println("getYearsInProg");
        int years = 0;
        BandModel_1 instance = new BandModel_1();
        instance.getYearsInProg(years);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addEndYear method, of class BandModel_1.
     */
    @Test
    public void testAddEndYear() {
        System.out.println("addEndYear");
        BandModel_1 instance = new BandModel_1();
        int expResult = 0;
        int result = instance.addEndYear();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
