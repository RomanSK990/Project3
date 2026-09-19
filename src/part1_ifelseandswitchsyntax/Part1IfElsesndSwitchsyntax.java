package part1_ifelseandswitchsyntax;

import java.util.Scanner;

public class Part1IfElsesndSwitchsyntax {
    public static void main(String[] args) {
        // Part 1.1 Use of control statements
        int a = 4;
        if (a > 5) {
            System.out.println("A is grater than 5");
        }
        else {
            System.out.println("A is less than 5");
        }
        int finish = 2;

        switch (finish) {
            case 1:
                System.out.println("Finished first");
                break;
            case 2:
                System.out.println("Finished second");
                break;
            case 3:
                System.out.println("Finished third");
                break;
            default:
                System.out.println("Finished");
                break;
        }
        // Part 1.2 Use of control statements
        int b = 7;
        if (b == 5) {
            System.out.println("B equals 5");
        }
        else {
                System.out.println("B is not equals 5");
        }

        if (b != 5) {
            System.out.println("B is not equals 5");
        }
        else {
            System.out.println("B equals 5");
        }

        if (b > 5) {
            System.out.println("B is more than 5");
        }
        else {
            System.out.println("B is less than 5");
        }

        if (b < 5) {
            System.out.println("B is less than 5");
        }
        else {
            System.out.println("B is more than 5");
        }

        if (b <= 5) {
            System.out.println("B is less or equals 5");
        }
        else {
            System.out.println("B is more or equals 5");
        }

        if (b >= 5) {
            System.out.println("B is more or equals 5");
        }
        else {
            System.out.println("B is less or equals 5");
        }
        // 1.3 Compare strings using String.equals()
        String cc = "Car";
        if (cc.equals("Car")) {
            System.out.println("You have a car.");
        }
        else
        {
            System.out.println("You don't have a car.");
        }
        // 1.4 Logical operators &&, ||, !
        int age = 22;
        boolean hasCar = false;

        if (age >= 18 && hasCar)
        {
            System.out.println("You can sign up for the racing.");
        }
        else
        {
            System.out.println("You can't sign up for the racing.");
        }

        int weekday = 4;

        if (weekday == 6 || weekday == 7)
        {
            System.out.println("Today is weekend");
        }
        else
        {
            System.out.println("Today is workday.");
        }

        boolean weekend = false;

        if (!weekend) {
            System.out.println("Today is workday.");
        }
        else
        {
            System.out.println("Today is weekend.");
        }
        // Part 1.5 conditions with user input
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, are you studying in university? (yes/no)");
        String study = in.nextLine();
        boolean student = study.trim().toLowerCase().startsWith("y");

        if (student)
        {
            System.out.println("You are a student.");
        }
        else
        {
            System.out.println("You are not a student.");
        }
        // Part 1.6 Nested if/else conditionals
        int examscore = 88;
        boolean haspassedexam = true;

        if (haspassedexam)
        {
            if (examscore == 100) {
                System.out.println("You passed perfect!");
            }
            else
            {
                if (examscore >= 90) {
                    System.out.println("You passed awesome!");
                }
                else
                {
                    if (examscore >= 80) {
                        System.out.println("You passed great!");
                    }
                    else
                    {
                        if (examscore >= 70) {
                            System.out.println("You passed good!");
                        }
                        else {
                            if (examscore >= 60) {
                                System.out.println("You passed!");
                            }
                            else
                            {
                                System.out.println("You need to try again...");
                            }
                        }

                    }
                }
            }

        }
        else
        {
            System.out.println("You need to pass an exam.");
        }
    }
}
