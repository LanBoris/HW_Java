package Task02;

public class Solution02 {
    /**
     * Метод создания дерева массива
     */
    public static void heapSort(int[] inputArray) {
        int length = inputArray.length;

        for (int i = length / 2 - 1; i >= 0; i--){
            heapify(inputArray, i, length);
        }
        for (int i = length - 1; i >= 0; i--) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[0];
            inputArray[0] = temp;
            heapify(inputArray, 0, i);
        }

    }

    /*
     * Метод изменения структуры данных в массиве.
     */
    private static void heapify(int[] inputArray, int i, int n) {
        int left = i * 2 + 1;
        int right = i * 2 + 2;
        int largestElem = i;
        if (left < n && inputArray[left] > inputArray[largestElem]){
            largestElem = left;
        }
        if (right < n && inputArray[right] > inputArray[largestElem]){
            largestElem = right;
        }
        if (i != largestElem) {
            int temp = inputArray[i];
            inputArray[i] = inputArray[largestElem];
            inputArray[largestElem] = temp;
            heapify(inputArray, largestElem, n);
        }
    }

    /*
     * Метод печати массива.
     */
    public static void PrintArray(int[] inputArray){
        for (int i = 0; i < inputArray.length; i++){
            System.out.print(inputArray[i] + " ");
        }
    }
}
