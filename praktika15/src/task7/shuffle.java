package task7;

import java.util.ArrayList;
import java.util.Collections;

public class shuffle {
    public static <E> void shuffle(ArrayList<E> list) {
        Collections.shuffle(list);
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Arkadiy");
        words.add("Spartak");
        words.add("Artem");
        words.add("Arkadiy");
        words.add("Artem");

        System.out.println("Before shuffle: " + words);
        shuffle(words);
        System.out.println("After shuffle: " + words);
    }
}