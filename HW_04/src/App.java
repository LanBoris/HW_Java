import java.util.LinkedList;

import Solutions.Task01;
public class App {
    public static void main(String[] args) throws Exception {
        // Solution Task 1
        LinkedList<String> list = new LinkedList<>();
        for (Integer i = 0; i < 10; i++) {
            String str = i.toString();
            list.add(str);
        }
        System.out.println("Given   List: " + list);
        LinkedList<String> result = Task01.ReverseList(list);
        System.out.println("Reverse List: " + result);

        // Solution Task 2


    }
}
