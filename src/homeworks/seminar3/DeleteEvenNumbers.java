package homeworks.seminar3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Урок 3. Коллекции JAVA: Введение

 2 Пусть дан произвольный список целых чисел, удалить из него чётные числа

 */
public class DeleteEvenNumbers {

    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(62);
        numbers.add(35);
        numbers.add(1200);
        numbers.add(7);
        numbers.add(15);
        numbers.add(112);

        System.out.println("Исходный список: ");
        System.out.print(numbers + "\n");

        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer number = iterator.next();
            if (number % 2 == 0){
                iterator.remove();
            }
        }
        System.out.println("Список нечётных чисел: ");
        System.out.print(numbers);



    }

}
