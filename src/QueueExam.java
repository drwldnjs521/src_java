import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
 public static void main(String[] args) {
     Queue<String> q = new LinkedList<>();

     q.offer("1");
     q.offer("2");
     q.offer("3");

     System.out.println(q);
     System.out.println(q.peek());
 }

}