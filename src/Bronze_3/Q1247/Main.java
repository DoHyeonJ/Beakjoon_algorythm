package Bronze_3.Q1247;

import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            int N = sc.nextInt();
            BigInteger sum = new BigInteger("0");

            for (int i=0; i<N; i++) {
                sum = sum.add(sc.nextBigInteger());
            }

            if (sum.signum() == 0) {
                System.out.println(0);
            } else if (sum.signum() == 1) {
                System.out.println("+");
            } else {
                System.out.println("-");
            }
        }
    }
}
