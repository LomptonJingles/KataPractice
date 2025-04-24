public class CountingTest {
    public static void main(String[] args) {
        IntegerToRomanNumeralConverter integerToRomanNumeralConverter = new IntegerToRomanNumeralConverter();
        for (int i = 0; i < 89; i++) {
            System.out.println(integerToRomanNumeralConverter.convertToRomanNumeral(i));
        }
    }
}
