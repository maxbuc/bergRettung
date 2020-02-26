/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bergrettung;

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
public class EquipmentVerwaltungTest {
    
    public EquipmentVerwaltungTest() {
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
     * Test of insertEquipment method, of class EquipmentVerwaltung.
     */
    @Test
    public void testInsertEquipment() {
        System.out.println("insertEquipment");
        Equipment e = null;
        EquipmentVerwaltung instance = new EquipmentVerwaltung();
        instance.insertEquipment(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEquipment method, of class EquipmentVerwaltung.
     */
    @Test
    public void testReadEquipment() {
        System.out.println("readEquipment");
        int id = 0;
        EquipmentVerwaltung instance = new EquipmentVerwaltung();
        Equipment expResult = null;
        Equipment result = instance.readEquipment(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class EquipmentVerwaltung.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        EquipmentVerwaltung instance = new EquipmentVerwaltung();
        List<Equipment> expResult = null;
        List<Equipment> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEquipment method, of class EquipmentVerwaltung.
     */
    @Test
    public void testUpdateEquipment() {
        System.out.println("updateEquipment");
        Equipment e = null;
        EquipmentVerwaltung instance = new EquipmentVerwaltung();
        instance.updateEquipment(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEquipment method, of class EquipmentVerwaltung.
     */
    @Test
    public void testDeleteEquipment() {
        System.out.println("deleteEquipment");
        int id = 0;
        EquipmentVerwaltung instance = new EquipmentVerwaltung();
        instance.deleteEquipment(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class EquipmentVerwaltung.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        EquipmentVerwaltung instance = new EquipmentVerwaltung();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
