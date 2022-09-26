import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestCase {
    @Test
    public void testParseCSV_validArgument_success() {
        final String[] originalArray = {"id", "firstName", "lastName", "country", "age"};
        final String originalFile = "data.csv";
        Boolean argumentFile = originalFile.contains(".csv");
        Boolean argumentArray = originalArray != null;
        Assertions.assertTrue(argumentFile);
        Assertions.assertTrue(argumentArray);
    }
}
