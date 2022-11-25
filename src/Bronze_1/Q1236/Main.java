package Bronze_1.Q1236;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        int xCnt = 0;
        int yCnt = 0;

        for (int i=0; i<N; i++) {
            String str = sc.next();
            xCnt = str.contains("X") ? xCnt : xCnt + 1;
            for (int j=0; j<M; j++) {
                if (str.charAt(j) == 'X') {
                    arr[j] = 1;
                }
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == 0) {
                yCnt++;
            }
        }

        System.out.print(Math.max(xCnt, yCnt));
    }
}
