import java.util.Comparator;
import java.util.List;

/**
 * Realisation of comparator interface, sort by name(String field of Person object)
 */
public class SortByName implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }

}
