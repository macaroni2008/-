package task4;

public class linearsearch {
    public static int linearsearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {5, 3, 7, 1, 4, 9, 2};
        int key = 4;
        int position = linearsearch(array, key);

        if (position != -1) {
            System.out.println("Элемент найден на позиции: " + position);
        } else {
            System.out.println("Элемент не найден");
        }
    }
}