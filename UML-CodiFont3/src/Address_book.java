import java.util.ArrayList;
import java.util.List;

public class Address_book {
    private int code;
    /*
 se iniciliza la lista en la declaracion para evitar null pointer exception
 esto es por que si llamas a getPersonas() y no se ha inicializado la lista,
 obtendras un null pointer exception al intentar acceder a sus elementos.
 al inicializarla como una nueva lista vacia, te aseguras de que siempre haya
 una lista valida, incluso si no se han agregado personas todavia.
 de esta manera, puedes llamar a getPersonas() y obtener una lista vacia
 en lugar de un null, lo que facilita el manejo del codigo y evita errores.
 * */
    private ArrayList<Person> persons = new ArrayList<>();

    //Constructor

    public Address_book(int code, ArrayList<Person> personas) {
        this.code = code;
        this.persons = (persons != null) ? persons : new ArrayList<>();
    }

    // Métodos
    public Address_book(int code) {
        this.code = code;
    }
    //GETTERS

    public int getCode() {
        return code;
    }

    public ArrayList<Person> getPersonas() {
        return persons;
    }

    //SETTERS

    public void setCode(int code) {
        this.code = code;
    }

    public void setPersonas(ArrayList<Person> personas) {
        this.persons = personas;
    }
//PORQUE SE PONE EN LA CLASE ?
    @Override
    public String toString() {
        return "AddressBook{" +
                "code=" + code +
                ", personas=" + persons +
                '}';
    }

}
