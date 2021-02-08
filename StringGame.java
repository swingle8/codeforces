//https://codeforces.com/contest/1480/problem/A
import java.util.*;
public class StringGame {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        while (cases -- > 0 ) {
            String s = sc.next();
            StringBuffer sb  = new StringBuffer(s);
            int len = s.length();

            for (int i = 0 ; i < len ; i++) {
                char curr = s.charAt(i);
                //Alice turn Smallest alphabet here
                if (i%2 == 0) {
                    if (curr == 'a')
                        sb.replace(i, i+1, "b");
                    else
                        sb.replace(i, i+1, "a");
                }
                //Bob turn, largest alphabet
                else {
                    if (curr == 'z')
                        sb.replace(i, i+1, "y");
                    else
                        sb.replace(i, i+1, "z");
                }
            }
            System.out.println(sb.toString());
        }
    }

}