import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = sc.nextInt();
        for(int i=1; i<n; i++) {
            arr[i] = sc.nextInt() + arr[i-1];
        }
        int res = arr[p-1];
        for(int i=p; i<n; i++) {
            res =  Math.max(res, arr[i] - arr[i-p]);
        }
        System.out.println(res);
    }
}