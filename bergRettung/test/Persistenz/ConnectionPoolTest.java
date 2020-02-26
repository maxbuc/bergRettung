/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import java.sql.Connection;
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
public class ConnectionPoolTest {
    
    public ConnectionPoolTest() {
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
     * Test of getSinglePool method, of class ConnectionPool.
     */
    @Test
    public void testGetSinglePool() {
        System.out.println("getSinglePool");
        int size = 0;
        ConnectionPool expResult = null;
        ConnectionPool result = ConnectionPool.getSinglePool(size);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConn method, of class ConnectionPool.
     */
    @Test
    public void testGetConn() {
        System.out.println("getConn");
        ConnectionPool instance = null;
        Connection expResult = null;
        Connection result = instance.getConn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of releaseConn method, of class ConnectionPool.
     */
    @Test
    public void testReleaseConn() {
        System.out.println("releaseConn");
        Connection conn = null;
        ConnectionPool instance = null;
        instance.releaseConn(conn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
