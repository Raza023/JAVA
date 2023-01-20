// import java.util.LinkedList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {

        //Priority Queue

        //It's FIFO data structure that serves 
        //elements with the highest priorities first
        //before elements with lower priority

        //PriorityQueue (it will arrange in accending order automatically.(by default))

        System.out.println("Double accending order: ");
        Queue<Double> queue = new PriorityQueue<Double>();

        queue.offer(3.1);
        queue.offer(3.4);
        queue.offer(3.5);
        queue.offer(3.3);
        queue.offer(3.2);
        queue.offer(3.7);

        while(!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

        System.out.println("Double deccending order:");
        Queue<Double> queue2 = new PriorityQueue<Double>(Collections.reverseOrder());

        queue2.offer(3.1);
        queue2.offer(3.4);
        queue2.offer(3.5);
        queue2.offer(3.3);
        queue2.offer(3.2);
        queue2.offer(3.7);

        while(!queue2.isEmpty())
        {
            System.out.println(queue2.poll());
        }
        
        System.out.println("String accending order:");
        Queue<String> queue3 = new PriorityQueue<String>();

        queue3.offer("Huzaifa");
        queue3.offer("Haider");
        queue3.offer("Hassan");
        queue3.offer("Rahil");
        queue3.offer("Ali");
        queue3.offer("Abbas");
        queue3.offer("Jawad");

        while(!queue3.isEmpty())
        {
            System.out.println(queue3.poll());
        }

        System.out.println("String deccending order:");
        Queue<String> queue4 = new PriorityQueue<String>(Collections.reverseOrder());

        queue4.offer("Huzaifa");
        queue4.offer("Haider");
        queue4.offer("Hassan");
        queue4.offer("Rahil");
        queue4.offer("Ali");
        queue4.offer("Abbas");
        queue4.offer("Jawad");

        while(!queue4.isEmpty())
        {
            System.out.println(queue4.poll());
        }

    }
}
