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
public class IEinsatzMapperTest {
    
    public IEinsatzMapperTest() {
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
     * Test of readEinsatz method, of class IEinsatzMapper.
     */
    @Test
    public void testReadEinsatz() {
        System.out.println("readEinsatz");
        int id = 0;
        IEinsatzMapper instance = new IEinsatzMapperImpl();
        Einsatz expResult = null;
        Einsatz result = instance.readEinsatz(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class IEinsatzMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        IEinsatzMapper instance = new IEinsatzMapperImpl();
        List<Einsatz> expResult = null;
        List<Einsatz> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateEinsatz method, of class IEinsatzMapper.
     */
    @Test
    public void testUpdateEinsatz() {
        System.out.println("updateEinsatz");
        Einsatz e = null;
        IEinsatzMapper instance = new IEinsatzMapperImpl();
        instance.updateEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertEinsatz method, of class IEinsatzMapper.
     */
    @Test
    public void testInsertEinsatz() {
        System.out.println("insertEinsatz");
        Einsatz e = null;
        IEinsatzMapper instance = new IEinsatzMapperImpl();
        instance.insertEinsatz(e);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteEinsatz method, of class IEinsatzMapper.
     */
    @Test
    public void testDeleteEinsatz() {
        System.out.println("deleteEinsatz");
        int id = 0;
        IEinsatzMapper instance = new IEinsatzMapperImpl();
        instance.deleteEinsatz(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class IEinsatzMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        IEinsatzMapper instance = new IEinsatzMapperImpl();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IEinsatzMapperImpl implements IEinsatzMapper {

        public Einsatz readEinsatz(int id) {
            return null;
        }

        public List<Einsatz> readAll() {
            return null;
        }

        public void updateEinsatz(Einsatz e) {
        }

        public void insertEinsatz(Einsatz e) {
        }

        public void deleteEinsatz(int id) {
        }

        public int getNextFree() {
            return 0;
        }
    }
    
}
