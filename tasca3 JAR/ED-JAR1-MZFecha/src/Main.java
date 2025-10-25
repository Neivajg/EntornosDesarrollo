//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //  Crear objeto o instanciar objeto
        MZFecha fecha1 = new MZFecha();
        // Añadir valores / Establecer Fecha
        fecha1.setFecha(2,5,2023);
        // imprimir Fecha establecida
        fecha1.imprime();


        //  Crear objeto2 o instanciar objeto
        MZFecha fecha2 = new MZFecha();
        // Añadir valores / Establecer Fecha
        fecha2.setFecha(2,6,2023);
        // Imprimir Fecha establecida
        fecha2.imprime();

        int diferencia = 0;
        // Obtener diferencia dias entre mis dos fechas
        diferencia = fecha1.diferenciaDias(fecha2);

        System.out.println("Diferencia dias: " + diferencia );
    }
}