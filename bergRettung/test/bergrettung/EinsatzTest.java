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
public class EinsatzTest {
    
    public EinsatzTest() {
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
     * Test of getId method, of class Einsatz.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Einsatz instance = null;
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Einsatz.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Einsatz instance = null;
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDatum method, of class Einsatz.
     */
    @Test
    public void testGetDatum() {
        System.out.println("getDatum");
        Einsatz instance = null;
        String expResult = "";
        String result = instance.getDatum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDatum method, of class Einsatz.
     */
    @Test
    public void testSetDatum() {
        System.out.println("setDatum");
        String datum = "";
        Einsatz instance = null;
        instance.setDatum(datum);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrt method, of class Einsatz.
     */
    @Test
    public void testGetOrt() {
        System.out.println("getOrt");
        Einsatz instance = null;
        String expResult = "";
        String result = instance.getOrt();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrt method, of class Einsatz.
     */
    @Test
    public void testSetOrt() {
        System.out.println("setOrt");
        String ort = "";
        Einsatz instance = null;
        instance.setOrt(ort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStichwort method, of class Einsatz.
     */
    @Test
    public void testGetStichwort() {
        System.out.println("getStichwort");
        Einsatz instance = null;
        String expResult = "";
        String result = instance.getStichwort();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStichwort method, of class Einsatz.
     */
    @Test
    public void testSetStichwort() {
        System.out.println("setStichwort");
        String stichwort = "";
        Einsatz instance = null;
        instance.setStichwort(stichwort);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPersonal method, of class Einsatz.
     */
    @Test
    public void testGetPersonal() {
        System.out.println("getPersonal");
        Einsatz instance = null;
        List<Personal> expResult = null;
        List<Personal> result = instance.getPersonal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPersonal method, of class Einsatz.
     */
    @Test
    public void testSetPersonal() {
        System.out.println("setPersonal");
        List<Personal> personal = null;
        Einsatz instance = null;
        instance.setPersonal(personal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPersonal method, of class Einsatz.
     */
    @Test
    public void testAddPersonal() {
        System.out.println("addPersonal");
        Personal p = null;
        Einsatz instance = null;
        instance.addPersonal(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPatienten method, of class Einsatz.
     */
    @Test
    public void testGetPatienten() {
        System.out.println("getPatienten");
        Einsatz instance = null;
        List<Patient> expResult = null;
        List<Patient> result = instance.getPatienten();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPatienten method, of class Einsatz.
     */
    @Test
    public void testSetPatienten() {
        System.out.println("setPatienten");
        List<Patient> patienten = null;
        Einsatz instance = null;
        instance.setPatienten(patienten);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addPatient method, of class Einsatz.
     */
    @Test
    public void testAddPatient() {
        System.out.println("addPatient");
        Patient p = null;
        Einsatz instance = null;
        instance.addPatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEquipment method, of class Einsatz.
     */
    @Test
    public void testGetEquipment() {
        System.out.println("getEquipment");
        Einsatz instance = null;
        List<Equipment> expResult = null;
        List<Equipment> result = instance.getEquipment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEquipment method, of class Einsatz.
     */
    @Test
    public void testSetEquipment() {
        System.out.println("setEquipment");
        List<Equipment> equipment = null;
        Einsatz instance = null;
        instance.setEquipment(equipment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addEquipment method, of class Einsatz.
     */
    @Test
    public void testAddEquipment() {
        System.out.println("addEquipment");
        Equipment e = null;
        Einsatz instance = null;
        instance.addEquipment(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Einsatz.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Einsatz instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
