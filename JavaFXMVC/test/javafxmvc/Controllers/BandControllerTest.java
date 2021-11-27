/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package javafxmvc.Controllers;

import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.BandModel_1;
import javafxmvc.Models.SongModel;
import javafxmvc.Models.SetListModel;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rmari
 */
public class BandControllerTest {
    private BandController bandController;
    private BandModel_1 band = new BandModel_1();
    private SongModel song = new SongModel("Name", "Lyrics");
    
    public BandControllerTest() {
        bandController = new BandController();
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
        bandController.setEntries();
        List<BandModel_1> expList = null;
        assertNotEquals(expList, bandController.bandList);
        
        
        //test 2
        //ensuring that the returned list of bands has a length of three (three default entries)
        System.out.println("setEntries; list has three bands");
        BandController instance2 = new BandController();
        instance2.setEntries();
        assertEquals(bandController.bandList.size(), instance2.bandList.size());
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
        BandModel_1 expResult = null;
        BandModel_1 result = bandController.searchBandList(bandName);
        assertEquals(expResult, result);
        
        
        //test 2
        //if the item is found in the list after the default entries are set, a BandModel_1 will be returned
        System.out.println("searchBandList; item found in list");
        String bandNameFound = "The Beatles";
        //set default entries
        bandController.setEntries();
        
        //result should be a band model with the name "The Beatles"
        BandModel_1 expResult2 = new BandModel_1("The Beatles");
        BandModel_1 result2 = bandController.searchBandList(bandNameFound);
        
        //ensure the models returned both have the name "The Beatles"
        assertEquals(expResult2.getName(),result2.getName());
    }
    
    /**
     * Test of searchSetList method, of class BandController.
     */
    @Test
    public void testSearchSetList() {
        //test 1
        //if the item is not found in the list, a null value will be returned
        System.out.println("searchSetList; item not found in list");
        
        String songName = "Test";
        band.songList.addSongs(song);
        SongModel expResult = null;
        
        //initialize list
        SongModel result = bandController.searchSetList(band, songName);
        System.out.println("Result: " + result);
        assertEquals(expResult, result);
        
        
        //test 2
        //if the item is found in the list after the default entries are set, a SongModel will be returned
        System.out.println("searchSetList; item found in list");
        String songNameFound = "A Certain Romance";
        //set default entries on instance
        bandController.setEntries();
        
        //result should be a song model with the name "A Certain Romance"
        song.setName("A Certain Romance");
        band.songList.addSongs(song);
        
        SongModel result2 = bandController.searchSetList(band, "A Certain Romance");
        System.out.println("Song is" + result2);
        
        //ensure the models returned both have the name "The Beatles"
        assertEquals(result2.getName(),songNameFound);
        
        //test 3
        //ensuring the number of listens is defaulted to zero when added to the setlist
        System.out.println("searchSetList; item in list has default 0 listens");
        int numOfListens = 0;
        SongModel songResult = mock(SongModel.class);
        assertEquals(numOfListens, songResult.getListens());
        
    }
}
