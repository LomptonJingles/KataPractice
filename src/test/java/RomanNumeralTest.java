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
    public void fourToIVTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(4);
        Assertions.assertEquals("IV", romanNumeral);
    }

    @Test
    public void fiveToVTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(5);
        Assertions.assertEquals("V", romanNumeral);
    }

    @Test
    public void sixToVITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(6);
        Assertions.assertEquals("VI", romanNumeral);
    }

    @Test
    public void sevenToVIITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(7);
        Assertions.assertEquals("VII", romanNumeral);
    }

    @Test
    public void eightToVIIITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(8);
        Assertions.assertEquals("VIII", romanNumeral);
    }

    @Test
    public void nineToVIIITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(9);
        Assertions.assertEquals("IX", romanNumeral);
    }








}
