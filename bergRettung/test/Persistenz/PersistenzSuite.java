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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Maximilian
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Persistenz.IEquipmentMapperTest.class, Persistenz.ISetupMapperTest.class, Persistenz.ConnectionPoolTest.class, Persistenz.SetupJavaDBMapperTest.class, Persistenz.EinfacheFactoryTest.class, Persistenz.PatientJavaDBMapperTest.class, Persistenz.EquipmentJavaDBMapperTest.class, Persistenz.IEinsatzMapperTest.class, Persistenz.EinsatzJavaDBMapperTest.class, Persistenz.IPatientMapperTest.class, Persistenz.IPersonalMapperTest.class, Persistenz.PersonalJavaDBMapperTest.class})
public class PersistenzSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
