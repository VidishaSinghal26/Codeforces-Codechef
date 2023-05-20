import java.util.Scanner;

public class ComedianCf {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            int j1 = sc.nextInt();
            int j2 = sc.nextInt();
            int j3 = sc.nextInt();
            int j4 = sc.nextInt();
            int maxJokes = j1 + Math.min(j2, j3) + Math.max(0, Math.min(j2, j3) - Math.max(j2, j3));
        //     int alice=j1;
        //     int bob=j1;
        //    int ans=j1;
        //    int temp;
        //    while(j2>0 || j3>0 || j4>0){
        //     if(bob>0 && j2>0){
        //         temp = Math.min(j2,bob);
        //         bob-=temp;
        //         alice+=temp;
        //         ans+=temp;
        //         j2-=temp;
        //     }
        //     else if(alice>0 && j3>0){
        //         temp = Math.min(j3,alice);
        //         alice-=temp;
        //         bob+=temp;
        //         ans+=temp;
        //         j3-=temp;
        //     }
        //     else if(alice>0 && bob>0 && j4>0){
        //         temp = Math.min(j4, Math.min(alice,bob));
        //         ans+=temp;
        //         alice-=temp;
        //         bob-=bob;
        //         j4-=temp;
        //     }
        //     else{
        //         if(j2!=0 ||j3!=0 || j4!=0) ans++;
        //         break;
        //     }
        // }
        System.out.println(maxJokes);
        }
    }
}
