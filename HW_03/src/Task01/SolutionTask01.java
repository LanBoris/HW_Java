package Task01;

import java.util.Arrays;

/*
 * Реализовать алгоритм сортировки слиянием(метод взять из Интернета)
 */
public class SolutionTask01 {
    public static int[] MergeSortArray(int[] inputArray){
        int[] tempArray1 = Arrays.copyOf(inputArray, inputArray.length);
        int[] tempArray2 = new int[inputArray.length];
        int[] mergedArray = SortArray(tempArray1, tempArray2, 0, inputArray.length);
        return mergedArray;
    }

    private static int[] SortArray(int[] inputArray1, int[] inputArray2, int start, int end){
        if (start >= end - 1){
            return inputArray1;
        }

        int middle = start + (end - start)/2;
        int[] sortArray1 = SortArray(inputArray1, inputArray2, start, middle);
        int[] sortArray2 = SortArray(inputArray1, inputArray2, middle, end);
        int pos1 = start;
        int pos2 = middle;
        int index = start;
        int[] resultArray = sortArray1 == inputArray1 ? inputArray2 : inputArray1;

        while (pos1 < middle && pos2 < end){
            if (sortArray1[pos1] < sortArray2[pos2]){
                resultArray[index++] = sortArray1[pos1++];
            } else {
                resultArray[index++] = sortArray2[pos2++];
            }
        }
        while (pos1 < middle){
            resultArray[index++] = sortArray1[pos1++];
        }
        while (pos2 < end){
            resultArray[index++] = sortArray2[pos2++];
        }
        
        return resultArray;
    }
}