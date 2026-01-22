public class State {

    private int id;
    private String name;
    private Country country;

    //Constructor
    public State(int id,String name,Country country){
        this.id = id;
        this.name = name;
        this.country = country;
        // En este caso, se trae a país porque es relación a 1 y se referencia Country.
    }

    // Metodos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
