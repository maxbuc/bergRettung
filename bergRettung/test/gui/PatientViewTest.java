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
public class PatientViewTest {
    
    public PatientViewTest() {
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
     * Test of init method, of class PatientView.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        PatientView instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVornameText method, of class PatientView.
     */
    @Test
    public void testGetVornameText() {
        System.out.println("getVornameText");
        PatientView instance = null;
        String expResult = "";
        String result = instance.getVornameText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNachnameText method, of class PatientView.
     */
    @Test
    public void testGetNachnameText() {
        System.out.println("getNachnameText");
        PatientView instance = null;
        String expResult = "";
        String result = instance.getNachnameText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdText method, of class PatientView.
     */
    @Test
    public void testGetIdText() {
        System.out.println("getIdText");
        PatientView instance = null;
        int expResult = 0;
        int result = instance.getIdText();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdField method, of class PatientView.
     */
    @Test
    public void testGetIdField() {
        System.out.println("getIdField");
        PatientView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getIdField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVornameField method, of class PatientView.
     */
    @Test
    public void testGetVornameField() {
        System.out.println("getVornameField");
        PatientView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getVornameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNachnameField method, of class PatientView.
     */
    @Test
    public void testGetNachnameField() {
        System.out.println("getNachnameField");
        PatientView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getNachnameField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
