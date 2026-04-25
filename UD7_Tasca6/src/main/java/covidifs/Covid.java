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
            String provincia ){

        boolean tieneFiebre = bodyTemperature >= 38;

        if (
                (tieneFiebre && difficultyBreathing) ||
                        (tieneFiebre && difficultyBreathing && diabetes) ||
                        (tieneFiebre && difficultyBreathing && cancer) ||
                        (tieneFiebre && difficultyBreathing && isPregnant)||
                        (tieneFiebre && difficultyBreathing && isOver60yearsold) ||
                        (tieneFiebre && difficultyBreathing && hepatic)||
                        (tieneFiebre && difficultyBreathing && kidnevDisease)||
                        (tieneFiebre && difficultyBreathing && respiratoryDisease)||
                        (tieneFiebre && diabetes)||
                        (tieneFiebre && cancer)||
                        (tieneFiebre && isPregnant)||
                        (tieneFiebre && isOver60yearsold)||
                        (tieneFiebre && hepatic)||
                        (tieneFiebre && kidnevDisease)||
                        (tieneFiebre && respiratoryDisease)
        ){
            return "/diagnostico/"+provincia;
        } else if(tieneFiebre ){
            return "/cuarentena/";
        } else if (!tieneFiebre){
            return "/diagnostico_bueno/";
        } else{
            return "/diagnostico_bueno/";
        }
    }
}