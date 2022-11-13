import java.util.*;

public class queue {

    // add = enque,offer();
    // remove = dequeue,poll();
    
    // public static void main(String[] args) {

    //     Queue<String> queue = new LinkedList<String>();
          
    //         queue.offer("Karen");
    //         queue.offer("Chad");
    //         queue.offer("Bingo");
    //         queue.offer("Joker");        
    //         queue.offer("Balki");

    //         System.out.println(queue.isEmpty());
    //         System.out.println(queue.size());
    //         System.out.println(queue.contains("Balki"));

    //         // System.out.println(queue.peek());
    //         // System.out.println(queue.poll());
    //         queue.poll();
    //         queue.poll();
    //         queue.poll();


    //         System.out.println(queue);



            // Priority Queue... // FIFO...


        public static void main(String args[]) {


        Queue<String> queue = new PriorityQueue<>();

        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");

        while (!queue.isEmpty()){

            System.out.println(queue.poll());
            
        }
        

    }

}
