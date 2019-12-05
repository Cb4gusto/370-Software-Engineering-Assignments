package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestBC3 {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBuggyMethod3_1() throws Exception {

        BuggyClass bc2 = new BuggyClass();
        int y = bc2.buggyMethod3(2, 10);
        assertEquals(5, y);

    }
}