
package idat.edu.pe.sigedu.util;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;  
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class JDBCUtilTest {
    JDBCUtil jdbc;
    
    public JDBCUtilTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        jdbc = new JDBCUtil();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConeccion method, of class JDBCUtil.
     */
    @Test
    public void testConeccionNoNula() {
            assertNotNull(jdbc.getConeccion());
    }
    
    
}
