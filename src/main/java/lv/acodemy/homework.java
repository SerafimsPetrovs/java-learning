package lv.acodemy;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1=day of week 2=Number Range Checker");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Enter day of week as integer(1-7) ");
                    int dayInt = Integer.parseInt(scanner.nextLine());
                    switch (dayInt) {
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
                        default:
                            System.out.println("Error");

                    }
                    break;
                ////////////////////////////////////////////////////////////////////////////
                case 2:
                    Scanner scanner2 = new Scanner(System.in);
                    System.out.println("Enter the lower threshold");
                    double lowerTresh = Integer.parseInt(scanner2.nextLine());
                    System.out.println("Enter the upper threshold");
                    double upTresh = Integer.parseInt(scanner2.nextLine());
                    if (lowerTresh > upTresh || lowerTresh == upTresh) {
                        System.out.println("Error: Lower threshold is higher than the upper threshold");
                    } else {
                        System.out.println("Enter your number");
                        double selectedNum = Integer.parseInt(scanner2.nextLine());
                        if (selectedNum >= lowerTresh && selectedNum <= upTresh) {
                            System.out.println("Your number falls within the bounds");
                            //Great success(Borat)
                        } else {
                            System.out.println("Your number is out of bounds");

                        }

                    }


            }


        } while (true);
    }
}
