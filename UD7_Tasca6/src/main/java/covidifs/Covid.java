package main.java.covidifs;

public class Covid {

    public static String covid(
            float bodyTemperature,
            boolean difficultyBreathing,
            boolean diabetes,
            boolean cancer,
            boolean isPregnant,
            boolean isOver60yearsold,
            boolean hepatic,
            boolean kidnevDisease,
            boolean respiratoryDisease,
            String provincia ) {

        boolean tieneFiebre = bodyTemperature >= 38;

        boolean tieneRiesgo =
                difficultyBreathing ||
                        diabetes ||
                        cancer ||
                        isPregnant ||
                        isOver60yearsold ||
                        hepatic ||
                        kidnevDisease ||
                        respiratoryDisease;

        if (tieneFiebre && tieneRiesgo) {
            return "/diagnostico/" + provincia;
        }

        if (tieneFiebre) {
            return "/cuarentena/";
        }

        return "/diagnostico_bueno/";
    }
}