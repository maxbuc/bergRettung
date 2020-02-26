/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import bergrettung.Equipment;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maximilian
 */
public class EquipmentJavaDBMapperTest {

    Equipment e;

    public EquipmentJavaDBMapperTest() {
        e = new Equipment("Seil", 1);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insertEquipment method, of class EquipmentJavaDBMapper.
     */
    @Test
    public void testInsertEquipment() {
        System.out.println("insertEquipment");
        EquipmentJavaDBMapper instance = new EquipmentJavaDBMapper();
        instance.insertEquipment(e);

    }

    /**
     * Test of updateEquipment method, of class EquipmentJavaDBMapper.
     */
    @Test
    public void testUpdateEquipment() {
        System.out.println("updateEquipment");
        EquipmentJavaDBMapper instance = new EquipmentJavaDBMapper();
        instance.updateEquipment(e);
    }

    /**
     * Test of readEquipment method, of class EquipmentJavaDBMapper.
     */
    @Test
    public void testReadEquipment() {
        System.out.println("readEquipment");
        int id = 1;
        EquipmentJavaDBMapper instance = new EquipmentJavaDBMapper();
        Equipment expResult = e;
        Equipment result = instance.readEquipment(id);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of readAll method, of class EquipmentJavaDBMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        EquipmentJavaDBMapper instance = new EquipmentJavaDBMapper();
        List<Equipment> expResult = new ArrayList<>();
        expResult.add(e);
        List<Equipment> result = instance.readAll();
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of deleteEquipment method, of class EquipmentJavaDBMapper.
     */
    @Test
    public void testDeleteEquipment() {
        System.out.println("deleteEquipment");
        int id = 1;
        EquipmentJavaDBMapper instance = new EquipmentJavaDBMapper();
        instance.deleteEquipment(id);
    }

    /**
     * Test of getNextFree method, of class EquipmentJavaDBMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        EquipmentJavaDBMapper instance = new EquipmentJavaDBMapper();
        int expResult = 1;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
    }

}
