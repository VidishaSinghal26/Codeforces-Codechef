// You are given an array A = [A₁, A2,..., AN] containing N integers.
// For a fixed parameter K (1 ≤ K ≤ N), consider the following process:
// • You have a score, initially equal to 0.
// • There is a bucket, initially containing the elements A₁, A2,..., AK-1.
// • For each i from K to N:
// o Insert A; into the bucket.
// o Then, choose one element from the bucket, add it to your score, and remove it from
// the bucket.
// You'd like to maximize your score.
// For each K = 1, 2, 3,..., N, find the maximum possible score you can attain if you
// perform this process optimally with the parameter K.

// Input:
// 3
// 2
// 1 24
// 4
// 5 8 3 2
// 5
// 10 21 32 43 54

// Output:
// 25 24
// 18 16 13 8
// 160 150 129 97 54

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
		    int asd = sc.nextInt();
		    Long[] sdf = new Long[asd];
		    for(int i = 0  ; i< asd ; i++){
		        sdf[i] = sc.nextLong();
		    }
		    Arrays.sort(sdf);
		    long sum  = 0;
		    for(int i = 0 ; i < asd ; i++){
		            sum += sdf[i];
		    }
		    System.out.print(sum+" ");
		    long vbn = sum;
		    for(int  i = 0 ; i< asd-2 ;i++){
		        vbn -= sdf[i];
		        System.out.print(vbn+" ");
		    }
		    System.out.println(sdf[asd-1]);
		}
	}
}
