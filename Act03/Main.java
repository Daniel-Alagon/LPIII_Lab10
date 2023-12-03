package Act03;

public class Main {
    public static void main(String[] args) {
        try {
            Integer[] integerArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            imprimirArray(integerArray, 2, 5);
        } catch (LimiteInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }

    public static <T> void imprimirArray(T[] array, int limiteInferior, int limiteSuperior) throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteSuperior >= array.length || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Los límites proporcionados están fuera de rango.");
        }

        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            System.out.println(array[i]);
        }
    }
}
