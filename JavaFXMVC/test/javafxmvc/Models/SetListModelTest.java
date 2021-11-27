/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafxmvc.Models;

import java.util.List;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class SetListModelTest {
    
    public SetListModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getSetList method, of class SetListModel.
     */
    @Test
    public void testGetSetList() {
        System.out.println("getSetList");
        SetListModel instance = new SetListModel();
        List<SongModel> expResult = null;
        List<SongModel> result = instance.getSetList();
        //ensure that a setListModel is returned
        assertNotEquals(expResult, result);
    }

    /**
     * Test of setSetList method, of class SetListModel.
     */
    @Test
    public void testSetSetList() {
        System.out.println("setSetList");
        List<SongModel> list = null;
        SetListModel instance = new SetListModel();
        instance.setSetList(list);
    }

    /**
     * Test of addSongs method, of class SetListModel.
     */
    @Test
    public void testAddSongs() {
        System.out.println("addSongs");
        SongModel song = null;
        SetListModel instance = new SetListModel();
        instance.addSongs(song);
        //ensure that the size is one after a song is added to the list
        assertEquals(instance.setList.size(), 1);
    }
    
}
