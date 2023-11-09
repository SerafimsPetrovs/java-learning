package lv.acodemy;

public class MethodExercise {
    public static void main(String[] args) {

        System.out.println(fahrenheitConverter(120));
        System.out.println(currencyConverter("CZK", 50));
        System.out.println(isPalindrom("radar"));
        System.out.println(Calculator(5, "*", 2));


    }

    public static double fahrenheitConverter(double fahrenheit) {
        return (fahrenheit - 32) / 1.80000;
    }

    public static double currencyConverter(String currency, double money) {
        double convertedAmount;
        switch (currency) {
            case "PLN":
                convertedAmount = money * 4.45;
                break;
            case "CZK":
                convertedAmount = money * 24.55;
                break;
            case "GBP":
                convertedAmount = money * 0.87;
                break;
            default:
                throw new RuntimeException("Unsupported currency:" + currency);
        }
        return convertedAmount;

    }

    public static boolean isPalindrom(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        if (reversed.equals(word)) {
            return true;
        } else {
            return false;
        }
    }

    public static double Calculator(double fistNumber, String operation, double secondNumber) {
        double result = 0;
        switch (operation) {
            case "+":
                result = fistNumber + secondNumber;
                break;
            case "-":
                result = fistNumber - secondNumber;
                break;
            case "*":
                result = fistNumber * secondNumber;
                break;
            case "/":
                result = fistNumber / secondNumber;
                break;
            default:

        }
        return result;
    }
}
