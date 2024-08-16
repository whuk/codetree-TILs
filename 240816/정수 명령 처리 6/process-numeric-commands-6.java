import java.util.Scanner;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<n; i++) {
            String command = sc.next();
            

            switch(command) {
                case "push" : {
                    int p = sc.nextInt();
                    pq.add(-p);
                    break;
                }
                case "size" : {
                    System.out.println(pq.size());
                    break;
                }
                case "empty" : {
                    System.out.println(pq.size() == 0 ? 1 : 0);
                    break;
                }
                case "pop" : {
                    System.out.println(-pq.poll()); 
                    break;
                }
                case "top" : {
                    System.out.println(-pq.peek());
                    break;
                }
                default: break;
            }
        }
    }
}