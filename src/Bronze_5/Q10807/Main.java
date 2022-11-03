package Bronze_5.Q10807;

import java.util.*;

// 배열을 모두 만들어 반복문을 사용해 값을 비교한것과 시간복잡도 차이는 크지않음..
// 오히려 stream 을 사용한쪽이 더 느린것으로 보임
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int N = sc.nextInt();

        for (int i=0; i<N; i++) {
            list.add(sc.nextInt());
        }

        int v = sc.nextInt();

        System.out.print(list.stream().filter(str -> v == str).count());
    }
}
