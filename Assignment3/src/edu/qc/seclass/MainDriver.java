package edu.qc.seclass;

public class MainDriver {
/*
 * getString, setString, countNumbers,
 * getEveryNthCharacterFromBeginningOrEnd
 * convertDigitsToNamesInSubstring
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// "word" comes from MCS class
		MyCustomString test = new MyCustomString();
		
		String thing = "I'd b3tt3r put s0me d161ts in this 5tr1n6, right?";
		String boo = "321";
		String joke = null;
		String bar = "a1";
		System.out.println("length " + thing.length());
		test.setString(boo);
	//	System.out.println("this: " + test.getString(test.word));
	//	System.out.println("print countNums " + test.countNumbers());
	//	System.out.println(test.getString(test.word));
	//	System.out.println(test.getEveryNthCharacterFromBeginningOrEnd(3,true));
		test.convertDigitsToNamesInSubstring(0, 2);
		//System.out.println(test.word);
	}

}
