package Solutions;

import java.util.LinkedList;

/*
 * Пусть дан LinkedList с несколькими элементами. 
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task01 {
    public static LinkedList<String> ReverseList(LinkedList<String> list) {
        LinkedList<String> resultList = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            resultList.addFirst(list.get(i));
        }
        return resultList;
    }
}
