/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bergrettung;

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
public class EquipmentTest {
    
    public EquipmentTest() {
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
     * Test of getBezeichnung method, of class Equipment.
     */
    @Test
    public void testGetBezeichnung() {
        System.out.println("getBezeichnung");
        Equipment instance = null;
        String expResult = "";
        String result = instance.getBezeichnung();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBezeichnung method, of class Equipment.
     */
    @Test
    public void testSetBezeichnung() {
        System.out.println("setBezeichnung");
        String bezeichnung = "";
        Equipment instance = null;
        instance.setBezeichnung(bezeichnung);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Equipment.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Equipment instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Equipment.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Equipment instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Equipment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Equipment instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
