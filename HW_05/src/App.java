import Task01.Solution;
import Task02.Solution02;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Реализуйте структуру телефонной книги с помощью HashMap. 
         * Программа также должна учитывать, что во входной структуре будут 
         * повторяющиеся имена с разными телефонами, их необходимо считать, 
         * как одного человека с разными телефонами. Вывод должен быть отсортирован 
         * по убыванию числа телефонов.(можно выводить без сортировки, 
         * но обязательно в отдельном методе)
         */
        //Solution.PhoneBook();

        /*
         * Реализовать алгоритм пирамидальной сортировки (HeapSort)
         */

        int[] array = {12, 4, 7, 2, 21, -1, 5, 45, 90, 34, 22};

        Solution02.PrintArray(array);
        Solution02.heapSort(array);
        System.out.println();
        Solution02.PrintArray(array);
    }
}
