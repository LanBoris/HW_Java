/*
 * Реализуйте алгоритм сортировки пузырьком числового массива, 
 * результат после каждой итерации запишите в лог-файл.
 */

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task02 {
    public static void main(String[] args) throws Exception {
        int[] array = {6,4,1,7,3,8};
        System.err.println("Изначальный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
        SortArray(array);
        System.out.println("\nОтсортированный массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + " ");
        }
    }

    private static void SortArray(int[] inputArray) throws Exception {
        Logger logger = Logger.getLogger(Task02.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fileHandler = new FileHandler("./HW_02/log.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fileHandler.setFormatter(sFormat);
        logger.addHandler(fileHandler);
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - i - 1 ; j++) {
                if (inputArray[ j+ 1] < inputArray[j]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
                logger.info("Changing of elements " + inputArray[i] + " and " + inputArray[j+1]);
            }
        }
    }
}
