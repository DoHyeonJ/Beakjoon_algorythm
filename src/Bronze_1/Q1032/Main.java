package Bronze_1.Q1032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] str = new String[N];

        for (int i=0; i<N; i++) {
            str[i] = sc.next();
        }

        StringBuilder answer = new StringBuilder(str[0]);

        for (int i=0; i<N; i++) {
            for (int j=i; j<N; j++) {
                for (int k=0; k<answer.length(); k++) {
                    if (str[i].charAt(k) != str[j].charAt(k)) {
                        answer.setCharAt(k, '?');
                    }
                }
            }
        }

        System.out.print(answer);
    }
}
