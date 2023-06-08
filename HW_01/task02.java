package HW_01;
/*
 * Вывести все простые числа от 1 до 1000
 */

public class task02 {
  public static void main(String[] args) {
    for (int i = 0; i < 1000; i++) {
      if (TestPrimeNumber(i)){
        System.out.printf("%d ", i);
      }
    }
  }

  private static Boolean TestPrimeNumber(int num){
    boolean result = true;
    if (num <= 1) result = false;
    for (int i=2; i<1000; i++){
      if (num >= i && num%i == 0){
        if (i!=num){
          result = false;
          break;
        }
      }
    }
    return result;
  }

}
