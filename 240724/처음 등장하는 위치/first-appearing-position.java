import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for(int i=0; i<n; i++) {
            int key = sc.nextInt();
            if(!map.containsKey(key)) {
                map.put(key, i+1);
            }
        }

        Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()) {
            Entry<Integer, Integer> entry =  it.next();
            System.out.println(entry.getKey()+ " " +entry.getValue());
        }
    }
}