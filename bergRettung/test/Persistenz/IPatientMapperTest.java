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
public class IPatientMapperTest {
    
    public IPatientMapperTest() {
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
     * Test of readPatient method, of class IPatientMapper.
     */
    @Test
    public void testReadPatient() {
        System.out.println("readPatient");
        int id = 0;
        IPatientMapper instance = new IPatientMapperImpl();
        Patient expResult = null;
        Patient result = instance.readPatient(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class IPatientMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        IPatientMapper instance = new IPatientMapperImpl();
        List<Patient> expResult = null;
        List<Patient> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePatient method, of class IPatientMapper.
     */
    @Test
    public void testUpdatePatient() {
        System.out.println("updatePatient");
        Patient p = null;
        IPatientMapper instance = new IPatientMapperImpl();
        instance.updatePatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertPatient method, of class IPatientMapper.
     */
    @Test
    public void testInsertPatient() {
        System.out.println("insertPatient");
        Patient p = null;
        IPatientMapper instance = new IPatientMapperImpl();
        instance.insertPatient(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePatient method, of class IPatientMapper.
     */
    @Test
    public void testDeletePatient() {
        System.out.println("deletePatient");
        int id = 0;
        IPatientMapper instance = new IPatientMapperImpl();
        instance.deletePatient(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class IPatientMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        IPatientMapper instance = new IPatientMapperImpl();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IPatientMapperImpl implements IPatientMapper {

        public Patient readPatient(int id) {
            return null;
        }

        public List<Patient> readAll() {
            return null;
        }

        public void updatePatient(Patient p) {
        }

        public void insertPatient(Patient p) {
        }

        public void deletePatient(int id) {
        }

        public int getNextFree() {
            return 0;
        }
    }
    
}
