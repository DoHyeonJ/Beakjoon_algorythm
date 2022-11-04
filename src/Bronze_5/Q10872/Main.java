package Bronze_5.Q10872;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int N = sc.nextInt();
        for (int i=1; i<=N; i++) {
            num *= i;
        }
        System.out.print(num);
    }
}
