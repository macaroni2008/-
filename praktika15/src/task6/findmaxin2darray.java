package task6;

public class findmaxin2darray {
    public static <E extends Comparable<E>> E findMax(E[][] array) {
        if (array == null ||  array.length == 0 || array[0].length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        E max = array[0][0];
        for (E[] row : array) {
            for (E element : row) {
                if (element.compareTo(max) > 0) {
                    max = element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[][] numbers = {
                { 15, 23, 7 },
                { 9, 37, 22 },
                { 12, 18, 29 }
        };

        Integer maxNumber = findMax(numbers);
        System.out.println("The largest number is: " + maxNumber);
    }
}