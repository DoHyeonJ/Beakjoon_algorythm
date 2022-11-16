package Bronze_1.Q1110;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int num = N;
        int cycle = 0;

        while(true) {
            cycle++;
            int sum = (num/10) + (num%10);
            num = ((num%10)*10) + (sum%10);
            if (N == num) {
                System.out.println(cycle);
                break;
            }
        }

    }
}
