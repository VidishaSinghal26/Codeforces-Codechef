// You are given three integers a, b, and c such that exactly one of these two equations is true:
// a+b=c
// a-b=c

// Output + if the first equation is true, and - otherwise.

// Input

// The first line contains a single integer t(1≤t≤162) — the number of test cases.

// Output
// For each test case, output either + or - on a new line, representing the correct equation.

import java.util.Scanner;

public class PlusMinusCf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vtc = sc.nextInt();
        while(vtc-- >0){
            int hy = sc.nextInt();
            int ju = sc.nextInt();
            int ki = sc.nextInt();
            if((hy-ju )== ki){
                System.out.println('-');
            }
            else{
                System.out.println('+');
            }
        }

    }
}