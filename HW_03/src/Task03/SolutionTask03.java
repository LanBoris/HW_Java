package Task03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка
 */
public class SolutionTask03 {
    public static List<Integer> FillArray(){
        List<Integer> listNumbers = new ArrayList<>();
        Random rnd = new Random();
        int size = 10;
        for (int i = 0; i < size; i++) {
            listNumbers.add(rnd.nextInt(100));
        }
        System.out.println(listNumbers);
        return listNumbers;
    }

    public static void FindMinimum(List<Integer> inputList){
        Integer minNum = inputList.get(0);
        for (Integer number : inputList) {
            if (number < minNum) minNum = number;
        }
        System.out.println("Минимальное значение: " + minNum);
    }

    public static void FindMaximum(List<Integer> inputList){
        Integer maxNum = inputList.get(0);
        for (Integer number : inputList) {
            if (number > maxNum) maxNum = number;
        }
        System.out.println("Максимальное значение: " + maxNum);
    }

    public static void FindAverage(List<Integer> inputList){
        Integer avgNum = inputList.get(0);
        Integer sumNumbers = inputList.get(0);
        for (Integer number : inputList) {
            sumNumbers += number;
        }
        avgNum = sumNumbers/inputList.size();
        System.out.println(" Среднее значение: " + avgNum);
    }
}
