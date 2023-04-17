package homeworks.seminar4;

import java.util.LinkedList;

/**
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */

public class TaskReverse {
    public static void main(String[] args) {
        //Создаём пустой LinkedList
        LinkedList linkedList = new LinkedList<String>();

        //Добавляем в LinkedList элементы
        linkedList.add("первый элемент");
        linkedList.add("второй элемент");
        linkedList.add("третий элемент");
        linkedList.add("четвёртый элемент");
        linkedList.add("пятый элемент");
        linkedList.add("шестой элемент");
        linkedList.add("сельмой элемент");

        System.out.print("Перечень элементов исходный: " + linkedList);

        LinkedList<String> revList = revLinkedList(linkedList);

        System.out.print("\n" + "Перечень элементов реверсный: " + revList);
    }

    //Метод для преворачивания списка
    public static LinkedList<String> revLinkedList(LinkedList linkedList) {
        LinkedList<String> reverseLinkedList = new LinkedList<String>();
        for (int i = linkedList.size() - 1; i >= 0; i--){
            reverseLinkedList.add((String) linkedList.get(i));
        }
        return reverseLinkedList;
    }

}

