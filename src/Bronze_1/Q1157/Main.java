package Bronze_1.Q1157;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i=0; i<str.length(); i++) {
            char ch = Character.toUpperCase(str.charAt(i));
            if (hm.containsKey(ch)) {
                hm.put(ch ,hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        Integer max = Collections.max(hm.values());

        List<Character> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            if (entry.getValue().equals(max)) {
                list.add(entry.getKey());
            }
        }

        if (list.size() > 1) {
            System.out.print("?");
        } else {
            System.out.print(list.get(0));
        }

    }
}
