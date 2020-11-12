

/**
 * Class, witch has constructor of our object"Person"
 * and methods that give access to fields of this class
 */
public class Person {
    private String name;
    private int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return getName() + " имеет сумму, равную " + getMoney() ;
    }
}

