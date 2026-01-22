import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country pais1 = new Country(34, "España");
        Country pais2 = new Country(55, "Mexico");

        State estado1 = new State(12, "Alicante", pais1);
        State estado2 = new State(1, "CDMX ", pais2);

        Address address1 = new Address("Gerona", "Benidorm", "03200", estado1);
        Address address2 = new Address("Pino", "Distrito Federal", "06400", estado2);

        Address_book addressBook1 = new Address_book(151);

        Person persona1 = new Person("Angel", "5536620169", "ran@gmail.com", address1, addressBook1);
        Person persona2 = new Person("Alberto", "123456789", "trn52@gmail.com", address1, addressBook1);
        Person persona3 = new Person("Luis", "987654321", "qwerty123@gmail.com", address2, addressBook1);
        Person persona4 = new Person("ruben", "65498731", "mail321@gmail.com", address2, addressBook1);

        ArrayList<Person> arraysPersonas1 = new ArrayList<>();

        arraysPersonas1.add(persona1);
        arraysPersonas1.add(persona2);
        arraysPersonas1.add(persona3);
        arraysPersonas1.add(persona4);

        addressBook1.setPersonas(arraysPersonas1);

        // Imprimir resultados por pantalla
        System.out.println("=== AddressBook (cdigo) ===");
        System.out.println("Codigo: " + addressBook1.getCode());
        System.out.println();

        System.out.println("=== Personas en la libreta ===");
        if (addressBook1.getPersonas() != null) {
            for (Person p : addressBook1.getPersonas()) {
                System.out.println("Nombre: " + safe(p.getName()));
                System.out.println("Teléfono: " + safe(p.getTelefono()));
                System.out.println("Email: " + safe(p.getEmail()));

                Address a = p.getAdress();
                if (a != null) {
                    System.out.println("  calle: " + safe(a.getStreet()));
                    System.out.println("  ciudad: " + safe(a.getCity()));
                    System.out.println("  codigo postal: " + safe(a.getPostal_code()));
                    State s = a.getState();
                    if (s != null) {
                        System.out.println("  estado: " + safe(s.getName()) + " (id: " + s.getId() + ")");
                        Country c = s.getCountry();
                        if (c != null) {
                            System.out.println("  Pais: " + safe(c.getName()) + " (id: " + c.getId() + ")");
                        }
                    }
                }

                System.out.println("-----------------------------");
            }
        } else {
            System.out.println("(no hay personas en la libreta)");
        }

    }

    // Pequeña función auxiliar para evitar NPE al imprimir
    private static String safe(String s) {
        return s == null ? "(sin dato)" : s;
    }
}
