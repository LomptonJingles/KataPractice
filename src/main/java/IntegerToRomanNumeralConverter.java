public class IntegerToRomanNumeralConverter {
    public String convertToRomanNumeral(int number) {
        StringBuilder romanNumeral = new StringBuilder();
        int repeatingI = 0;
        while (number > 0) {
            if (number >= 5) {
                romanNumeral.append("V");
                number -= 5;
            }
            if (number >= 1) {
                romanNumeral.append("I");
                number -= 1;
                repeatingI++;
            }
            if (repeatingI > 3) {
                romanNumeral.insert(1,"V");
                romanNumeral.delete(2,5);
            }
        }

        return romanNumeral.toString();
    }
}
