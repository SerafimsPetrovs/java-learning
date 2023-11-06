package lv.acodemy;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLesson {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 5, 8, 10, 11};
        int myNumber = numbers[4];
        System.out.println(myNumber);

        //determine size of array
        System.out.println("lenght is " + numbers.length);

        //change number in array
        numbers[5] = 1337;
        System.out.println(Arrays.toString(numbers));
        //create empty array
        int[] emptyArray = new int[12];
        System.out.println(Arrays.toString(emptyArray));
        emptyArray[0] = 12;
        emptyArray[1] = 1;
        emptyArray[2] = 11;
        emptyArray[3] = 13;
        emptyArray[4] = 145;
        emptyArray[5] = 1012;


        //string array
        String[] fruitBasket = {"apples", "banana", "kiwi", "pear", "pineapple"};
        // first fruit =apples =[0]
        String fruit = fruitBasket[3];
        System.out.println(fruit);

        //logic
        if (10 > 5) {
            System.out.println("statement is true");
        }

        if (fruitBasket[0].equals("apples")) {
            System.out.println("Yes,its apples");
        }

        //if-else(is,has)
        boolean isSummer = true;
        if (isSummer) {
            System.out.println("time to lay on the beach");
        } else {
            System.out.println("We will watch Netflix");
        }

        //if-else-if-else

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter traffic light color:");
        String light = myScanner.next();

        if (light.equals("Greem")) {
            System.out.println("You can go");
        } else if (light.equals("Yellow")) {
            System.out.println("You need to go faster");
        } else if (light.equals("Red")) {
            System.out.println("Stop");
        } else {
            System.out.println("Traffic light is not working");
        }

/////////////////////////////////////////////
        ///////////////////////////////////
        //////////////////////////////////

        // Even or Odd
        Scanner input = new Scanner(System.in);
        System.out.print("your int: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        //Largest of Three Numbers:
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = input2.nextInt();
        int num2 = input2.nextInt();
        int num3 = input2.nextInt();

        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }

        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);


        //Age Category Determiner:
        Scanner input3 = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input3.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 65) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior Citizen");
        }


        //Positive, Negative, or Zero Checker:
        Scanner input4 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double number2 = input.nextDouble();

        if (number2 > 0) {
            System.out.println("Positive number");
        } else if (number2 < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Zero");
        }


        //BMI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine the BMI category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 24.9) {
            category = "Normal Weight";
        } else if (bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Display the result
        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Category: " + category);


        //password

        Scanner scanner4 = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner4.nextLine();
        int length = password.length();
        boolean hasSpecialCharacter = !password.matches("[A-Za-z0-9]+");
        boolean hasUppercase = !password.equals(password.toLowerCase());
        String strength;
        if (length < 8 || !hasSpecialCharacter || !hasUppercase) {
            strength = "Weak";
        } else if (length >= 8 && length <= 11) {
            strength = "Medium";
        } else {
            strength = "Strong";
        }


    }


}
