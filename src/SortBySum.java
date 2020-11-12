import java.util.Comparator;

/**
 * Realisation of sort using Comparator implement, sort by sum(int field of Person object)
 */
public class SortBySum implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getMoney() > o2.getMoney()) {
            return 1;
        }
        else if (o1.getMoney() < o2.getMoney()) {
            return -1;
        }
        else return 0;
    }
}
