import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<n; i++) {
            set.add(sc.nextInt());
        }

        int p = sc.nextInt();
        int[] result = new int[p];
        for(int i=0; i<p; i++) {
            if(set.contains(sc.nextInt())) {
                result[i] = 1;
            }
        }

        for(int i=0; i<p; i++) {
            System.out.print(result[i] + " ");
        }
    }
}