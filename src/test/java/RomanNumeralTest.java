import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void oneToITest() {
        IntegerToRomanNumberalConverter integerToRomanNumberalConverter = new IntegerToRomanNumberalConverter();
        String romanNumeral = integerToRomanNumberalConverter.convertToRomanNumeral(1);
        Assertions.assertEquals("I", romanNumeral);
    }

    @Test
    public void twoToIITest() {
        IntegerToRomanNumberalConverter integerToRomanNumberalConverter = new IntegerToRomanNumberalConverter();
        String romanNumeral = integerToRomanNumberalConverter.convertToRomanNumeral(2);
        Assertions.assertEquals("II", romanNumeral);
    }
}
