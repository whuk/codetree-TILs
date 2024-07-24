import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++) {
            String key = sc.next();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        for(Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}