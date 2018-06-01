package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String questions;
        String questions2;
        questions2 = "\nDo you have another question for the magic 8-Ball?(y/n)";


        String[] answers = {"It is certain",
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
                " Ask again later",
                "Better not tell you now",
                "Cannot predict now",
                "Concentrate and ask again",
                "Don't count on it",
                "My reply is no",
                "My sources say no",
                "Outlook not so good",
                "Very doubtful"};
        System.out.println("enter the questions:");
        questions = input.nextLine();



        while(!questions.equals("exit")) {

            System.out.print("\nYOU ASKED:    " + questions);
            System.out.print("\nMAGIC 8-BALL SAYS   :  " + answers[random.nextInt(20)]);
            System.out.println( questions2);
            String ab = input.nextLine();
            if (ab.equals("y")) {
                System.out.println("Enter the question?");
                questions = input.nextLine();
            }
            else {
            questions="exit";
            System.out.println("Thank you for playing game");
        }
        }
    }
}





