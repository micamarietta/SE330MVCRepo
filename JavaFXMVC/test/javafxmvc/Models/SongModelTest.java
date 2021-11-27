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
public class SongModelTest {
    
    public SongModelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getName method, of class SongModel.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        SongModel instance = new SongModel("TestName", "lyrics");
        String expResult = "TestName";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListens method, of class SongModel.
     */
    @Test
    public void testGetListens() {
        System.out.println("getListens");
        SongModel instance = new SongModel();
        int expResult = 0;
        int result = instance.getListens();
        //ensures that number of listens is defaulted to zero
        assertEquals(expResult, result);
    }

    /**
     * Test of getSongLyrics method, of class SongModel.
     */
    @Test
    public void testGetSongLyrics() {
        System.out.println("getSongLyrics");
        SongModel instance = new SongModel("TestName", "TestLyrics");
        String expResult = "TestLyrics";
        String result = instance.getSongLyrics();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class SongModel.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "TestName";
        SongModel instance = new SongModel("TestName", "Lyrics");
        instance.setName(name);
        assertEquals(instance.songName, name);
    }

    /**
     * Test of setListens method, of class SongModel.
     */
    @Test
    public void testSetListens() {
        System.out.println("setListens");
        int listens = 0;
        SongModel instance = new SongModel();
        instance.setListens(listens);
        assertEquals(instance.getListens(), listens);

    }

    /**
     * Test of setSongLyrics method, of class SongModel.
     */
    @Test
    public void testSetSongLyrics() {
        System.out.println("setSongLyrics");
        String lyrics = "Lyrics";
        SongModel instance = new SongModel("Name", "Lyrics");
        instance.setSongLyrics(lyrics);
        assertEquals(instance.getSongLyrics(),lyrics);
    }
    
}
