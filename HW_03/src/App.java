import java.util.List;

import Task01.SolutionTask01;
import Task02.SolutionTask02;
import Task03.SolutionTask03;

public class App {
    public static void main(String[] args) throws Exception {
        // Решение задчи 1:
        int[] array = {2,3,1,4};
        System.out.println("Начальный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        SolutionTask01.SortArray(array);
        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }


        // Решение задачи 2:
        // SolutionTask02.DeleteAllEven();

        // Решение задачи 3:
        // List<Integer> solutionList = SolutionTask03.FillArray();
        // SolutionTask03.FindMinimum(solutionList);
        // SolutionTask03.FindMaximum(solutionList);
        // SolutionTask03.FindAverage(solutionList);



    }
}
