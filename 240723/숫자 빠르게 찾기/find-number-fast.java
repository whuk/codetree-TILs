import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++) {
            map.put(sc.nextInt(), i+1);
        }

        for(int i=0;i<p;i++) {
            Integer result = map.get(sc.nextInt());
            if(result == null) {
                System.out.println(-1);
            } else {
                System.out.println(result);
            }
        }
    }
}