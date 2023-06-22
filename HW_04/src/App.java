import java.util.LinkedList;

import Solutions.Task01;
import Solutions.Task02;

public class App {
    public static void main(String[] args) throws Exception {
        // Solution Task 1
        LinkedList<String> list = new LinkedList<>();
        for (Integer i = 0; i < 10; i++) {
            String str = i.toString();
            list.add(str);
        }
        System.out.println("Given List: " + list);
        LinkedList<String> result = Task01.ReverseList(list);
        System.out.println("Reverse List: " + result);

        // Solution Task 2
        LinkedList<Integer> newQueue = Task02.FillQueue();
        Task02.PrintQueue(newQueue);
        Task02.Enqueue(newQueue);
        Task02.PrintQueue(newQueue);
        Integer removedElement = Task02.Dequeue(newQueue);
        Task02.PrintQueue(newQueue);
        System.out.println("Removed Element is [" + removedElement + "]");
        Integer firstElement = Task02.First(newQueue);
        Task02.PrintQueue(newQueue);
        System.out.println("First element is [" + firstElement + "]");
        Task02.PrintQueue(newQueue);

    }
}
