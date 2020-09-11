package compar.builder;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Comparator<Person> personComparator = new PersonNameComparator()
                .thenComparing(new PersonAgeComparator(1));

        Person person1 = new Person.Builder()
                .withName("Jane")
                .withAge(21)
                .withHeight(165)
                .build();

        Person person2 = new Person.Builder()
                .withName("Jack")
                .withAge(26)
                .withHeight(185)
                .build();

        Person person3 = new Person.Builder()
                .withName("Sam")
                .withAge(31)
                .withHeight(176)
                .build();

        Person person4 = new Person.Builder()
                .withName("Sam")
                .withAge(24)
                .withHeight(176)
                .build();

        Collection<Person> people = new TreeSet<>(personComparator);

        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);

        for (Person p: people){
            System.out.println(p.getName() + " " + p.getAge());
        }
    }
}
