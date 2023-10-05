package software.ulpgc.es;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona isita= new Persona("Isita", LocalDate.of(2001,02,15));
        System.out.println(isita);
    }
}
