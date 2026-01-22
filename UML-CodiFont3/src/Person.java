import java.util.List;

public class Person {
    private String name;
    private String Phone_number;
    private String Email_address;
    private Address address;
    private  Address_book addressBook; // lista de AddressBook


    //Constructor
    public Person(String name, String Phone_number, String Email_address, Address address,Address_book addressBook) {
        this.name = name;
        this.Phone_number = Phone_number;
        this.Email_address = Email_address;
        this.address = address;
        this.addressBook = addressBook;
    }

    //Métodos
    //GETTERS

    public String getName() {
        return name;
    }

    public String getTelefono() {
        return Phone_number;
    }

    public String getEmail() {
        return Email_address;
    }

    public Address getAdress() {
        return  address;
    }

    public Address_book getAddressBook() {
        return addressBook;
    }

    //SETTERS


    public void setName(String name) {
        this.name = name;
    }

    public void setTelefono(String telefono) {
        this.Phone_number = telefono;
    }

    public void setEmail(String email) {
        this.Email_address = email;
    }

    public void setAdress(Address adress) {
        this.address = adress;
    }

    public void setAddressBook(Address_book addressBook) {
        this.addressBook = addressBook;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", telefono='" + Phone_number + '\'' +
                ", email='" + Email_address + '\'' +
                ", adress=" + address +
                ", addressBook=" + addressBook +
                '}';
    }
}

