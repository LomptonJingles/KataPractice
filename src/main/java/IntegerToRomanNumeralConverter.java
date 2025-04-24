import java.util.ArrayList;

public class IntegerToRomanNumeralConverter {
    public String convertToRomanNumeral(int number) {
        ArrayList<String> symbols = new ArrayList<>();
        StringBuilder romanNumeral = new StringBuilder();
        while (number > 0) {
            while (number >= 40) {
                symbols.add("L");
                number -= 50;
                if (number < 0) {
                    symbols.add(symbols.size()-1, "X");
                }
            }
            while (number >= 9) {
                symbols.add("X");
                number -= 10;
                if (number < 0) {
                    symbols.add(symbols.size()-1, "I");
                }
            }
            while (number >= 4) {
                symbols.add("V");
                number -= 5;

                if (number < 0) {
                    symbols.add(symbols.size()-1, "I");
                }
            }
            if (number >= 1) {
                symbols.add("I");
                number -= 1;
            }
        }
        for (String symbol : symbols) {
            romanNumeral.append(symbol);
        }
        return romanNumeral.toString();
    }
}
