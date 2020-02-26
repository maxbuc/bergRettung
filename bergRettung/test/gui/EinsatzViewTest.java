/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bergrettung.Equipment;
import bergrettung.Patient;
import bergrettung.Personal;
import java.util.List;
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
public class EinsatzViewTest {
    
    public EinsatzViewTest() {
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
     * Test of init method, of class EinsatzView.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        EinsatzView instance = null;
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextId method, of class EinsatzView.
     */
    @Test
    public void testGetTextId() {
        System.out.println("getTextId");
        EinsatzView instance = null;
        int expResult = 0;
        int result = instance.getTextId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextDatum method, of class EinsatzView.
     */
    @Test
    public void testGetTextDatum() {
        System.out.println("getTextDatum");
        EinsatzView instance = null;
        String expResult = "";
        String result = instance.getTextDatum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextOrt method, of class EinsatzView.
     */
    @Test
    public void testGetTextOrt() {
        System.out.println("getTextOrt");
        EinsatzView instance = null;
        String expResult = "";
        String result = instance.getTextOrt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTextStichwort method, of class EinsatzView.
     */
    @Test
    public void testGetTextStichwort() {
        System.out.println("getTextStichwort");
        EinsatzView instance = null;
        String expResult = "";
        String result = instance.getTextStichwort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonalList method, of class EinsatzView.
     */
    @Test
    public void testGetPersonalList() {
        System.out.println("getPersonalList");
        EinsatzView instance = null;
        List<Personal> expResult = null;
        List<Personal> result = instance.getPersonalList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonalList method, of class EinsatzView.
     */
    @Test
    public void testSetPersonalList() {
        System.out.println("setPersonalList");
        List<Personal> personalList = null;
        EinsatzView instance = null;
        instance.setPersonalList(personalList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipmentList method, of class EinsatzView.
     */
    @Test
    public void testGetEquipmentList() {
        System.out.println("getEquipmentList");
        EinsatzView instance = null;
        List<Equipment> expResult = null;
        List<Equipment> result = instance.getEquipmentList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipmentList method, of class EinsatzView.
     */
    @Test
    public void testSetEquipmentList() {
        System.out.println("setEquipmentList");
        List<Equipment> equipmentList = null;
        EinsatzView instance = null;
        instance.setEquipmentList(equipmentList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatientList method, of class EinsatzView.
     */
    @Test
    public void testGetPatientList() {
        System.out.println("getPatientList");
        EinsatzView instance = null;
        List<Patient> expResult = null;
        List<Patient> result = instance.getPatientList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatientList method, of class EinsatzView.
     */
    @Test
    public void testSetPatientList() {
        System.out.println("setPatientList");
        List<Patient> patientList = null;
        EinsatzView instance = null;
        instance.setPatientList(patientList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatientList method, of class EinsatzView.
     */
    @Test
    public void testAddPatientList() {
        System.out.println("addPatientList");
        Patient p = null;
        EinsatzView instance = null;
        instance.addPatientList(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePersListener method, of class EinsatzView.
     */
    @Test
    public void testDeletePersListener() {
        System.out.println("deletePersListener");
        EinsatzView instance = null;
        instance.deletePersListener();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEquListener method, of class EinsatzView.
     */
    @Test
    public void testDeleteEquListener() {
        System.out.println("deleteEquListener");
        EinsatzView instance = null;
        instance.deleteEquListener();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatumField method, of class EinsatzView.
     */
    @Test
    public void testGetDatumField() {
        System.out.println("getDatumField");
        EinsatzView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getDatumField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrtField method, of class EinsatzView.
     */
    @Test
    public void testGetOrtField() {
        System.out.println("getOrtField");
        EinsatzView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getOrtField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdField method, of class EinsatzView.
     */
    @Test
    public void testGetIdField() {
        System.out.println("getIdField");
        EinsatzView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getIdField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStichwortField method, of class EinsatzView.
     */
    @Test
    public void testGetStichwortField() {
        System.out.println("getStichwortField");
        EinsatzView instance = null;
        JTextField expResult = null;
        JTextField result = instance.getStichwortField();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
