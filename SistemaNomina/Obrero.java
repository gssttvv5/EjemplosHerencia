package SistemaNomina;

public class Obrero extends Empleado {

    public Obrero(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase; // 0% de bonificación
    }

    @Override
    public String obtenerDetalles() {
        return String.format("[%d] %s - Obrero - $%.2f", id, nombre, calcularSueldo());
    }
}