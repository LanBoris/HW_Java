package HW_01;
import java.util.Scanner;
/*
 * Реализовать простой калькулятор.
 */

public class task03 {
  public static void main(String[] args) {
    double firstNumber = EnterNumber();
    double secondNumber = EnterNumber();
    String operation = EnterOperation();
    double result = 0;
    if (operation.equals("+")){
      result = SumNumbers(firstNumber, secondNumber);
    }else if (operation.equals("-")){
      result = DiffNumbers(firstNumber, secondNumber);
    }else if (operation.equals("*")){
      result = MultiNumbers(firstNumber, secondNumber);
    } else if (operation.equals("/")){
      result = DivNumbers(firstNumber, secondNumber);
    }
    System.out.printf("%.0f %s %.0f = %.2f", firstNumber, operation, secondNumber, result);
  }

  private static String EnterOperation() {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Enter operation: ");
    String operation = iScanner.nextLine();
    return operation;
  }

  private static double EnterNumber() {
    Scanner iScanner = new Scanner(System.in);
    System.out.printf("Enter number: ");
    String firstNumberString = iScanner.nextLine();
    int number = Integer.parseInt(firstNumberString);
    return number;
  }

  private static double SumNumbers(double firstNum, double secNum) {
    return firstNum + secNum;
  }

  private static double DiffNumbers(double firstNum, double secNum) {
    return firstNum - secNum;
  }

  private static double MultiNumbers(double firstNum, double secNum) {
    return firstNum * secNum;
  }

  private static double DivNumbers(double firstNum, double secNum) {
    return firstNum / secNum;
  }

}
