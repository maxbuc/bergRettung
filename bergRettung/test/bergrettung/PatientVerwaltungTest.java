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
public class PatientVerwaltungTest {
    
    public PatientVerwaltungTest() {
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
     * Test of insertPatient method, of class PatientVerwaltung.
     */
    @Test
    public void testInsertPatient() {
        System.out.println("insertPatient");
        Patient p = null;
        PatientVerwaltung instance = new PatientVerwaltung();
        instance.insertPatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPatient method, of class PatientVerwaltung.
     */
    @Test
    public void testReadPatient() {
        System.out.println("readPatient");
        int id = 0;
        PatientVerwaltung instance = new PatientVerwaltung();
        Patient expResult = null;
        Patient result = instance.readPatient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientVerwaltung.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        int id = 0;
        PatientVerwaltung instance = new PatientVerwaltung();
        instance.deletePatient(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class PatientVerwaltung.
     */
    @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        Patient p = null;
        PatientVerwaltung instance = new PatientVerwaltung();
        instance.updatePatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class PatientVerwaltung.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        PatientVerwaltung instance = new PatientVerwaltung();
        List<Patient> expResult = null;
        List<Patient> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class PatientVerwaltung.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        PatientVerwaltung instance = new PatientVerwaltung();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
