// In the bustling CodeChef office, the entrance is equipped with a high-tech card swipe
// system. Each employee is assigned a unique ID card that they use to swipe in and out of
// the building.
// The system records every swipe, capturing the first swipe of an ID as in, second as out,
// third as in, and so on. Given an array A consisting of N IDs denoting N swipes throughout
// the day, find the maximum number of people in the office at any time.
// Note that there is nobody inside the office before the first swipe.

// Input:
// 4
// 4
// 1 2 2 1
// 4
// 1 1 1 2
// 5
// 3 5 2 4 1
// 5
// 1 2 1 5 4

// Output:
// 2
// 2
// 5
// 3

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
		    int[] sdf = new int[asd];
		    for(int i = 0  ; i< asd ; i++){
		        sdf[i] = sc.nextInt();
		    }
		    int max = Integer.MIN_VALUE;
		    HashMap<Integer , Integer> map = new HashMap<>();
		    for(int io : sdf){
		        if(map.containsKey(io)){
		            map.remove(io);
		        }
		        else{
		            map.put(io,1);
		        }
		        max = Math.max(map.size() , max);
		    }
		    
		    System.out.println(max);
		}
	}
}
