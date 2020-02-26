/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import bergrettung.Patient;
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
public class PatientJavaDBMapperTest {
    
    public PatientJavaDBMapperTest() {
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
     * Test of insertPatient method, of class PatientJavaDBMapper.
     */
    @Test
    public void testInsertPatient() {
        System.out.println("insertPatient");
        Patient p = null;
        PatientJavaDBMapper instance = new PatientJavaDBMapper();
        instance.insertPatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class PatientJavaDBMapper.
     */
    @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        Patient p = null;
        PatientJavaDBMapper instance = new PatientJavaDBMapper();
        instance.updatePatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class PatientJavaDBMapper.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        int id = 0;
        PatientJavaDBMapper instance = new PatientJavaDBMapper();
        instance.deletePatient(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readPatient method, of class PatientJavaDBMapper.
     */
    @Test
    public void testReadPatient() {
        System.out.println("readPatient");
        int id = 0;
        PatientJavaDBMapper instance = new PatientJavaDBMapper();
        Patient expResult = null;
        Patient result = instance.readPatient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class PatientJavaDBMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        PatientJavaDBMapper instance = new PatientJavaDBMapper();
        List<Patient> expResult = null;
        List<Patient> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class PatientJavaDBMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        PatientJavaDBMapper instance = new PatientJavaDBMapper();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
