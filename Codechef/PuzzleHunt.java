// Chef and some of his friends are planning to participate in a puzzle hunt event.

// The rules of the puzzle hunt state:
// "This hunt is intended for teams of 6 to 8 people."
  
// Chef's team has N people in total. Are they eligible to participate?

// Input:
// 4
// 6
  
// Output:
// No
// Yes

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		if( ip <=8 && ip >=6) 
		   System.out.println("YES");
		else
		    System.out.println("NO");
	}
}


  
