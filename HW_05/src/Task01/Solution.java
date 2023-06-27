package Task01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void PhoneBook (){
        HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        Scanner iScanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("1. Add contact.\n2. Print contacts.\n3. Exit");
            System.out.printf("Enter the command: ");
            String command = iScanner.nextLine();
            switch(command){
                case "1":
                    System.out.printf("Enter surname: ");
                    String surname = iScanner.nextLine();
                    if (!phoneBook.containsKey(surname)){
                        System.out.printf("Enter phone: ");
                        String phoneStr = iScanner.nextLine();
                        Integer phone = Integer.parseInt(phoneStr);
                        ArrayList<Integer> phones = new ArrayList<>();
                        phones.add(phone);
                        phoneBook.put(surname, phones);
                    } else {
                        System.out.printf("Enter phone: ");
                        String phoneStr = iScanner.nextLine();
                        Integer phone = Integer.parseInt(phoneStr);
                        phoneBook.get(surname).add(phone);
                    }
                    break;
                case "2":
                    PrintPhoneBook(phoneBook);
                    break;
                case "3":
                    flag = false;
                    break;
                default:
                    break;
            }
        }
        iScanner.close();
    }

    private static void PrintPhoneBook (HashMap<String, ArrayList<Integer>> inputHashMap){
        for (Map.Entry<String, ArrayList<Integer>> item: inputHashMap.entrySet()){
            System.out.println(item.getKey() + ": " 
                + item.getValue().toString().replace("[", "").replace("]", ""));
        }
    }
}
