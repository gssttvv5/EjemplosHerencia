package SistemaNomina;

public class Gerente extends Empleado {

    public Gerente(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * 0.25); // 25% de bonificación
    }

    @Override
    public String obtenerDetalles() {
        return String.format("[%d] %s - Gerente - $%.2f", id, nombre, calcularSueldo());
    }
}