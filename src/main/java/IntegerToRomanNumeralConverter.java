public class IntegerToRomanNumeralConverter {
    public String convertToRomanNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        while (number > 0) {
            if(number >= 9) {
                romanNumeral.append("X");
                number -= 10;

                if (number < 0) {
                    romanNumeral.insert(-1, "I");
                }
            }
            if (number >= 4) {
                romanNumeral.append("V");
                number -= 5;

                if (number < 0) {
                    romanNumeral.insert(-1, "I");
                }
            }
            if (number >= 1) {
                romanNumeral.append("I");
                number -= 1;
            }
        }
        return romanNumeral.toString();
    }
}
