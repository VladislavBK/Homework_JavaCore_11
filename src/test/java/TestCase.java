import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestCase {
    @Test
    public void testParseCSV_validArgument_success() throws FileNotFoundException {
        final String[] originalArray = {"id", "firstName", "lastName", "country", "age"};
        final String originalFile = "test.csv";
        List<Employee> expectedList = Main.parseCSV(originalArray, originalFile);
        Assertions.assertNotNull(expectedList);
    }

    @Test
    public void listToJson_validArgument_success() {
        List<Employee> testList = new ArrayList<>();
        testList.add(new Employee(1,"John","Smith","USA",25));
        testList.add(new Employee(2,"Ivan","Petrov","RU",23));
        String testJson = Main.listToJson(testList);
        Assertions.assertNotNull(testJson);
    }

    @Test
    public void writeString_validArgument_success() throws IOException {
        String fileName = "TestJson.json";
        List<Employee> testList = new ArrayList<>();
        testList.add(new Employee(1,"John","Smith","USA",25));
        testList.add(new Employee(2,"Ivan","Petrov","RU",23));

        String testJson = Main.listToJson(testList);
        Main.writeString(fileName, testJson);
        FileReader argument = new FileReader(fileName);
        FileReader expected = new FileReader("JsonFileTest.json");
        Assertions.assertEquals(expected, argument);
    }

}
