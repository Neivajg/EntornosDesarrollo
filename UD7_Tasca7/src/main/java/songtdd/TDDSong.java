package main.java.songtdd;

public class TDDSong {

    public static String song(String[] animals) {

        if (animals.length == 0) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < animals.length; i++) {

            String current = animals[i];

            // Primera línea
            if (i == 0) {
                result.append("There was an old lady who swallowed a ")
                        .append(current)
                        .append(".\n");
            } else {
                result.append("There was an old lady who swallowed a ")
                        .append(current)
                        .append(";\n");
            }

            // Caso SOLO un animal
            if (animals.length == 1) {
                result.append("I don't know why she swallowed a ")
                        .append(current)
                        .append(" - perhaps she'll die!\n");
                return result.toString();
            }

            // Frases especiales
            if (current.equals("spider")) {
                result.append("That wriggled and wiggled and tickled inside her.\n");
            }

            if (current.equals("bird")) {
                result.append("How absurd to swallow a bird.\n");
            }

            // Encadenamiento
            for (int j = i; j > 0; j--) {

                String a = animals[j];
                String b = animals[j - 1];

                result.append("She swallowed the ")
                        .append(a)
                        .append(" to catch the ")
                        .append(b);

                if (j == 1) {
                    result.append(";\n");
                } else {
                    result.append(",\n");
                }
            }

            // Línea final (SIEMPRE el primero)
            result.append("I don't know why she swallowed a ")
                    .append(animals[0])
                    .append(" - perhaps she'll die!\n");

            result.append("\n");
        }

        return result.toString();
    }
}