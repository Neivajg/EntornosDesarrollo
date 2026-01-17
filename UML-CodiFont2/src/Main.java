
//        A partir de la captura de pantalla proporcionada, cree un proyecto en IntelliJ en el que implemente el diagrama UML.
//        Además, se deberá crear un main en el que se llamen a los diferentes constructores para comprobar que todo funciona correctamente.
//        Por otra parte, se deberá investigar cómo añadir nuevos constructores a las clases Línea y Área, por ejemplo, pasando un array de puntos en lugar de puntos individuales.

        public class Main {
            public static void main(String[] args) {
                // Crear puntos
                Punt p1 = new Punt(1, 0, 0);
                Punt p2 = new Punt(2, 5, 0);
                Punt p3 = new Punt(3, 5, 5);
                Punt p4 = new Punt(4, 0, 5);

                // --- Mostrar puntos ---


                // --- Probar Linia ---
                Linia l1 = new Linia(1, p1, p2);
                System.out.println(l1);

                Punt[] arrayPuntsLinia = {p3, p4};
                Linia l2 = new Linia(2, arrayPuntsLinia);
                System.out.println(l2);

                // --- Probar Area ---
                Area a1 = new Area(1, p1, p2, p3);
                System.out.println(a1);

                Punt[] arrayPuntsArea = {p2, p3, p4};
                Area a2 = new Area(2, arrayPuntsArea);
                System.out.println(a2);
            }
        }
