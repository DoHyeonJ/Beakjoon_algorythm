package Bronze_1.Q1268;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner("11001100110011000001");

        String s = sc.next();

        List<String> list = new ArrayList<>(List.of(s.split("0")));
        System.out.println(list.removeAll(List.of("")));
    }
}