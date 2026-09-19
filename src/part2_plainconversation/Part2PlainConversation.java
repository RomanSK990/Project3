package part2_plainconversation;

import java.util.Scanner;

public class Part2PlainConversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, what's your age?");
        int age = in.nextInt();
        in.nextLine();

        if (age < 6) {
            System.out.println("Your daily activity is - staying at home, walk and kindergarten.");
        }
        else if (age <= 17) {
            System.out.println("Your daily activity is - school.");
        }
        else if (age <= 22) {
            System.out.println("Your daily activity is - university.");
        }
        else if (age <= 60) {
            System.out.println("Your daily activity is - work.");
        }
        else {
            System.out.println("You are retired.");
        }
    }
}