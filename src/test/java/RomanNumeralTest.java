import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void oneToITest() {
        IntegerToRomanNumberalConverter integerToRomanNumberalConverter = new IntegerToRomanNumberalConverter();
        String romanNumeral = integerToRomanNumberalConverter.convertToRomanNumeral(1);
        Assertions.assertEquals("I", romanNumeral);
    }
}
