package lv.acodemy;

public class Methods {
    public static void main(String[] args) {
        String acodemy = "Acodemy";
        printSomeText(10, acodemy);
        printSomeText(5, "IT Acodemy");
        System.out.println(calculateSumOfTwoNumbers(20, 40));
        int sumOfTwoNumbers = calculateSumOfTwoNumbers(10, 20);
        System.out.println(sumOfTwoNumbers);
        printInfo("Serafim", "Petrov", 20);


    }

    public static void printSomeText(int loopCount, String text) {
        for (int i = 0; i < loopCount; i++) {
            System.out.println(text);

        }

    }

    public static int calculateSumOfTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;

    }

    //accept (string Name,string lastName,int age)
    public static void printInfo(String name, String lastName, int age) {
        if (name.equals("Jonh")) {
            System.out.println("You are fool");
        } else {
            System.out.printf("My name is %s. My surname is %s. I am %d years old.\n", name, lastName, age);
        }

    }

}
