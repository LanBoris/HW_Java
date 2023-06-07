package HW_01;
import java.util.Scanner;

/**
  Вычислить сумма чисел от 1 до n
 */
public class task01 {

  public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Enter a number N: ");
    String numberString = iScanner.nextLine();
    int number = Integer.parseInt(numberString);
    System.out.println(number);
    int sum = 0;
    for (int i=1; i<=number; i++){
      sum+=i;
    }
    System.out.println("Sum of numbers from 1 to N = " + sum);
    iScanner.close();
  }
}