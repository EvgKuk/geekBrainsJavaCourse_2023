package homeworks.seminar4;

import java.util.LinkedList;

/**
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */
public class TaskQueue {
    public static void main(String[] args) {
        int[] listNums = {1, 2, 3, 4, 5};

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer temp: listNums){
            linkedList.add(temp);
        }

        System.out.println("Исходный список " + linkedList);


        enqueue(linkedList,1);
        System.out.println("Список с перемещённым в конец первым элементом " + linkedList);

        dequeue(linkedList);
        System.out.println("Список с удалённым первым элементом " + linkedList);

        firstElem(linkedList);
        System.out.println("Первый элемент из очереди " + linkedList);
    }

    public static void enqueue(LinkedList<Integer> listNums, int num){
        listNums.addLast(num);
        listNums.remove(num-1);
    }

    public static int dequeue(LinkedList<Integer> listNums){
        int num = 0;
        num = listNums.get(0);
        listNums.remove(0);
        return num;
    }

    public static int firstElem(LinkedList<Integer> listNums){
        int num = listNums.get(0);
        return num;
    }

}
