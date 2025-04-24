import java.util.ArrayList;

public class IntegerToRomanNumeralConverter {
    public String convertToRomanNumeral(int number) {
        ArrayList<String> symbols = new ArrayList<>();
        StringBuilder romanNumeral = new StringBuilder();
        while (number > 0) {
            while (number > 3000) {
                symbols.add("Overflow error");
                number -= number;
            }
            while (number >= 900) {
                symbols.add("M");
                number -= 1000;
                if (number < 0) {
                    symbols.add(symbols.size() - 1, "C");
                    number += 100;
                }
            }
            while (number >= 400) {
                symbols.add("D");
                number -= 500;
                if (number < 0) {
                    symbols.add(symbols.size()-1, "C");
                    number+= 100;
                }
            }
            while (number >= 90) {
                symbols.add("C");
                number -= 100;
                if (number < 0) {
                    symbols.add(symbols.size()-1, "X");
                    number+= 10;
                }
            }
            while (number >= 40) {
                symbols.add("L");
                number -= 50;
                if (number < 0) {
                    symbols.add(symbols.size()-1, "X");
                    number+= 10;
                }
            }
            while (number >= 9) {
                symbols.add("X");
                number -= 10;
                if (number < 0) {
                    symbols.add(symbols.size()-1, "I");
                    number+= 1;
                }
            }
            while (number >= 4) {
                symbols.add("V");
                number -= 5;

                if (number < 0) {
                    symbols.add(symbols.size()-1, "I");
                    number+= 1;

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
        if (romanNumeral.isEmpty()) {
            romanNumeral.append("0 or below zero error");
        }
        return romanNumeral.toString();
    }
}
