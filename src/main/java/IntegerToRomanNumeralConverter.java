public class IntegerToRomanNumeralConverter {
    public String convertToRomanNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        while (number > 0) {
            if (number >= 5) {
                romanNumeral.append("V");
                number -= 5;
            }
            if (number >= 1) {
                romanNumeral.append("I");
                number -= 1;
            }
        }

        return romanNumeral.toString();
    }
}
