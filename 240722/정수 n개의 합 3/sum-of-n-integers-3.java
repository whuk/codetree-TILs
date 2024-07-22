import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[][] arr = new int[n+1][n+1];

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                arr[i][j] = sc.nextInt() +
                arr[i-1][j] + arr[i][j-1] - arr[i-1][j-1];
            }
        }

        int res = arr[p][p];
        for(int i=p; i<=n; i++) {
            for(int j=p; j<=n; j++) {
                res = Math.max(res,
                arr[i][j] - arr[i-p][j] - arr[i][j-p] +
                arr[i-p][j-p]
                );
            }
        }

        System.out.println(res);

    }
}