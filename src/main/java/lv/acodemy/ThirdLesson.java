package lv.acodemy;

public class ThirdLesson {
    public static void main(String[] args) {

        //for (counter;conditions;counter change)
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world");
        }
        //print num 1-5
        for (int i = 1; i <= 5; i++) {

            System.out.println(i);
        }
        //int from 10-0
        for (int i = 10; i > -1; i--) {
            System.out.println(i);
        }


        String[] arrayOfNames = {"Nikita", "John", "Mike", "Anthony", "Mary", "Ann"};
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }

        //for each
        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        //goal: Find Japan
        String[] countries = {"United States", "Canada", "United Kingdom", "Germany", "France", "Australia", "Japan", "India", "China", "Brazil"};
        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("Jamete kudasai");
                break;
            }
            System.out.println(countries[i]);
        }

        //3 number array
        int[] firstArray = {1, 2, 3, 4, 5, 7, 4};
        int[] secondArray = {3, 4, 5, 6, 7, 10, 20};
        int[] thridArray = {5, 6, 7, 8, 9, 1, 2};
        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thridArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfFirstArray);
                    }
                }
            }
        }

        //from 0 to 100,print even num
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

        }

        //while!->do while
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        //calculate sum of num from 1 to 5
        int x = 1;
        int sum = 0;
        while (x <= 5) {
            sum = sum + x;
            x++;
        }
        System.out.println(sum);

        //print even num from 0 to 20
        int y = 0;
        while (y < 21) {
            System.out.println(y + " ");
            y = y + 2;

        }

        //do while
        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);


    }
}
