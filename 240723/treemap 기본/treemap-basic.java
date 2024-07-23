import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            String command = sc.next();
            switch(command) {
             case "add" : {
                int key = sc.nextInt();
                int value = sc.nextInt();
                map.put(key, value);
                break;
             }
             case "find" : {
                int key= sc.nextInt();
                Integer value = map.get(key);
                if(value == null) {
                    System.out.println("None");
                } else {
                    System.out.println(value);
                }
                break;
             }
             case "remove" : {
                int key= sc.nextInt();
                map.remove(key);
                break;
             }
             case "print_list" : {
                if(map.isEmpty()) {
                    System.out.println("None");
                    break;
                }
                Iterator<Entry<Integer, Integer>> it = map.entrySet().iterator();
                while(it.hasNext()) {
                    Entry<Integer, Integer> entry = it.next();
                    System.out.print(entry.getValue() + " ");
                }
                System.out.println();
                break;
             }
             default : break;
            }
        }
    }
}