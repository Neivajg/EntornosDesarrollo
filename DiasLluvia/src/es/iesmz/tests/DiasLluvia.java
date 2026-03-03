package es.iesmz.tests;

public class DiasLluvia {
    private boolean[][] lluvia;

    // Constructor
    public DiasLluvia() {
        // 12 meses y máximo 31 días
        lluvia = new boolean[12][31];
    }

    // Registrar si ha llovido o no
    public boolean registroDia(int dia, int mes, boolean lluviaDia) {

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }

        lluvia[mes - 1][dia - 1] = lluviaDia;
        return true;
    }

    // Consultar si ha llovido
    public boolean consultarDia(int dia, int mes) {

        if (mes < 1 || mes > 12 || dia < 1 || dia > 31) {
            return false;
        }

        return lluvia[mes - 1][dia - 1];
    }

    // Contar días lluviosos del año
    public int contarDiasLluviosos() {

        int contador = 0;

        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 31; dia++) {
                if (lluvia[mes][dia]) {
                    contador++;
                }
            }
        }

        return contador;
    }

    // Trimestre más lluvioso
    public int trimestreLluvioso() {

        int[] trimestres = new int[4];

        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 31; dia++) {
                if (lluvia[mes][dia]) {
                    trimestres[mes / 3]++;
                }
            }
        }

        int max = trimestres[0];
        int trimestre = 1;

        for (int i = 1; i < 4; i++) {
            if (trimestres[i] > max) {
                max = trimestres[i];
                trimestre = i + 1;
            }
        }

        return trimestre;
    }

    // Primer día que ha llovido
    public int primerDiaLluvia() {

        for (int mes = 0; mes < 12; mes++) {
            for (int dia = 0; dia < 31; dia++) {
                if (lluvia[mes][dia]) {
                    return dia + 1;
                }
            }
        }

        return -1; // si no ha llovido ningún día
    }
}
