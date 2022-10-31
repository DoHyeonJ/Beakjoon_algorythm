package Bronze_5.Q9086;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for (int i=0; i<testCase; i++) {
            String str = sc.next();
            System.out.print(str.charAt(0));
            System.out.print(str.charAt(str.length()-1));
            System.out.println();
        }
    }
}