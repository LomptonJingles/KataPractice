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


    @Test
    public void twentySixToXXVITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(26);
        Assertions.assertEquals("XXVI", romanNumeral);
    }


    @Test
    public void twentyNineToXXIXTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(29);
        Assertions.assertEquals("XXIX", romanNumeral);
    }


    @Test
    public void thirtyFourToXXXIVTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(34);
        Assertions.assertEquals("XXXIV", romanNumeral);
    }

    @Test
    public void thirtyEightToXXXVIIITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(38);
        Assertions.assertEquals("XXXVIII", romanNumeral);
    }


    @Test
    public void fortyToXLTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(40);
        Assertions.assertEquals("XL", romanNumeral);
    }

    @Test
    public void fortyOneToXLITest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(41);
        Assertions.assertEquals("XLI", romanNumeral);
    }

    @Test
    public void fortyFourToXLIVTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(44);
        Assertions.assertEquals("XLIV", romanNumeral);
    }


    @Test
    public void fiftyToLTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(50);
        Assertions.assertEquals("L", romanNumeral);
    }

    @Test
    public void eightyNineToLXXXIXTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(89);
        Assertions.assertEquals("LXXXIX", romanNumeral);
    }


    @Test
    public void ninetyToXCTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(90);
        Assertions.assertEquals("XC", romanNumeral);
    }

    @Test
    public void fourHundredToCDTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(400);
        Assertions.assertEquals("CD", romanNumeral);
    }

    @Test
    public void eightHundredNinetyNineToDCCCXCIXTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(899);
        Assertions.assertEquals("DCCCXCIX", romanNumeral);
    }

    @Test
    public void nineHundredToCMTest() {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        String romanNumeral = integerToRomanNumeralConverter.convertToRomanNumeral(900);
        Assertions.assertEquals("CM", romanNumeral);
    }

}
