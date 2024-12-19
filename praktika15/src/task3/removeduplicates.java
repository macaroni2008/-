package task3;

import java.util.ArrayList;

public class removeduplicates {
    public static <E> ArrayList<E> removeduplicates(ArrayList<E> list) {
        ArrayList<E> result = new ArrayList<>();
        for (E element : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Artem");
        list.add("Arkadiy");
        list.add("Sasha");
        list.add("Arkadiy");
        list.add("Artem");

        System.out.println("Original List: " + list);
        ArrayList<String> uniqueList = removeduplicates(list);
        System.out.println("List without duplicates: " + uniqueList);
    }
}