public class Main {
    public static void main(String[] args) {
        // 1. Crear las cuentas (Empiezan con saldo 0) 
        Cuenta miCuenta = new Cuenta();
        Cuenta cuentaAmigo = new Cuenta();

        System.out.println("--- Estado Inicial ---");
        System.out.println("Mi saldo: " + miCuenta.getSaldo());

        // 2. Realizar un ingreso válido
        System.out.println("\n--- Ingresando 500 euros ---");
        miCuenta.ingresar(500);
        System.out.println("Mi nuevo saldo: " + miCuenta.getSaldo());

        // 3. Intentar un ingreso inválido (Negativo o mayor a 6000)
        System.out.println("\n--- Intentando ingresar -100 euros ---");
        miCuenta.ingresar(-100);
        System.out.println("Saldo tras error: " + miCuenta.getSaldo());

        // 4. Realizar una transferencia (Límite 3000)
        System.out.println("\n--- Transfiriendo 100 euros a un amigo ---");
        miCuenta.transferir(cuentaAmigo, 100);
        System.out.println("Mi saldo actual: " + miCuenta.getSaldo());
        System.out.println("Saldo amigo: " + cuentaAmigo.getSaldo());

        // 5. Intentar transferencia que supera el límite
        System.out.println("\n--- Intentando transferencia de 3000.01 (Límite excedido) ---");
        miCuenta.ingresar(4000); // Subimos saldo para la prueba
        miCuenta.transferir(cuentaAmigo, 3000.01);
        System.out.println("Mi saldo (no debería cambiar): " + miCuenta.getSaldo());
    }
}