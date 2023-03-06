import java.util.Scanner;

public class GammingCf {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tc = sc.nextInt();
        while(tc-- >0){
            int mons = sc.nextInt();
            int health[] = new int[mons];
            int ans =0;
            int ones=0;
            for(int i=0;i<mons;i++){
                health[i] = sc.nextInt();
                if(health[i]==1)
                  ones++;
            }
            int left = mons-ones;
            if(ones%2==0){
                ans = ones/2;
            }
            else{
                ans = ones/2 +1;
            }
            System.out.println(ans+left);
        }
    }
}
