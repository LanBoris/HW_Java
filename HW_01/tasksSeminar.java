package HW_01;
import java.io.*;
public class tasksSeminar {
  public static void main(String[] args) throws IOException {
    task5();
    task8();
    task9();

  }

 

 /*
   * Во фразе "Добро пожаловать на курс по Java" 
   * переставить слова в обратном порядке
   */
  private static void task5() {
    String text = "Dobro pozhalovat' na kurs po Java";
    String[] textArr = text.split(" ");
    String[] resText = new String[textArr.length];
    int index = textArr.length-1;
    for (int i=0; i<textArr.length; i++){
        resText[index] = textArr[i];
        index--;
    }
    for (String item: textArr){
        System.out.printf("%s ", item);
    }
    System.out.println();
    for (String item: resText){
        System.out.printf("%s ", item);
    }
    
  }

  /*
   * Задан массив, например, nums = [1,7,3,6,5,6]. 
   * Написать программу, которая найдет индекс i для этого массива 
   * такой, что сумма элементов с индексами < i равна сумме 
   * элементов с индексами > i. 
   */
  private static void task8() {
    int[] array = {1,3,7,6,5,6};
    int sumOne = 0;
    int sumTwo = 0;
    int result = -1;
    for (int i = 0; i < array.length; i++) {
        for (int k = 0; k < i; k++) {
            sumOne = sumOne + array[k];
        }
        
        for (int j = i+1; j < array.length; j++) {
            sumTwo = sumTwo + array[j];
        }
        if (sumOne == sumTwo) result = i;
        sumOne = 0;
        sumTwo = 0;
    }
    for (int i = 0; i < array.length; i++) {
        System.out.printf("%d ", array[i]);
    }
    
    if (result == -1) System.out.println("\nThere is no such index.");
    else System.out.println("\nThis index is: " + result);
  }

  /*
  * Записать в файл следующие данные:
  * Name Surname Age
  * Kate Smith 20
  * Paul Green 25
  * Mike Black 23 
  */
  private static void task9() throws IOException {
    File file = new File("Test.txt");
    file.createNewFile();
    FileWriter writer = new FileWriter(file);
    writer.write(" Name, Surname, Age\n Kate Smith 20\n Paul Green 25\n Mike Black 23 ");
    writer.flush();
    writer.close();

    FileReader reader = new FileReader(file);
    char[] text = new char[1000];
    reader.read(text);
    for (char c: text) {
      System.out.print(c);
    }
    reader.close();
  }
}
