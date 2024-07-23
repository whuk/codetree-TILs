import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for(int i=0;i<n;i++) {
        //     map.put(sc.nextInt(), i+1);
        // }

        // for(int i=0;i<p;i++) {
        //     Integer result = map.get(sc.nextInt());
        //     if(result == null) {
        //         System.out.println(-1);
        //     } else {
        //         System.out.println(result);
        //     }
        // }
        int[] arr = new int[n];
        for(int i=0;i<n; i++) {
            arr[i] = sc.nextInt();
        } 

        for(int i=0;i<p; i++) {
            int target = sc.nextInt();

            int result = -1;
            int left = 0;
            int right = n-1;
            while(left <= right) {
                int mid = (left + right) / 2;
                if(arr[mid] == target) {
                    result = mid+1;
                    break;
                }

                if(arr[mid] > target) {
                    right = mid -1;
                } else {
                    left = mid + 1;
                }
            }

            System.out.println(result);
        }
    }
}