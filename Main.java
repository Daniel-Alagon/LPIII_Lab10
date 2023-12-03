package Act01;

public class Main {
    public static void main(String[] args) {
        Float[] floatArray = {1.1f, 2.2f, 3.3f};
        Boolean[] booleanArray = {true, false, true};
        Persona[] personaArray = {
            new Persona("12345678", "Juan Perez", "Av. Miguel Grau 123"),
            new Persona("87654321", "Maria Lopez", "Av. San Martin 321"),
        };

        imprimirArray(floatArray);
        imprimirArray(booleanArray);
        imprimirArray(personaArray);
    }

    public static <T> void imprimirArray(T[] array) {
        for (T elemento : array) {
            System.out.println(elemento);
        }
    }
}
