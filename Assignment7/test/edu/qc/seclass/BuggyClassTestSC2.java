package test.edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BuggyClassTestSC2 {

    @Before
    public  void setUp(){
    }

    @After
    public void tearDown(){
    }

    @Test
    public void testBuggyMethod2(){
        BuggyClass bc = new BuggyClass();
        int x = bc.buggyMethod2(1, 5);
        assertEquals(6, x);
    }

}