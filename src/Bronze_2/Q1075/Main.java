package Bronze_2.Q1075;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int F = sc.nextInt();
        int length = (int)(Math.log10(N)+1);
        String num = String.valueOf(N).substring(length-2);

        N -= Integer.parseInt(num);
        while(true) {
            if (N%F == 0) {
                String answer = String.valueOf(N).substring(length-2);
                System.out.print(answer);
                break;
            } else {
                N += 1;
            }
        }
    }
}
