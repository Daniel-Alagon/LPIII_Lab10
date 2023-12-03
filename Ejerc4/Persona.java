package Ejerc4;

public class Persona {
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return nombres.equals(persona.nombres);
    }
}
