/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import bergrettung.Equipment;
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
public class IEquipmentMapperTest {
    
    public IEquipmentMapperTest() {
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
     * Test of readEquipment method, of class IEquipmentMapper.
     */
    @Test
    public void testReadEquipment() {
        System.out.println("readEquipment");
        int id = 0;
        IEquipmentMapper instance = new IEquipmentMapperImpl();
        Equipment expResult = null;
        Equipment result = instance.readEquipment(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class IEquipmentMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        IEquipmentMapper instance = new IEquipmentMapperImpl();
        List<Equipment> expResult = null;
        List<Equipment> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertEquipment method, of class IEquipmentMapper.
     */
    @Test
    public void testInsertEquipment() {
        System.out.println("insertEquipment");
        Equipment e = null;
        IEquipmentMapper instance = new IEquipmentMapperImpl();
        instance.insertEquipment(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEquipment method, of class IEquipmentMapper.
     */
    @Test
    public void testUpdateEquipment() {
        System.out.println("updateEquipment");
        Equipment e = null;
        IEquipmentMapper instance = new IEquipmentMapperImpl();
        instance.updateEquipment(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEquipment method, of class IEquipmentMapper.
     */
    @Test
    public void testDeleteEquipment() {
        System.out.println("deleteEquipment");
        int id = 0;
        IEquipmentMapper instance = new IEquipmentMapperImpl();
        instance.deleteEquipment(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class IEquipmentMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        IEquipmentMapper instance = new IEquipmentMapperImpl();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IEquipmentMapperImpl implements IEquipmentMapper {

        public Equipment readEquipment(int id) {
            return null;
        }

        public List<Equipment> readAll() {
            return null;
        }

        public void insertEquipment(Equipment e) {
        }

        public void updateEquipment(Equipment e) {
        }

        public void deleteEquipment(int id) {
        }

        public int getNextFree() {
            return 0;
        }
    }
    
}
