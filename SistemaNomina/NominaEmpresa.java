package SistemaNomina;

public class NominaEmpresa {
    public static void main(String[] args) {

        Empleado[] nomina = new Empleado[8];


        nomina[0] = new Gerente("Laura", "111", 4000.00);
        nomina[1] = new Gerente("Roberto", "222", 4500.00);
        nomina[2] = new Supervisor("Ana", "333", 2500.00);
        nomina[3] = new Supervisor("Pedro", "444", 2700.00);
        nomina[4] = new Obrero("Carlos", "555", 1500.00);
        nomina[5] = new Obrero("Maria", "666", 1600.00);
        nomina[6] = new Obrero("Juan", "777", 1550.00);
        nomina[7] = new Obrero("Sofia", "888", 1580.00);

        double totalPagar = 0;

        for (Empleado emp : nomina) {
            System.out.println(emp.obtenerDetalles());
            totalPagar += emp.calcularSueldo();
        }

        Empleado.mostrarEstadisticas(totalPagar);
    }
}
