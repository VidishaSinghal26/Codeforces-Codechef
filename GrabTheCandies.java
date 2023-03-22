// Mihai and Bianca are playing with bags of candies. They have a row a of n bags of candies. The i-th bag has ai
//  candies. The bags are given to the players in the order from the first bag to the n-th bag.

// If a bag has an even number of candies, Mihai grabs the bag. Otherwise, Bianca grabs the bag. Once a bag is grabbed, the number of candies in it gets added to the total number of candies of the player that took it.

// Mihai wants to show off, so he wants to reorder the array so that at any moment (except at the start when they both have no candies), Mihai will have strictly more candies than Bianca. Help Mihai find out if such a reordering exists.

// Input
// The first line of the input contains an integer t(1≤t≤1000) — the number of test cases.

// The first line of each test case contains a single integer n(1≤n≤100) — the number of bags in the array.

// The second line of each test case contains n space-separated integers ai(1≤ai≤100) — the number of candies in each bag.

// Output
// For each test case, output "YES" (without quotes) if such a reordering exists, and "NO" (without quotes) otherwise.

import java.util.*;

public class GrabTheCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vtc = sc.nextInt();
        while(vtc-- >0){
            int kij = sc.nextInt();
            int[] lol = new int[kij];
            int mi =0,bi=0;
            for(int i = 0 ; i<kij ; i++){
                lol[i] = sc.nextInt();
                if(lol[i]%2 == 0){
                    mi += lol[i];
                }
                else{
                    bi += lol[i];
                }
            }
            if(mi>bi){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
