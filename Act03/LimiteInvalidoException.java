package Act03;

public class LimiteInvalidoException extends Exception{
    LimiteInvalidoException(String mensaje) {
        super(mensaje);
    }
}

class Persona {
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
}
