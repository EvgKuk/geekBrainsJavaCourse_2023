package homeworks.seminar2;

//Урок 2. Почему вы не можете не использовать API
//1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//(через FileWriter).


import java.util.Arrays;
import java.util.logging.Logger;

public class Task2 {

    private static final Logger logger = Logger.getLogger(Task2.class.getName());
    public static void bubbleSort() {
        int[] array = {1, 10, 15, 2, 3, 40, 125};
        System.out.println("Начальный массив: " + Arrays.toString(array));
        logger.info("Начальный массив: " + Arrays.toString(array));
        int a = array.length;
        for (int i = 0; i < a-1; i++) {
            for (int j = 0; j < a - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            logger.info("Пормежуточный результат на этапе: " + (i + 1) + Arrays.toString(array));
        }
        System.out.println("Массив после сортировки пузырьком: " + Arrays.toString(array));
        logger.info("Массив после сортировки пузырьком: " + Arrays.toString(array));
    }


}
