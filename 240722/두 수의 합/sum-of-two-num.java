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
            int key = sc.nextInt();
            arr[i] = key;
            if(map.get(key) == null) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }
        int result = 0;
        for(int i=0; i<n; i++) {
            if(map.size == 0) break;
            int key = arr[i];
            if(map.get(key) != null &&
            map.get(p-key) !=null) {
                result++;
                int keyValue = map.get(key) - 1;
                if(keyValue > 0) {
                    map.put(key, keyValue);
                } else {
                    map.remove(key);
                }
                int pValue = map.get(p-key) - 1;
                if(pValue > 0) {
                    map.put(p-key, pValue);
                } else {
                    map.remove(p-key);
                }
            }
        }
        System.out.println(result);
    }
}