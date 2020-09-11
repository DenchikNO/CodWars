package compar.builder;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {

    private int count;

    public PersonAgeComparator(int count) {
        this.count = count;
    }

    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getAge() < p2.getAge()) {
            return count;
        } else if (p1.getAge() > p2.getAge()) {
            return -count;
        } else return 0;
    }
}
