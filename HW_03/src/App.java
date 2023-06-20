import java.util.Arrays;
import java.util.List;

import Task01.SolutionTask01;
import Task02.SolutionTask02;
import Task03.SolutionTask03;

public class App {
    public static void main(String[] args) throws Exception {
        // Решение задчи 1:
        int[] array = {11,9,2,1,8,13,4,3,7,5};
        int[] resultArray = SolutionTask01.MergeSortArray(array);
        System.out.println("Начальный массив:");
        System.out.println(Arrays.toString(array));
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(resultArray));

        // Решение задачи 2:
        SolutionTask02.DeleteAllEven();

        // Решение задачи 3:
        List<Integer> solutionList = SolutionTask03.FillArray();
        SolutionTask03.FindMinimum(solutionList);
        SolutionTask03.FindMaximum(solutionList);
        SolutionTask03.FindAverage(solutionList);



    }
}
