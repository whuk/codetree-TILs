import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] arr = new int[n];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
            if(map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i],map.get(arr[i]) + 1);
            }
        }
        int result = 0;
        for(int i=0; i<n; i++) {
            int key = arr[i];
            if(map.get(key) == 1) {
                map.remove(key);
            } else {
                map.put(key, map.get(key) -1); 
            }
            if(map.get(p-key) != null) {
                result += map.get(p-key);
            }

         }

        System.out.println(result);
    }
}