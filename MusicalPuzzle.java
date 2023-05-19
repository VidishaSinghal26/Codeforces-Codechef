import java.util.*;

public class MusicalPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vtc = sc.nextInt();
        while(vtc-- >0){
            int vidilen = sc.nextInt();
            String vidistr = sc.next();
            HashMap<String,Integer> vidimap = new HashMap<>();
            for(int i=0; i<vidilen-1 ;i++){
                String vs = vidistr.substring(i,i+2);
                if(!vidimap.containsKey(vs)){
                    vidimap.put(vs,i);
                }
            }
            System.out.println(vidimap.size());
        }
    }
}
