import java.util.*;

/**
 * Final launch of our program
 */
public class Main {
    public static void main(String[] args) {
        Comparator<Person> comparator = new SortByName().thenComparing(new SortBySum());

        ListOfPersonsCreater obj1 = new ListOfPersonsCreater();
        obj1.readingFileOfNamesFromConsole();
        obj1.listOfPersonsCreator();

        ListOfPersonsCreater.listOfPersons.sort(comparator);

        for (Person element : ListOfPersonsCreater.listOfPersons) {
            System.out.println(element);
        }
    }
}
