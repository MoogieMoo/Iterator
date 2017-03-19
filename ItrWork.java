// Maggie Xia
// APCS2 pd1
// HW20--DeIteratour
// 2017-03-17

/*****************************************************
 * class ItrWork -- skeleton
 * Allows for familiarization with iterators
 *****************************************************/

import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork 
{
    //using FOREACH loop
    //returns a boolean to indicate whether key is present in L
    public static boolean foundA( Integer key, List<Integer> L ) 
    { 
	for( Integer x : L ) {
	    if( x.equals( key ) ) {
		return true;
	    }
	}
	return false;
    }


    //explicitly using an iterator
    //returns a boolean to indicate whether key is present in L
    public static boolean foundB( Integer key, List<Integer> L ) 
    { 
	Iterator i = L.iterator();
	while( i.hasNext() ) {
	    Integer x = (Integer) i.next();
	    if( x.equals( key ) ) {
		return true;
	    }
	}
	return false;
    }


    //using FOREACH loop
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsA( List<Integer> L ) 
    { 
	List<Integer> odds = new ArrayList<Integer>();
	for( Integer x : L ) {
	    if( ( x % 2 ) != 0 ) {
		odds.add(x);
	    }
	}
	return odds;
    }


    //explicitly using an iterator
    //returns a list containing the odd numbers in L
    public static List<Integer> oddsB( List<Integer> L ) 
    { 
	List<Integer> odds = new ArrayList<Integer>();
	Iterator i = L.iterator();
	while( i.hasNext() ) {
	    Integer x = (Integer) i.next();
	    if( ( x % 2 ) != 0 ) {
	    odds.add(x);
	    }
	}    
	return odds;
    }


    //explicitly using an iterator
    //modifies L s.t. it contains no evens
    public static void removeEvens( List<Integer> L ) 
    {
	Iterator i = L.iterator();
	while ( i.hasNext() ){
	    Integer x = (Integer) i.next();
	    if ( ( x % 2 ) == 0 ){
	    	i.remove();
	    }
	}
    }



    public static void main( String [] args ) 
    {

	//var type: List   obj type: ArrayList	
	List<Integer> L = new ArrayList<Integer>();

	for( int i = 0; i < 10; i++ )
	    L.add(i);
	System.out.println( "List L: " );
	for( int n : L ) {
	    System.out.print(n);
	    System.out.print(" ");
	}

	// TASK: write code to print the contents of ArrayList L...

	// a) using a FOREACH loop


	// b) explicitly using an iterator

	System.out.println("\nTesting foundA...");
	System.out.println("9 in L? -> " + foundA(9,L) );
	System.out.println("13 in L? -> " + foundA(13,L) );

	System.out.println("\nTesting foundB...");
	System.out.println("9 in L? -> " + foundB(9,L) );
	System.out.println("13 in L? -> " + foundB(13,L) );

	System.out.println("\nTesting oddsA...");
	List<Integer> A = oddsA(L);
	for( int n : A ) {
	    System.out.print(n);
	    System.out.print(" ");
	}

	System.out.println("\nTesting oddsB...");
	List<Integer> B = oddsB(L);
	for( int n : B ) {
	    System.out.print(n);
	    System.out.print(" ");
	}

	System.out.println("\nTesting removeEvens...");
	removeEvens(L);
	for( int n : L ) {
	    System.out.print(n);
	    System.out.print(" ");
	}

	System.out.println( "---------------------------------");
	/*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
	~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    }//end main

}//end class ItrWork
