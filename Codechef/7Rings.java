// In Chefland, a valid phone number consists of 5 digits with no leading zeros.
// For example, 98765,10000, and 71023 are valid phone numbers while 04123,9231, and 872310 are not.
// Chef went to a store and purchased N items, where the cost of each item is X.
// Find whether the total bill is equivalent to a valid phone number.
  
// Input
// 4
// 25 785
// 402 11
// 100 100
// 333 333
  
// Output

// YES
// NO
// YES
// NO


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while(tc-- > 0){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int total = a*b;
		    
		    if(total >= 10000 && total <= 99999)
		      System.out.println("YES");
		    else
		      System.out.println("NO");
		}
	}
}
