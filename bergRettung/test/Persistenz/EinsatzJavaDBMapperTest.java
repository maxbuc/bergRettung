/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import bergrettung.Einsatz;
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
public class EinsatzJavaDBMapperTest {
    
    public EinsatzJavaDBMapperTest() {
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
     * Test of insertEinsatz method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testInsertEinsatz() {
        System.out.println("insertEinsatz");
        Einsatz e = null;
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        instance.insertEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEinsatz method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testUpdateEinsatz() {
        System.out.println("updateEinsatz");
        Einsatz e = null;
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        instance.updateEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEinsatz method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testDeleteEinsatz() {
        System.out.println("deleteEinsatz");
        int id = 0;
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        instance.deleteEinsatz(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEinsatzAlt method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testReadEinsatzAlt() {
        System.out.println("readEinsatzAlt");
        int id = 0;
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        Einsatz expResult = null;
        Einsatz result = instance.readEinsatzAlt(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readEinsatz method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testReadEinsatz() {
        System.out.println("readEinsatz");
        int id = 0;
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        Einsatz expResult = null;
        Einsatz result = instance.readEinsatz(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        List<Einsatz> expResult = null;
        List<Einsatz> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class EinsatzJavaDBMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        EinsatzJavaDBMapper instance = new EinsatzJavaDBMapper();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
