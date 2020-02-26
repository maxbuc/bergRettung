/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JTextField;
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
public class EquipmentViewTest {
    
    public EquipmentViewTest() {
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
     * Test of init method, of class EquipmentView.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        EquipmentView instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdText method, of class EquipmentView.
     */
    @Test
    public void testGetIdText() {
        System.out.println("getIdText");
        EquipmentView instance = null;
        int expResult = 0;
        int result = instance.getIdText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBezeichnungText method, of class EquipmentView.
     */
    @Test
    public void testGetBezeichnungText() {
        System.out.println("getBezeichnungText");
        EquipmentView instance = null;
        String expResult = "";
        String result = instance.getBezeichnungText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdField method, of class EquipmentView.
     */
    @Test
    public void testGetIdField() {
        System.out.println("getIdField");
        EquipmentView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getIdField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBezeichnungField method, of class EquipmentView.
     */
    @Test
    public void testGetBezeichnungField() {
        System.out.println("getBezeichnungField");
        EquipmentView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getBezeichnungField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
