/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistenz;

import bergrettung.Personal;
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
public class PersonalJavaDBMapperTest {
    
    public PersonalJavaDBMapperTest() {
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
     * Test of insert method, of class PersonalJavaDBMapper.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        Personal p = null;
        PersonalJavaDBMapper instance = new PersonalJavaDBMapper();
        instance.insert(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class PersonalJavaDBMapper.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        int id = 0;
        PersonalJavaDBMapper instance = new PersonalJavaDBMapper();
        instance.delete(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class PersonalJavaDBMapper.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Personal p = null;
        PersonalJavaDBMapper instance = new PersonalJavaDBMapper();
        instance.update(p);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readAll method, of class PersonalJavaDBMapper.
     */
    @Test
    public void testReadAll() {
        System.out.println("readAll");
        PersonalJavaDBMapper instance = new PersonalJavaDBMapper();
        List<Personal> expResult = null;
        List<Personal> result = instance.readAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of read method, of class PersonalJavaDBMapper.
     */
    @Test
    public void testRead() {
        System.out.println("read");
        int id = 0;
        PersonalJavaDBMapper instance = new PersonalJavaDBMapper();
        Personal expResult = null;
        Personal result = instance.read(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNextFree method, of class PersonalJavaDBMapper.
     */
    @Test
    public void testGetNextFree() {
        System.out.println("getNextFree");
        PersonalJavaDBMapper instance = new PersonalJavaDBMapper();
        int expResult = 0;
        int result = instance.getNextFree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
