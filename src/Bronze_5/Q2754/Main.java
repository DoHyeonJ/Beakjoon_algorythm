package Bronze_5.Q2754;

/**
 * https://www.acmicpc.net/problem/2754
 * 문제
 * 어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.
 *
 * A+: 4.3, A0: 4.0, A-: 3.7
 *
 * B+: 3.3, B0: 3.0, B-: 2.7
 *
 * C+: 2.3, C0: 2.0, C-: 1.7
 *
 * D+: 1.3, D0: 1.0, D-: 0.7
 *
 * F: 0.0
 *
 * 입력
 * 첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.
 *
 * 출력
 * 첫째 줄에 C언어 평점을 출력한다.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String score = sc.next();
        double answer = 0.0;

        switch(score.charAt(0)) {
            case 'A': answer += 4.0;
                break;
            case 'B': answer += 3.0;
                break;
            case 'C': answer += 2.0;
                break;
            case 'D': answer += 1.0;
                break;
            case 'F': answer = 0.0;
                break;
        }

        if (score.length() > 1) {
            switch(score.charAt(1)) {
                case '+': answer += 0.3;
                    break;
                case '0': answer += 0.0;
                    break;
                case '-': answer -= 0.3;
                    break;
            }
        }

        System.out.print(answer);
    }
}
