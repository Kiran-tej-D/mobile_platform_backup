import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }
}

public class comparatorsAge {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("sreedhar", 63));
        people.add(new Person("vekshith", 4));
        people.add(new Person("Kiran", 24));
        people.add(new Person("Somu", 35));

        // Sorting by age using lambda expression
        Collections.sort(people, (p1, p2) -> p1.getAge() - p2.getAge());

        // Print sorted list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
