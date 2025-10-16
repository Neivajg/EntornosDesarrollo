//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void funcion1() {

        int a=2;
        String string1 = "string1";
        String string2 = "string2";

        /*
         1.Qué hacen estas dos líneas de código??? -->
            El código crea una cadena, le elimina el último carácter y le añade un "1".
            Resultado final: `string2 = "string1"`
        */

        string2= string2.substring(0, string2.length()-1);
        string2=string2+"1";

        System.out.println("Resultado final substring: " + string2);
        System.out.println("--------------------");

        /*
          1.Esta función tiene errores. Por qué no va el ==   ??? -->
             El operador `==` no compara el contenido de los Strings, solo la referencia a los objetos.
             Se debe usar `string1.equals(string2)`.
          2.Qué tengo que hacer para solucionarlo ???
            Lo desarrollado acontinuación en el código
        */

        boolean comparacionStrings = string1.equals(string2);

        System.out.println("Resultado comparación :" + comparacionStrings);

        if(comparacionStrings) {
            System.out.println("SON IGUALES " + a);
        }
        else {
            System.out.println("SON DIFERENTES");
        }

    }

    public static void funcion2() {
        System.out.println("--------------------");
        System.out.println("Esta es la función 2");
        System.out.println("Cómo hago la llamada para que funcione???? RESPUESTA --> En mi caso opte por la opción de añadir el static a dicha función");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a = 3;
        int i;
        for(i = 0; i<10; i++)
            a *= i;

        System.out.println("El valor de a es: " + a);

        funcion1();

        /*
        1. Esta función no me va ... ¿ por que ?
        2. Tengo dos soluciones .. ¿como?
             Respuesta en el archivo markdown
        */

        funcion2();
    }

}