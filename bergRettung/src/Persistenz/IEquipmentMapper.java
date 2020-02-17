/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import java.util.List;
import bergrettung.Equipment;


public interface IEquipmentMapper {
    
    Equipment readEquipment(String id);//statt String -> Integer
    List<Equipment> readAlles();
    void insertEquipment(Equipment e);
    void updateEquipment(Equipment e);
    void deleteEquipment(String id);//statt String -> Integer
}
