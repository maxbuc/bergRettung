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
public class EinsatzVerwaltungWrapperTest {
    
    public EinsatzVerwaltungWrapperTest() {
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
     * Test of insertEinsatz method, of class EinsatzVerwaltungWrapper.
     */
    @Test
    public void testInsertEinsatz() {
        System.out.println("insertEinsatz");
        Einsatz e = null;
        EinsatzVerwaltungWrapper instance = new EinsatzVerwaltungWrapper();
        instance.insertEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEinsatz method, of class EinsatzVerwaltungWrapper.
     */
    @Test
    public void testDeleteEinsatz() {
        System.out.println("deleteEinsatz");
        int id = 0;
        EinsatzVerwaltungWrapper instance = new EinsatzVerwaltungWrapper();
        instance.deleteEinsatz(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEinsatz method, of class EinsatzVerwaltungWrapper.
     */
    @Test
    public void testUpdateEinsatz() {
        System.out.println("updateEinsatz");
        Einsatz e = null;
        EinsatzVerwaltungWrapper instance = new EinsatzVerwaltungWrapper();
        instance.updateEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEinsatz method, of class EinsatzVerwaltungWrapper.
     */
    @Test
    public void testReadEinsatz() {
        System.out.println("readEinsatz");
        int id = 0;
        EinsatzVerwaltungWrapper instance = new EinsatzVerwaltungWrapper();
        Einsatz expResult = null;
        Einsatz result = instance.readEinsatz(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class EinsatzVerwaltungWrapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        EinsatzVerwaltungWrapper instance = new EinsatzVerwaltungWrapper();
        List<Einsatz> expResult = null;
        List<Einsatz> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class EinsatzVerwaltungWrapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        EinsatzVerwaltungWrapper instance = new EinsatzVerwaltungWrapper();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
