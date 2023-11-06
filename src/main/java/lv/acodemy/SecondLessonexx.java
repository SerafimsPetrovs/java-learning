package lv.acodemy;

import java.util.Scanner;

public class SecondLessonexx {
    public static void main(String[] args) {
        do {


            // Even or Odd
            Scanner input = new Scanner(System.in);
            System.out.print("your int: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even number");
            } else {
                System.out.println("Odd number");
            }


            //Largest
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


            //Age Cat.
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
                System.out.println("Senior");
            }


            //Pos,neg or zero:
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
            //(BMI = weight (kg) / (height (m) * height (m)))
            Scanner input5 = new Scanner(System.in);
            System.out.print(" Your weight");
            double weight = input5.nextDouble();
            System.out.print("Your height ");
            double heightInCentimeters = input5.nextDouble();
            double heightInMeters = heightInCentimeters / 100.0;
            double bmi = weight / (heightInMeters * heightInMeters);
            String category;
            if (bmi < 18.5) {
                category = "low";
            } else if (bmi < 24.9) {
                category = "normal";
            } else if (bmi < 29.9) {
                category = "lilfat";
            } else {
                category = "fat";
            }
            System.out.println("Your bmi: " + bmi);
            System.out.println("BMI category: " + category);


            //password

            Scanner scanner6 = new Scanner(System.in);
            System.out.print("Enter your password: ");
            String password = scanner6.nextLine();
            int length = password.length();
            boolean hasSpecCharacter = false;
            boolean hasUppercase = false;
            for (int i = 0; i < length; i++) {
                char ch = password.charAt(i);
                if (!hasSpecCharacter && !Character.isLetterOrDigit(ch)) {
                    hasSpecCharacter = true;
                }
                if (!hasUppercase && Character.isUpperCase(ch)) {
                    hasUppercase = true;
                }
            }
            String strength;
            if (length < 8 || !hasSpecCharacter || !hasUppercase) {
                strength = "Weak";
            } else if (length >= 8 && length <= 11) {
                strength = "Medium";
            } else {
                strength = "Strong";
            }
            System.out.println("Password Strength: " + strength);


            //1-7
            Scanner scanner7 = new Scanner(System.in);
            System.out.println("Enter day of week as integer(1-7) ");
            int dayInteger = Integer.parseInt(scanner7.nextLine());
            switch (dayInteger) {
                case 1:
                    System.out.println("Its Monday");
                    break;
                case 2:
                    System.out.println("Its Tuesday");
                    break;
                case 3:
                    System.out.println("Its Wednesday");
                    break;
                case 4:
                    System.out.println("Its Thursday");
                    break;
                case 5:
                    System.out.println("Its Friday");
                    break;
                case 6:
                    System.out.println("its Saturday");
                case 7:
                    System.out.println("Its Sunday");
                    break;

            }

        } while (true);


    }
}
