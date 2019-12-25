package edu.qc.seclass;

import org.junit.After; 
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest implements MyCustomStringInterface{

    private MyCustomStringInterface mycustomstring;
    
    // runs at the start
    @Before
    public void setUp() {
        mycustomstring = new MyCustomString();
    }
    
    // runs at the end
    @After
    public void tearDown() {
        mycustomstring = null;
    }

    @Test // given
    public void testCountNumbers1() {
    	 mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
    	 assertEquals(7, mycustomstring.countNumbers());
    }

    @Test // only numbers
    public void testCountNumbers2() {
    	mycustomstring.setString(" 1 3 33 7 ");
    	assertEquals(4, mycustomstring.countNumbers());
       
    }

    @Test // sentence with no numbers
    public void testCountNumbers3() {
    	mycustomstring.setString("No numbers will be found here.");
    	assertEquals(0, mycustomstring.countNumbers());
    }

    @Test // spelled out numbers
    public void testCountNumbers4() {
    	mycustomstring.setString("Zero Four Two Six");
    	assertEquals(0, mycustomstring.countNumbers());
    }
    
    // empty
    @Test
    public void testCountNumbers5() {
    	mycustomstring.setString("a1");
        assertEquals(1, mycustomstring.countNumbers());
    }
    
    // null
    @Test(expected = NullPointerException.class)
    public void testCountNumbers6() {
    	mycustomstring.setString(null);
    	assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("hr6r hns6 0t tb'", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd3() {
    	mycustomstring.setString("9 multipl");
        assertEquals("9 multipl", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0,false));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd4() {
    	mycustomstring.setString("9 multipl");
        assertEquals("lpitlum 9", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0,true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5() {
    	mycustomstring.setString("          ");
        assertEquals("     ", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2,false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
    	mycustomstring.setString(" e n i w ");
        assertEquals("wine", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2,true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
    	mycustomstring.setString("But,WhereAre aLong DrakeOuter");
        assertEquals("WALDO", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5,false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd8() {
    	mycustomstring.setString(" w i n e ");
        assertEquals("wine", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2,false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd9() {
    	mycustomstring.setString("vanguard");
        assertEquals("d", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8,false));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
    	mycustomstring.setString("vanguard");
        assertEquals("v", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8,true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
    	mycustomstring.setString("");
        assertEquals(0, mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0,true));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
    	mycustomstring.setString(" ");
        assertEquals(0, mycustomstring.getEveryNthCharacterFromBeginningOrEnd(-1,false));
    }

    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
    	mycustomstring.setString(null);
        assertEquals(null, mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5,false));
    }

    @Test(expected = NullPointerException.class)
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
    	mycustomstring.setString(null);
        assertEquals(null, mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5,true));
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
     }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertDigitsToNamesInSubstring2() { 
    	mycustomstring.setString("1");
        mycustomstring.convertDigitsToNamesInSubstring(99, 80);
    }

    @Test(expected = MyIndexOutOfBoundsException.class)
    public void testConvertDigitsToNamesInSubstring3() { 
    	mycustomstring.setString("");
        mycustomstring.convertDigitsToNamesInSubstring(99, 99);
    }

    @Test(expected = NullPointerException.class)
    public void testConvertDigitsToNamesInSubstring4() { 
    	mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(99, 99);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring5() {
    	 mycustomstring.setString("321");
         mycustomstring.convertDigitsToNamesInSubstring(0, 2);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
    	mycustomstring.setString("321");
        mycustomstring.convertDigitsToNamesInSubstring(0, 2);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        mycustomstring.setString(" Thre3 T2o 1ne ");
        mycustomstring.convertDigitsToNamesInSubstring(0, 14);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring8() {
    	 mycustomstring.setString("Last One but no more Numbers");
         mycustomstring.convertDigitsToNamesInSubstring(0, 18);
    }

}
