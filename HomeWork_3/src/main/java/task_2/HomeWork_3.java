package task_2;

import java.util.ArrayList;

public class HomeWork_3 {

    public static void main(String[] args) {
        ArrayList<Apple> appleList1 = new ArrayList<>();
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        appleList1.add(new Apple());
        Box<Apple> Box1 = new Box<>(appleList1);

        ArrayList<Orange> orangeList1 = new ArrayList<>();
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        orangeList1.add(new Orange());
        Box<Orange> Box2 = new Box<>(orangeList1);

        ArrayList<Apple> appleList2 = new ArrayList<>();
        Box<Apple> Box3 = new Box<>(appleList2);

        ArrayList<Orange> orangeList2 = new ArrayList<>();
        Box<Orange> Box4 = new Box<>(orangeList2);

        System.out.println("Вес первой коробки равен: " + Box1.getWeightList() + " грамм.");
        System.out.println("Вес второй коробки равен: " + Box2.getWeightList() + " грамм.");
        System.out.println("Вес третьей коробки равен: " + Box3.getWeightList() + " грамм.");
        System.out.println("Вес четвертой коробки равен: " + Box4.getWeightList() + " грамм.\n");

        System.out.println(Box1.compareList(Box2));
        System.out.println(Box3.compareList(Box4) + "\n");

        Box1.toEmptyList(Box3);
        Box2.toEmptyList(Box4);

        System.out.println("Вес первой коробки равен: " + Box1.getWeightList() + " грамм.");
        System.out.println("Вес второй коробки равен: " + Box2.getWeightList() + " грамм.");
        System.out.println("Вес третьей коробки равен: " + Box3.getWeightList() + " грамм.");
        System.out.println("Вес четвертой коробки равен: " + Box4.getWeightList() + " грамм.\n");

        System.out.println(Box1.compareList(Box2));
        System.out.println(Box3.compareList(Box4));
    }
}
