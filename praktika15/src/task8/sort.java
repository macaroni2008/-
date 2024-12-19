package task8;

import java.util.ArrayList;
import java.util.Collections;

public class sort {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Spartak");
        words.add("Sasha");
        words.add("Spartak");
        words.add("Arkadiy");
        words.add("Artem");

        System.out.println("Before sort: " + words);
        sort(words);
        System.out.println("After sort: " + words);
    }
}