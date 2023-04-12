package homeworks.seminar3;

import java.util.Arrays;

/** Урок 3. Коллекции JAVA: Введение

        1 Реализовать алгоритм сортировки слиянием

*/

// !!! не могу понять где ошибка, что не выводит весь массив сортированный
// а выдаёт [1, 5, 7, 9, 10, 10, 45, 60, 60]

public class MergeSorting {
    public static void main(String[] args) {
        int[] array = {1, 5, 60, 500, 45, 7, 9, 10, 57};
        mergeSort(array);

        System.out.println(Arrays.toString(array));


    }
    public static void mergeSort(int[] array) {
        int n = array.length;


        int middleOfArray = n / 2;
        int[] leftOfArray = new int[middleOfArray];
        int[] rightOfArray = new int[n - middleOfArray];


        for (int i = 0; i < middleOfArray; i++) {
            leftOfArray[i] = array[i];
        }


        for (int i = middleOfArray; i < n; i++) {
            rightOfArray[i - middleOfArray] = array[i];
        }

        if (n == 1) return;

        mergeSort(leftOfArray);
        mergeSort(rightOfArray);
        merge(array, leftOfArray, rightOfArray);

    }

    public static void merge(int[] array, int[] leftOfArray, int[] rightOfArray) {
        int leftPart = leftOfArray.length;
        int rightPart = rightOfArray.length;
        int leftElementIndex = 0;
        int rightElementIndex = 0;
        int index = 0;

        while (leftElementIndex < leftPart && rightElementIndex < rightPart) {
            if (leftOfArray[leftElementIndex] < rightOfArray[rightElementIndex]) {
                array[index] = leftOfArray[leftElementIndex];
                leftElementIndex++;
                index++;



            } else {
                array[index] = rightOfArray[rightElementIndex];
                rightElementIndex++;
                index++;

            }
        }

        for (int leftRemainingPart = leftElementIndex; leftRemainingPart < leftPart; leftRemainingPart++)
            array[index++] = leftOfArray[leftRemainingPart];

        for (int rightRemainingPart = rightElementIndex; rightElementIndex < rightPart; rightElementIndex++)
            array[index++] = rightOfArray[rightRemainingPart];


    }




}
