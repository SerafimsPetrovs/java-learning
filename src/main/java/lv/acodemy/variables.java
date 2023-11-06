package lv.acodemy;

public class variables {
    public static void main(String[] args) {

        System.out.println("This is variables.java file");
        // int (number)
        int myCurrentAge = 20;
        System.out.println(myCurrentAge);

        /*
        1
        2
        3
        todo: Delete it later
         */
        byte myWeight = 72;// byte data type
        short salary = 2000; //short data type
        char myFirstLetterofName = 'S';
        long populationofLatvia = 1900000;// long data type
        double numberPi = Math.PI;
        float randomNumber = 2312564.213132f;
        //boolean
        //Example: IsSummer,IsAdult
        boolean isSummer = false;
        var age = 20;
        var myCurrentWeight = 20.5;


        byte myDodWeight = 5;
        byte myCatWeight = 4;
        short myCarWeight = 1400;
        short myDogSalary = 0;
        char dogFirstLetter = 'A';
        char catFirstLetter = 'B';
        long worldDogPopulation = 312321423;
        long worldCatPopulation = 876521423;
        double temperatureOutside = 10.5;
        double temperatureinsidee = 22.5;
        boolean iLikeDogs = true;
        boolean iLikeCats = true;
        var iLikepotato = true;
        var iLikefish = false;

        int x, y, z;
        x = 10;
        y = 4;
        z = 8;

        int sum = x + y + z;
        System.out.println(sum);

        //2a(a+b)
        int a = 4;
        int b = 3;
        int result = 2 * a * (a + b);
        System.out.println("result= " + result);

        int reminder = 10 % 3;


        String firstName = "Serafim";
        String lastName = "Petrov";

        System.out.println(firstName + lastName);
        System.out.printf("My full name is %s %s\n", firstName, lastName);
        //////////////////////
        String mySchool = "RPV";
        System.out.println("Now im studying in " + mySchool);
//        System.out.printf("Now im studying in %s", mySchool);


        //exercise2

        String favFilm = "Avatar";
        String dayOfweek = "Tuesday";
        System.out.println("I watched " + favFilm + " on " + dayOfweek);


    }
}
