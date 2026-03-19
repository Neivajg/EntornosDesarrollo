public class Cuenta {
    private double saldo;

    public Cuenta() {
        this.saldo = 0; // Las cuentas siempre se crean con saldo 0
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        // No se pueden hacer ingresos negativos
        // La cantidad máxima que se puede ingresar es de 6000
        if (cantidad <= 0 || cantidad > 6000) {
            return;
        }
        // El ingreso se realiza si cumple las condiciones
        this.saldo += cantidad;
    }

    public void retirar(double cantidad) {
        // No se puede retirar más del saldo disponible
        // No se pueden retirar cantidades negativas
        // La cantidad máxima que se puede retirar es de 6000
        if (cantidad <= 0 || cantidad > 6000 || cantidad > saldo) {
            return;
        }
        this.saldo -= cantidad;
    }

    public void transferir(Cuenta destino, double cantidad) {
        // El límite de cantidad transferida es de 3000
        // No se pueden transferir cantidades negativas
        if (cantidad <= 0 || cantidad > 3000 || cantidad > this.saldo) {
            return;
        }
        this.retirar(cantidad);
        destino.ingresar(cantidad);
    }
}