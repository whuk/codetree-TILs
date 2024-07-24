import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        for(int i=0; i<n; i++) {
            String key = sc.next();
            if(!map.containsKey(key)) {
                map.put(key, 1);
            } else {
                map.put(key, map.get(key) + 1);
            }
        }

        Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Entry<String, Integer> entry = it.next();
            double rate = Math.round( Double.valueOf(entry.getValue()) *10000.0 / Double.valueOf(n) / 100.0) ;
            String result = String.format("%.4f", rate);
            System.out.println(entry.getKey() + " " + result);
        }
    }
}