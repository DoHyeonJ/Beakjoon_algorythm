package Bronze_5.Q6810;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 91;

        for (int i=0; i<3; i++) {
            int num = sc.nextInt();

            if (i%2 == 0) {
                sum += num*1;
            } else {
                sum += num*3;
            }
        }

        System.out.print("The 1-3-sum is " + sum);
    }
}

