public class Address {

    private String street;
    private String city;
    private String postal_code;
    private State state;
    private Person person;

    //Constructor
    public Address(String street, String city, String postal_code,State state ) {
        this.street = street;
        this.city = city;
        this.postal_code = postal_code;
        this.state = state;
//        this.person = person; No es necesario meterlo en el constructor se puede crear sin persona
    }

    //Métodos

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getStreet() {
        return street;
    }
}
