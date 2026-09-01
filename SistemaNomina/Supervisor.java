package SistemaNomina;

public class Supervisor extends Empleado {

    public Supervisor(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (sueldoBase * 0.15); // 15% de bonificación
    }

    @Override
    public String obtenerDetalles() {
        return String.format("[%d] %s - Supervisor - $%.2f", id, nombre, calcularSueldo());
    }
}