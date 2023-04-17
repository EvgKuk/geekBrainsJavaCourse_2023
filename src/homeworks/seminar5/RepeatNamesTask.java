package homeworks.seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 2) Пусть дан список сотрудников:
 *
 * Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина,
 * Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов
 * Иван Иванов, Петр Чернышов, Мария Федорова, Марина Светлова,
 * Мария Савина, Иван Иванов, Мария Рыкова, Анна Крутова,
 * Марина Лугова, Анна Владимирова, Петр Лыков, Иван Мечников
 * Петр Петин, Петр Лыков, Иван Ежов
 * Написать программу, которая найдёт и выведет повторяющиеся
 * имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */
public class RepeatNamesTask {
    public static void main(String[] args) {
        String[] workers = new String[] {"Иван Иванов",
                "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов",
                "Иван Иванов", "Петр Чернышов", "Мария Федорова",
                "Марина Светлова", "Мария Савина", "Иван Иванов",
                "Мария Рыкова", "Анна Крутова", "Марина Лугова",
                "Анна Владимирова", "Петр Лыков", "Иван Мечников",
                "Петр Петин", "Петр Лыков", "Иван Ежов"};

        ArrayList<String> workersNames = getName(workers);

        Map<String, Integer> mapName = getMap(workersNames);

        System.out.println("Повторяющиеся имена: ");
        repeatNames(mapName);
        System.out.println("Имена, отсортированные по убыванию популярности: ");
        sortNames(mapName);
    }

    private static void sortNames(Map<String, Integer> mapName) {
        Map<Integer, ArrayList<String>> sortMap = new HashMap<>();
        ArrayList<Integer> listCount = new ArrayList<>();
        for(var item: mapName.entrySet()) {
            if (listCount.contains(item.getValue()) == false) listCount.add(item.getValue());
        }
        listCount.sort(null);
        for (int i = listCount.size()-1; i > -1; i--){
            for (var item: mapName.entrySet()){
                if (listCount.get(i) == item.getValue()) System.out.printf("%s : %d \n", item.getKey(), item.getValue());
            }
        }
    }

    private static void repeatNames(Map<String, Integer> mapName) {
        for(var item: mapName.entrySet()){
            if (item.getValue() > 1) System.out.printf("%s: %d \n", item.getKey(), item.getValue());
        }
    }

    private static Map<String, Integer> getMap(ArrayList<String> workersNames) {
        Map<String, Integer> mapName = new HashMap<>();
        for (int i = 0; i < workersNames.size(); i++) {
            int count = 1;
            for (int j = i + 1; j < workersNames.size(); j++){
                if (workersNames.get(i).equals(workersNames.get(j))) count += 1;
            }
            if (mapName.containsKey(workersNames.get(i)) == false) mapName.put(workersNames.get(i), count);
        }
        return mapName;
    }

    private static ArrayList<String> getName(String[] workers) {
        ArrayList<String> listName = new ArrayList<>();
        for (String w1: workers){
            String[] w1List = w1.split(" ");
            listName.add(w1List[0]);
        }
        return listName;
    }
}
