package Act02;

public class Persona implements Comparable<Persona>{
    String dni;
    String nombres;
    String direccion;

    // Constructor
    Persona(String dni, String nombres, String direccion) {
        this.dni = dni;
        this.nombres = nombres;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + dni + '\'' +
                ", nombres='" + nombres + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona otraPersona) {
        return this.nombres.compareTo(otraPersona.nombres);
    }
}
