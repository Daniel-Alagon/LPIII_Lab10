package Ejerc2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Antes del intercambio: " + Arrays.toString(integerArray));
        intercambiar(integerArray, 1, 3);
        System.out.println("Después del intercambio: " + Arrays.toString(integerArray));
    }

    public static <T> void intercambiar(T[] array, int pos1, int pos2) {
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }
}
