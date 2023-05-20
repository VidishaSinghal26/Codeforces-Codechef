// Vlad decided to compose a melody on his guitar. Let's represent the melody as a sequence of notes corresponding to the characters 'a', 'b', 'c', 'd', 'e', 'f', and 'g'.
// However, Vlad is not very experienced in playing the guitar and can only record exactly two notes at a time. Vlad wants to obtain the melody s, and to do this, he can merge the recorded melodies together. In this case, the last sound of the first melody must match the first sound of the second melody.
// For example, if Vlad recorded the melodies "ab" and "ba", he can merge them together and obtain the melody "aba", and then merge the result with "ab" to get "abab".
// Help Vlad determine the minimum number of melodies consisting of two notes that he needs to record in order to obtain the melody s.
    
// Sample Input:
// 5
// 4
// abab
// 7
// abacaba
// 6
// aaaaaa
// 7
// abcdefg
// 5
// babdd

// Sample Output:
// 2
// 4
// 1
// 6
// 4


import java.util.*;

public class MusicalPuzzleCF {
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
