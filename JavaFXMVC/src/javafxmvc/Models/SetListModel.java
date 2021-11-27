/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxmvc.Models;
import java.util.ArrayList;
import java.util.List;
import javafxmvc.Models.SongModel;

/**
 *
 * @author rmari
 */
public class SetListModel {
    public List<SongModel> setList = new ArrayList();
    
    //getter
    public List<SongModel> getSetList(){
        return setList;
    }
    
    //setters
    public void setSetList(List<SongModel> list){
        setList = list;
    }
    
    //add songs to list
    public void addSongs(SongModel song){
        setList.add(song);
    }
    
    
    
    
}
