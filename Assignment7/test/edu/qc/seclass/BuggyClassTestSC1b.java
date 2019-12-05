package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC1b {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testBuggyMethod1() throws Exception {
        BuggyClass bc = new BuggyClass();
        int x = bc.buggyMethod1(0, 5);
        assertEquals(0, x);
    }

}