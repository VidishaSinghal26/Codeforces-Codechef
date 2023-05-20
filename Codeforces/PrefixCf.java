// import java.util.Scanner;
// public class PrefixCf {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int vt = sc.nextInt();
//         while(vt-- >0){
//             int asslen = sc.nextInt();
//             int alen = 2*asslen - 2;
//             String[] ass = new String[alen];
//             String total ="";

//             for(int i = 0; i < alen ; i++){
//                 ass[i] = sc.next();
//                 if(ass[i].length() == asslen-1){
//                     total = total + ass[i];
//                  }
//                 }
//                 String  rev ="";
//                 for (int i = total.length() - 1; i >= 0; i--) {
//                     rev = rev + total.charAt(i);
//                 }
//                 if (total.equals(rev)) {
//                     System.out.println("YES");
//                 }
//                 else{
//                     System.out.println("NO");
//                 }
//         }
//     }
// }

import java.util.Scanner;

public class PrefixCf {
    public static boolean isPallindrome(String s) {
        int low=0;
        int high=s.length()-1;
        while(low<=high){
            if(s.charAt(low)!=s.charAt(high)){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int TCases=Integer.parseInt(sc.nextLine());
        while(TCases-->0){
        int len=Integer.parseInt(sc.nextLine());
        String arr[]=new String[(2*len)-2];
        String result="";
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextLine();
            if(arr[i].length()==len-1){
                result+=arr[i];
            }
        }
        if(isPallindrome(result)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
}