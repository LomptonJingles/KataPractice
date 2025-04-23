import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    @Test
    public void oneToITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(1);
        Assertions.assertEquals("I", romanNumeral);
    }

    @Test
    public void twoToIITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(2);
        Assertions.assertEquals("II", romanNumeral);
    }
}
