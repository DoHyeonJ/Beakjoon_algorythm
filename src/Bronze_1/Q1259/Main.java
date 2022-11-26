package Bronze_1.Q1259;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            String str = String.valueOf(num);
            String answer = "yes";

            for (int i=0; i<str.length(); i++) {
                if (str.charAt(i) != str.charAt(str.length()-i-1)) {
                    answer = "no";
                    break;
                }
            }

            System.out.println(answer);
        }
    }
}
