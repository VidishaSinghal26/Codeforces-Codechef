// From an array A containing N integers, you construct a binary string S of length (N−1) as follows. For all 1≤i<N:
// If Ai < Ai+1 , then Si=0.
// If Ai > Ai+1, then Si=1.
// Given the string S, determine the count of indices i (1≤≤)(1≤i≤N) such that it is possible for Ai to be the maximum element of the array A.

// Sample Input:
// 3
// 2
// 0
// 7
// 000111
// 6
// 11100
  
// Sample Output:
// 1
// 1
// 2
  
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		 while(tc-->0){
       
		     int slen = sc.nextInt();
		     String s = sc.next();
		     int count = 0;
		     if(s.charAt(0) == '1'){
		          count++ ;
		     }
		     
		     for(int i = 0 ;i< s.length()-1 ; i++){
		         if(s.charAt(i) == '0' && s.charAt(i+1) == '1'){
		             count++;
		         }
         }
		     if(s.charAt(slen-2) == '0')
		        count++;
       
		    System.out.println(count);
		     
		 }
	}
}
