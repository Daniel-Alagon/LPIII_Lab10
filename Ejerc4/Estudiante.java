package Ejerc4;

public class Estudiante extends Persona{
    String carrera;

    // Constructor
    Estudiante(String dni, String nombres, String direccion, String carrera) {
        super(dni, nombres, direccion);
        this.carrera = carrera;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Estudiante estudiante = (Estudiante) obj;
        return carrera.equals(estudiante.carrera);
    }
}
