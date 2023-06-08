// Alice and Bob are competing in a challenge. Initially Alice has N problems and Bob has M problems.
// Each time Alice solves a problem, Bob receives one more problem to solve.
// Each time Bob solves a problem, Alice receives three more problems to solve.
// Find whether it is possible that both of them have the same number of problems left if they can solve the problems in any arbitrary manner.

// Input
// 4
// 4 2
// 1 5
// 2 3
// 2 2

// Output
// YES
// YES
// NO
// YES


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
		    
		    if(Math.abs(a-b) %2 == 0)
		      System.out.println("YES");
		    else
		      System.out.println("NO");
		}
	}
}
