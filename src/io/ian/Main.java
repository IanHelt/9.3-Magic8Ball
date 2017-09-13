package io.ian;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Input done when you are finished");
        System.out.println("Ask a question and the 8-ball shall answer");
        final String[] predictions = {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Reply hazy try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"
        };

        while (true) {
            Random rng = new Random();
            Scanner scanner = new Scanner(System.in);
            int responseIndex = rng.nextInt(20);
            String userInput = scanner.nextLine();
            String response = predictions[responseIndex];


            if (userInput.equals("")) {
                System.out.println("Please enter a question");
            }
            else if (userInput.equals("done")) {
                System.out.println("cya fam");
                break;
            } else {
                System.out.println(userInput);
                System.out.println(response);
            }
        }
    }
}
