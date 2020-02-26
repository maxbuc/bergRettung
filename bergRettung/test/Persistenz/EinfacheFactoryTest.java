/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

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
public class EinfacheFactoryTest {
    
    public EinfacheFactoryTest() {
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
     * Test of createPersonalMapper method, of class EinfacheFactory.
     */
    @Test
    public void testCreatePersonalMapper() {
        System.out.println("createPersonalMapper");
        IPersonalMapper expResult = null;
        IPersonalMapper result = EinfacheFactory.createPersonalMapper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createPatientMapper method, of class EinfacheFactory.
     */
    @Test
    public void testCreatePatientMapper() {
        System.out.println("createPatientMapper");
        IPatientMapper expResult = null;
        IPatientMapper result = EinfacheFactory.createPatientMapper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEquipmentMapper method, of class EinfacheFactory.
     */
    @Test
    public void testCreateEquipmentMapper() {
        System.out.println("createEquipmentMapper");
        IEquipmentMapper expResult = null;
        IEquipmentMapper result = EinfacheFactory.createEquipmentMapper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createEinsatzMapper method, of class EinfacheFactory.
     */
    @Test
    public void testCreateEinsatzMapper() {
        System.out.println("createEinsatzMapper");
        IEinsatzMapper expResult = null;
        IEinsatzMapper result = EinfacheFactory.createEinsatzMapper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createSetupMapper method, of class EinfacheFactory.
     */
    @Test
    public void testCreateSetupMapper() {
        System.out.println("createSetupMapper");
        ISetupMapper expResult = null;
        ISetupMapper result = EinfacheFactory.createSetupMapper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
