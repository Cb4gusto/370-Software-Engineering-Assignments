package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BuggyClassTestSC1a {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testBuggyMethod1() throws Exception {
        BuggyClass bc = new BuggyClass();
        int x = bc.buggyMethod1(2, 4);
        assertEquals(2, x);
    }
}