package software.ulpgc.es;

import java.time.LocalDate;

public class Persona {
    final String name;
    final LocalDate birthday;

    public Persona(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getAge(){
        return toyear(LocalDate.now().toEpochDay()- birthday.toEpochDay());
    }

    private int toyear(long days) {
        return (int) (days/365.25);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", edad= " + getAge() +
                '}';
    }
}
