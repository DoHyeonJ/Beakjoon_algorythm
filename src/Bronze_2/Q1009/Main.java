package Bronze_2.Q1009;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i=0; i<T; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int answer = 1;

            for (int j=0; j<B; j++) {
                answer = (answer*A) % 10;
            }

            answer = answer == 0 ?  10 : answer;

            System.out.println(answer);
        }

    }
}
