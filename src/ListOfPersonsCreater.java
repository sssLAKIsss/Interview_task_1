import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfPersonsCreater {
    /**
     * This program is input list of names, id, sex and else, so
     * methods of this class are created new list of names only(listOfNames)
     * from input list, then created new list of Persons only(listOfPersons)
     */
    static List<Person> listOfPersons = new ArrayList<>();
    static List<String> listOfNames = new ArrayList<>();
    static int countOfPersons;
    /**
     * add in our "listOfPersons" new persons with parameters - "names" in our "listOfNames"
     * and "money" in our method "randomMoneyCreator()"
     */
    public void listOfPersonsCreator() {
        for (int i = 0; i < countOfPersons; i++) {
            listOfPersons.add(new Person(listOfNames.get((int) (Math.random() * listOfNames.size())), randomMoneyCreator()));
        }
    }

    /**
     * @return random int number of money for our future new Person
     */
    public int randomMoneyCreator() {
        int randomMoney = (int)(Math.random() * 100000);
        return randomMoney;
    }

    /**
     * reading filename from console, number of names which we want ro write in list "listOfNames"
     * and add this names in list "listOfNames"
     */
    public void readingFileOfNamesFromConsole() {
        int count = 0;
        BufferedReader reader = null;
        BufferedReader fileReader = null;
        try {
            reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите путь к файлу с базой данных имен");
            String fileName = reader.readLine() + ".csv";
            System.out.println("Сколько имен добавить из файла в список имен?");
            count = Integer.parseInt(reader.readLine()) + 1; // +1 because fist name in our file is "name", we'll deleted him later
            countOfPersons = count;
            reader.close();

            FileReader file = new FileReader(fileName);
            fileReader = new BufferedReader(file);
            String line = fileReader.readLine();

            while (line != null) {
                String [] lines;
                lines = line.split(";");

                listOfNames.add(lines[1]);

                line = fileReader.readLine();

                count --;
                if (count == 0) break;
            }

            listOfNames.remove(0); // first name in list is "name", incorrect

            file.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.print("Ошибка ввода! " + e );
        }
    }
}

