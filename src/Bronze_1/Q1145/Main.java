package Bronze_1.Q1145;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int answer = 1;

        for (int i=0; i<5; i++) {
            arr[i] = sc.nextInt();
        }

        while (true) {
            int cnt = 0;
            for (int i=0; i<arr.length; i++) {
                if (answer%arr[i] == 0) {
                    cnt++;
                }
            }
            if (cnt >= 3) {
                break;
            }
            answer++;
        }

        System.out.print(answer);
    }
}
