import java.sql.SQLOutput;
import java.util.*;

public class HomeWork_4_1 {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Orange", "Banana", "Kiwi", "Pineapple", "Pear", "Peach", "Lemon", "Grape", "Coconut", "Kiwi", "Banana", "Pineapple", "Kiwi", "Coconut", "Pineapple"};

        Set<String> uniqueFruit = new HashSet<>(Arrays.asList(fruits));
        System.out.println(uniqueFruit + "\n");

        Map<String, Integer> fruitMap = new HashMap<>();

/*        for (int i = 0; i < fruits.length; i++) {
            if (fruitMap.containsKey(fruits[i]))
                fruitMap.put(fruits[i], fruitMap.get(fruits[i]) + 1);
            else
                fruitMap.put(fruits[i], 1);
        }
        System.out.println(fruitMap + "\n")*/;

        for (String fruit : fruits) {
            fruitMap.put(fruit, fruitMap.getOrDefault(fruit, 0) + 1);
        }
        System.out.println(fruitMap + "\n");
    }
}
