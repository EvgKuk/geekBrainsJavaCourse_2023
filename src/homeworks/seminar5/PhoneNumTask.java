package homeworks.seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 1)Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */
public class PhoneNumTask {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addNum("Фамилия 1", 123, phoneBook);
        addNum("Фамилия 2", 456, phoneBook);
        addNum("Фамилия 3", 789, phoneBook);

        printPhoneBook(phoneBook);
    }

    //Метод добавления номера
    public static void addNum(String key, int val, Map<String, ArrayList<Integer>> map) {
        if (map.containsKey(key)) {
            map.get(key).add(val);
        }else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(val);
            map.put(key, list);
        }
    }

    //Метод вывода списка контактов телефонной книги
    public static void printPhoneBook(Map<String, ArrayList<Integer>> map){
        for (var item: map.entrySet()){
            String phoneNumber = "";
            for (int elem: item.getValue()){
                phoneNumber = phoneNumber + elem + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phoneNumber);
        }
    }
}
