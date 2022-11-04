package Bronze_5.Q10809;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        // a : 97 -> 아스키 코드
        for (int i=0; i<26; i++) {
            String alp = String.valueOf((char)('a'+i));
            System.out.println(S.indexOf(alp));
        }

    }
}
