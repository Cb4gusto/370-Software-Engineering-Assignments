package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC3 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBuggyMethod3_4() throws Exception {
        BuggyClass bc = new BuggyClass();
        int x = bc.buggyMethod3(2, 16);
        assertEquals(8, x);

    }
}