package Bronze_5.Q5597;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[30];

        for (int i=0; i<28; i++) {
            int idx = sc.nextInt();
            arr[idx-1] = 1;
        }

        for (int i=0; i<30; i++) {
            if (arr[i] == 0) {
                System.out.println(i+1);
            }
        }

    }
}