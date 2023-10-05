package unit3;

import java.util.LinkedList;
import java.util.Queue;

public class MyFifo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        int a = queue.poll();

        System.out.println(a +":" + queue);

        int b = queue.peek();

        System.out.println(b+":"+queue);

        queue.remove(1);
        System.out.println(queue);

        queue.clear();

        System.out.println(queue);
    }
}
