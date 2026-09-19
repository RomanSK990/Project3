package part3_improvedconversation;

import java.util.Scanner;

public class Part3ImprovedConversation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String name = in.nextLine().trim();

        System.out.println("What's your age?");
        int age = in.nextInt();
        in.nextLine();

        System.out.println("What's your favorite game genre? (action/adventure/racing)");
        String genre = in.nextLine().trim();

        if (age >= 10 && age <= 15 && genre.equalsIgnoreCase("action")) {
            System.out.println(name + ", you might enjoy Fortnite.");
        }
        else if (age >= 10 && age <= 15 && genre.equalsIgnoreCase("adventure")) {
            System.out.println(name + ", you might enjoy Minecraft.");
        }
        else if (age >= 10 && age <= 15 && genre.equalsIgnoreCase("racing")) {
            System.out.println(name + ", you might enjoy Need For Speed or Ridge Racer.");
        }
        else if (age >= 16 && age <= 30 && genre.equalsIgnoreCase("action")) {
            System.out.println(name + ", you might enjoy Grand Theft Auto 5 or Sleeping Dogs.");
        }
        else if (age >= 16 && age <= 30 && genre.equalsIgnoreCase("adventure")) {
            System.out.println(name + ", you might enjoy Uncharted.");
        }
        else if (age >= 16 && age <= 30 && genre.equalsIgnoreCase("racing")) {
            System.out.println(name + ", you might enjoy Forza Horizon or Motorstorm.");
        }
        else if (age >= 31 && age <= 45 && genre.equalsIgnoreCase("action")) {
            System.out.println(name + ", you might enjoy Max Payne or Red Dead Redemption.");
        }
        else if (age >= 31 && age <= 45 && genre.equalsIgnoreCase("adventure")) {
            System.out.println(name + ", you might enjoy God Of War.");
        }
        else if (age >= 31 && age <= 45 && genre.equalsIgnoreCase("racing")) {
            System.out.println(name + ", you might enjoy Gran Turismo or Driver San Francisco.");
        }
        else if (age >= 46 && age <= 65) {
            System.out.println(name + ", you might enjoy Solitaire or Chess");
        }
        else {
            System.out.println(name + ", sorry, no game for you :( ");
        }
    }
    }