// There is an ATM machine. Initially, it contains a total of K units of money. N people (numbered through N) want to withdraw money; for each valid i, the i-th person wants to withdraw A i units of money.
// The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, this person will return home directly without trying to do anything else.
// For each person, determine whether they will get the required amount of money or not.

// Sample Input
// 2
// 5 10
// 3 5 3 2 1
// 4 6
// 10 8 6 4
  
// Sample Output
// 11010
// 0010

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner (System.in);
		int tc  = sc.nextInt();
		while(tc-->0){
		    int arr_size = sc.nextInt();
		    int tot_amt = sc.nextInt();
		    int arr[] = new int[arr_size];
		    String temp = "";
		    for (int i = 0; i< arr_size ; i++){
		        arr[i] = sc.nextInt();
		    } 
		    for (int i = 0; i< arr_size ; i++){
		        if(arr[i]<= tot_amt){
		            tot_amt -= arr[i];
		            temp  = temp+"1";
		        }
		        else{
		            temp += "0";
		        }
		    } 
		    System.out.println(temp);
		}
	}
}
