package Bronze_1.Q1037;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int min = 1000001;
        int max = 1;

        for (int i=0; i<cnt; i++) {
            int yaksu = sc.nextInt();
            min = Math.min(min, yaksu);
            max = Math.max(max, yaksu);
        }

        System.out.print(min * max);
    }
}