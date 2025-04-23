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

    @Test
    public void threeToIIITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(3);
        Assertions.assertEquals("III", romanNumeral);
    }

    @Test
    public void fiveToVTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(5);
        Assertions.assertEquals("V", romanNumeral);
    }
}
