package edu.qc.seclass;

public class BuggyClass{
    private int result;


    public int buggyMethod1(int x, int y) {

        result = 0;
        if (y > 0) {
            result = y / x;
            y = y / x;
        }
        return result;

    }


    public int buggyMethod2(int x, int y) {
        result = 0;
        if (y > 0) {
            result = y/x ;
            if(result > 0 ){
                result = result + 1;
            }
        }
        return result;
    }

    public int buggyMethod3(int x, int y) {
        if (y > 0) {
            y = y / x;
        } else {
            y= y+ 2;
        }
        return y;
    }


    public void buggyMethod4(int x, int y) {
		/*
		Since branch coverage encompasses statement coverage, this is not possible.  This was explained
		in lecture that there could not be a possible path to get 100% branch coverage without getting
		100% statement coverage.
		 */


    }

    public void buggyMethod5 (int i) {
		/*
        If we are trying to execute 'x = i/0', where x and i are both integer variables.  This will
        throw an arithmetic exception.  In order to bypass this, we must set both variables to float,
        and only possible at initialization.

		 */
    }


}