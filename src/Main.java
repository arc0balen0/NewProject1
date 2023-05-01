import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Иван", "Петров", 25));
        persons.add(new Person("Сергей", "Кузнецов", 30));
        persons.add(new Person("Елена", "Петрова-Сидорова", 28));
        persons.add(new Person("Алексей", "Сидоров", 35));

        Collections.sort(persons, new PersonComparator());

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}