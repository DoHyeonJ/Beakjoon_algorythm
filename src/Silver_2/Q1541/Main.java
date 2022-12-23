package Silver_2.Q1541;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String[] list = str.split("-");
        int answer = 0;

        answer += sum(list[0].split("\\+"));

        for (int i=1; i<list.length; i++) {
            answer -= sum(list[i].split("\\+"));
        }

        System.out.print(answer);
    }

    private static int sum(String[] str) {
        int sum = 0;

        for (String s : str) {
            sum += Integer.parseInt(s);
        }

        return sum;
    }
}