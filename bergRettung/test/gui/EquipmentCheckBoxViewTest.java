/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.List;
import javax.swing.JCheckBox;
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
public class EquipmentCheckBoxViewTest {
    
    public EquipmentCheckBoxViewTest() {
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
     * Test of getBoxen method, of class EquipmentCheckBoxView.
     */
    @Test
    public void testGetBoxen() {
        System.out.println("getBoxen");
        EquipmentCheckBoxView instance = null;
        List<JCheckBox> expResult = null;
        List<JCheckBox> result = instance.getBoxen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
