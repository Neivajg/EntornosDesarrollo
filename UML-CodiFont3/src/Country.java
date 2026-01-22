
public class Country {

    private int id;
    private String name;

    //Constructor
    public Country(int id, String name) {
        this.id = id;
        this.name = name;
        //No hace falta referencias al state, ya que es una clase simple usada por State
    }

    // Métodos getter , setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
