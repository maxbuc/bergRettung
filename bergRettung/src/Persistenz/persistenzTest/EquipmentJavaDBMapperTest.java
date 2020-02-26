/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz.persistenzTest;

import Persistenz.*;
import bergrettung.Equipment;
      

public class EquipmentJavaDBMapperTest{
    
    private EquipmentJavaDBMapper mapper = new EquipmentJavaDBMapper();
    
    int id = 20;
    String bezeichnung = "seil";
    Equipment e;

    public EquipmentJavaDBMapperTest() {
        e = new Equipment(bezeichnung, id);
        
        insertEquipment();
        updateEquipment();
        readEquipment();
        readAll();
        getNextFree();
    }
    
    
    
    public void insertEquipment(){
        mapper.insertEquipment(e);
        if(mapper.readEquipment(id).toString().equals(e.toString())){
            System.out.println("insertEquipment Test erfolgreich");
        }else{
            System.err.println("insertEuipment");
        }
    }
    
    
    public void updateEquipment(){
        e.setBezeichnung("Seil");
        mapper.updateEquipment(e);
        if(mapper.readEquipment(id).toString().equals(e.toString())){
            System.out.println("updateEquipment Test erfolgreich");
        }else{
            System.err.println("updateEquipment");
        }
    }
    
       
    public void readEquipment(){
        if(mapper.readEquipment(id).toString().equals(e.toString())){
            System.out.println("readEquipment Test erfolgreich");
        }else{
            System.err.println("readEquipment");
        }
    }
    
    public void readAll (){
        if(mapper.readAll().get(mapper.readAll().size()-1).toString().equals(e.toString())){
            System.out.println("readAll Test erfolgreich");
        }else{
            System.err.println("readAll");
        }
    }
    
    public void getNextFree(){
        if(mapper.getNextFree() == id+1){
            System.out.println("getNextFree Test erfolgreich");
        }else{
            System.err.println("getNextFree");
        }
    }
    
}
