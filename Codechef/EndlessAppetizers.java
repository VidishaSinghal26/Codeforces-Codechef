// Life is a like a box of of mozzarella sticks. You never know what you're gonna get, but youcan predict with 100 percent accuracy that it will be a mozzarella stick.
// Chef's colleague issued a challenge to Chef: "If you eat more than X mozzarella sticks, I'llgive you 30 rupees for each extra one you eat".
// For example, if X = 5 and Chef eats 8 sticks, he would receive 90 rupees because he ate 3extra sticks.
// You know that the restaurant serves Y mozzarella sticks per plate.
// You also know that Chef received R rupees from his colleague as a result of the challenge.
// What's the maximum number of plates of mozzarella sticks that Chef could have ordered?
// Note:
// • Chef won't order a new plate till he finishes eating all the sticks from the previous one.
// • However, it's possible that Chef didn't finish all the sticks from the final plate he ordered.
// See the explained examples below for more clarification.

// Input:
// 4
// 7 5 30
// 16 5 0
// 15 9 120
// 23 1 2130

// Output:
// 2
// 4
// 3
// 94

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
		int tyu = sc.nextInt();
		while(tyu-- >0){
		    int xcv = sc.nextInt();
		    int yui = sc.nextInt();
		    int rty = sc.nextInt();
		    int c = 0;
		    int vbn = xcv + (rty/30);
		    while(vbn > 0){
		        vbn -= yui;
		        c++;
		    }
		    System.out.println(c);
		}
	}
}
