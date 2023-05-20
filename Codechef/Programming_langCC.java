// Chef is a software developer, so he has to switch between different languages sometimes. Each programming language has some features, which are represented by integers here.
// Currently, Chef has to use a language with two given features A and B. He has two options --- switching to a language with two features A and B, or to a language with two features A and B  All four features of these two languages are pairwise distinct.
// Tell Chef whether he can use the first language, the second language or neither of these languages (if no single language has all the required features).


// Sample Input:

// 3
// 1 2 2 1 3 4
// 3 4 2 1 4 3
// 1 2 1 3 2 4
  
// Sample Output:

// 1
// 2
// 0
  
  
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
		int tc  = sc.nextInt();
		while(tc-->0){
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int A1 = sc.nextInt();
		    int B1 = sc.nextInt();
		    int A2 = sc.nextInt();
		    int B2 = sc.nextInt();
		    if((A==A1 && B == B1) || (A == B1 && B == A1)){
		        System.out.println("1");
		    }
		    else if((A==A2 && B == B2) || (A == B2 && B == A2)){
		        System.out.println("2");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
