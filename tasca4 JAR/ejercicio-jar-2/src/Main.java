import es.iesmz.prueba.Coche;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Crear un coche Marca “Fiado” Modelo “Panda” Color “Amarillo”
        Coche coche1 = new Coche("Fiad", "Panda", "Amarillo");

        // Imprimir datos del coche correcto para ver que esta correcto
        coche1.imprime();

        // Mostrar un menú para  poder probar las opciones de la clase Coche:

        int opcionMenu = 0;


            do {
                System.out.println("===== MENÚ COCHE =====");
                System.out.println("1. Imprimir datos del coche");
                System.out.println("2. Pintar el coche");
                System.out.println("3. Establecer marca");
                System.out.println("4. Establecer modelo");
                System.out.println("5. Establecer color");
                System.out.println("6. Acelerar");
                System.out.println("7. Frenar");
                System.out.println("8. Parar");
                System.out.println("9. Salir");
                System.out.print("Elige una opción: ");
                opcionMenu = sc.nextInt();
                sc.nextLine(); // limpiar el buffer

                System.out.println("---------------------------------");
                System.out.println("Has elegido la opción: " + opcionMenu);
                System.out.println("---------------------------------");

                switch (opcionMenu) {
                    case 1:
                        coche1.imprime();
                        System.out.println("---------------------------------");
                        break;

                    case 2:
                        System.out.println("Pintar coche ");
                        coche1.pinta(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 3:
                        System.out.print("Nueva marca: ");
                        coche1.setMarca(sc.nextLine());
                        coche1.imprime(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 4:
                        System.out.print("Nuevo modelo: ");
                        coche1.setModelo(sc.nextLine());
                        coche1.imprime(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 5:
                        System.out.print("Nuevo color: ");
                        coche1.setColor(sc.nextLine());
                        coche1.imprime(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 6:
                        System.out.print("Velocidad a acelerar: ");
                        int vel = sc.nextInt();
                        coche1.acelera(vel);
                        coche1.imprime(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 7:
                        System.out.print("Velocidad a frenar: ");
                        int velFreno = sc.nextInt();
                        coche1.frena(velFreno);
                        coche1.imprime(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 8:
                        coche1.para();
                        System.out.println("El coche está detenido.");
                        coche1.imprime(); // IMPRIMIR EL COCHE PARA VISUALIZAR LOS CAMBIOS INSERTADOS
                        System.out.println("---------------------------------");
                        break;

                    case 9:
                        System.out.println("Saliendo del programa...");
                        break;


                    default:
                        System.out.println("Opción no válida");
                        break;
                }

            } while (opcionMenu != 9);

            System.out.println("Cerrandoooo menú... ¡Hasta pronto! :) ");

            sc.close();
    }
}
