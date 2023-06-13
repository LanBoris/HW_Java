package Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Пусть дан произвольный список целых чисел, удалить из него четные числа
 */
public class SolutionTask02 {

    public static void DeleteAllEven(){

        List<Integer> listNumbers = new ArrayList<>();
        Random rnd = new Random();
        int size = 20;

        for (int i = 0; i < size; i++) {
            listNumbers.add(rnd.nextInt(100));
        }
        System.out.println("Начальный список чисел: ");
        System.out.println(listNumbers);
        List<Integer> delList = new ArrayList<>();
        for (Integer number : listNumbers) {
            if (number%2 == 0) delList.add(number);
        }
        listNumbers.removeAll(delList);
        System.out.println("Список с удаленными четными числами: ");
        System.out.println(listNumbers);

    }
}