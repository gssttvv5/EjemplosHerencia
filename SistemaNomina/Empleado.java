package SistemaNomina;

public abstract class Empleado {
    protected String nombre;
    protected String cedula;
    protected double sueldoBase;
    protected int id;

    // Variables estáticas para el control global
    protected static int totalEmpleados = 0;
    protected static int proximoId = 1001;

    public Empleado(String nombre, String cedula, double sueldoBase) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        this.id = proximoId++;
        totalEmpleados++;
    }

    // Métodos abstractos que las subclases deberán implementar
    public abstract double calcularSueldo();
    public abstract String obtenerDetalles();

    // Métodos estáticos
    public static int obtenerTotalEmpleados() {
        return totalEmpleados;
    }

    public static void mostrarEstadisticas(double totalSueldos) {
        System.out.println("-----------------------------------------");
        System.out.printf("Total: $%.2f\n", totalSueldos);
        System.out.println("Total empleados: " + obtenerTotalEmpleados());
    }
}
