package Act02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(minimo(1, 2, 3, 4));
        System.out.println(minimo(1.1, 2.2, 3.3, 4.4));
        System.out.println(minimo("uno", "dos", "tres", "cuatro"));
        System.out.println(minimo(
            new Persona("12345678", "Juan Perez", "Av. San Jose 123"),
            new Persona("87654321", "Maria Lopez", "Av. Miguel Grau 321"),
            new Persona("23456789", "Pedro Martinez", "Av. Ormeño 123"),
            new Persona("98765432", "Ana Torres", "Av. Miraflores 321")
        ));
    }

    public static <T extends Comparable<T>> T minimo(T a, T b, T c, T d) {
        return Arrays.asList(a, b, c, d).stream().min(T::compareTo).get();
    }
}
