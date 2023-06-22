package Solutions;

import java.util.LinkedList;
import java.util.Scanner;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди, 
 * dequeue() - возвращает первый элемент из очереди и удаляет его, 
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class Task02 {
    //Метод заполняет очередь
    public static LinkedList<Integer> FillQueue(){
        LinkedList<Integer> queue = new LinkedList<Integer>();
        for (int i=1;i<=10;i++){
            queue.add(i);
        }
        return queue;
    }

    //Метод печатает очередь
    public static void PrintQueue(LinkedList<Integer> inputQueue){
        System.out.println("Our queue: " + inputQueue);
    }

    //Метод переносит элемент с введенным индексом в конец очереди
    public static void Enqueue(LinkedList<Integer> inputQueue){
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Enter index to move to the end of queue: ");
        String indexString = iScanner.nextLine();
        int index = Integer.parseInt(indexString);
        Integer element = inputQueue.remove(index);
        inputQueue.addLast(element);
        iScanner.close();
    }

    //Метод возвращает и удаляет первый элемент очереди
    public static Integer Dequeue(LinkedList<Integer> inpuList){
        Integer elem = inpuList.removeFirst();
        return elem;
    }

    //Метод возвращает первый элемент очереди не удаляя его
    public static Integer First(LinkedList<Integer> inputQueue){
        Integer firstElement = inputQueue.get(0);
        return firstElement;
    }
}
