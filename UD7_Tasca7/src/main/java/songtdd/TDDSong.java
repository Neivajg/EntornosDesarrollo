package main.java.songtdd;

import java.util.List;

public class TDDSong {

    public static String song(List<String> animals) {
        if (animals.isEmpty()) return "";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < animals.size(); i++) {

            String current = animals.get(i);

            result.append("There was an old lady who swallowed a ")
                    .append(current);

            if (i == 0) {
                result.append(".\n");
            } else {
                result.append(";\n");
            }

            if (i == 0) {
                result.append(finalLine(current));
            } else {

                result.append(getSpecialLine(current, animals, i));

                for (int j = i; j > 0; j--) {
                    String a = animals.get(j);
                    String b = animals.get(j - 1);

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

                result.append(finalLine(animals.get(0)));
            }

            if (i < animals.size() - 1) {
                result.append("\n");
            } else if (animals.size() > 2) {
                result.append("\n");
            }
        }

        return result.toString();
    }

    private static String finalLine(String animal) {
        return "I don't know why she swallowed a " + animal + " - perhaps she'll die!\n";
    }

    private static String getSpecialLine(String animal, List<String> animals, int index) {

        if (animal.equals("bird")) {
            return "How absurd to swallow a bird.\n";
        }

        if (animal.equals("spider")) {
            if (animals.get(0).equals("fly")) {
                return "That wriggled and wiggled and tickled inside her.\n";
            } else {
                return "How absurd to swallow a spider.\n";
            }
        }

        if (animal.equals("fly") && index > 0) {
            return "That wriggled and wiggled and tickled inside her.\n";
        }

        return "";
    }
}