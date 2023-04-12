package homeworks.seminar3;

import java.util.ArrayList;

/**
 * 3 Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее из этого списка.
 */

public class MinMaxMiddle {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(4);
        numbers.add(62);
        numbers.add(35);
        numbers.add(1200);
        numbers.add(7);
        numbers.add(15);
        numbers.add(112);

        System.out.println("Исходный список: " + numbers + "\n");

        int minOfNumbers = numbers.get(0);
        int maxOfNumbers = numbers.get(0);

        for (int i = 0; i < numbers.size(); i++){
            int number = numbers.get(i);

            if (number < minOfNumbers){
                minOfNumbers = number;
            }

            if (number > maxOfNumbers){
                maxOfNumbers = number;
            }
        }


        System.out.println("Минимальное число из списка: " + minOfNumbers);

        System.out.println("Максимальное число из списка: " + maxOfNumbers);

    }
}
