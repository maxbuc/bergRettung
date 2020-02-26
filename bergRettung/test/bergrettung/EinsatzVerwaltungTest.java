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
public class EinsatzVerwaltungTest {
    
    public EinsatzVerwaltungTest() {
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
     * Test of insertEinsatz method, of class EinsatzVerwaltung.
     */
    @Test
    public void testInsertEinsatz() {
        System.out.println("insertEinsatz");
        Einsatz e = null;
        EinsatzVerwaltung instance = new EinsatzVerwaltung();
        instance.insertEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEinsatz method, of class EinsatzVerwaltung.
     */
    @Test
    public void testReadEinsatz() {
        System.out.println("readEinsatz");
        int id = 0;
        EinsatzVerwaltung instance = new EinsatzVerwaltung();
        Einsatz expResult = null;
        Einsatz result = instance.readEinsatz(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEinsatz method, of class EinsatzVerwaltung.
     */
    @Test
    public void testDeleteEinsatz() {
        System.out.println("deleteEinsatz");
        int id = 0;
        EinsatzVerwaltung instance = new EinsatzVerwaltung();
        instance.deleteEinsatz(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEinsatz method, of class EinsatzVerwaltung.
     */
    @Test
    public void testUpdateEinsatz() {
        System.out.println("updateEinsatz");
        Einsatz e = null;
        EinsatzVerwaltung instance = new EinsatzVerwaltung();
        instance.updateEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class EinsatzVerwaltung.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        EinsatzVerwaltung instance = new EinsatzVerwaltung();
        List<Einsatz> expResult = null;
        List<Einsatz> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class EinsatzVerwaltung.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        EinsatzVerwaltung instance = new EinsatzVerwaltung();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
