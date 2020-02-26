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
public class SetupJavaDBMapperTest {
    
    public SetupJavaDBMapperTest() {
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
     * Test of deleteTable method, of class SetupJavaDBMapper.
     */
    @Test
    public void testDeleteTable() {
        System.out.println("deleteTable");
        SetupJavaDBMapper instance = new SetupJavaDBMapper();
        instance.deleteTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createTable method, of class SetupJavaDBMapper.
     */
    @Test
    public void testCreateTable() {
        System.out.println("createTable");
        SetupJavaDBMapper instance = new SetupJavaDBMapper();
        instance.createTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
