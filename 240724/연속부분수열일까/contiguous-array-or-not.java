import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        int[] target = new int[p];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < p; i++) {
            target[i] = sc.nextInt();
        }

        String result = "No";
        for (int i = 0; i < n; i++) {
            if (arr[i] == target[0]) {

                for (int j = 1, k = i + 1; j < p; j++, k++) {
                    if (arr[k] != target[j]) {
                        result = "No";
                        break;
                    }
                    if (j == p - 1) {
                        result = "Yes";
                        break;
                    }
                }
                if (result.equals("Yes")) {
                    break;
                }
            }
        }
        System.out.println(result);
    }
}