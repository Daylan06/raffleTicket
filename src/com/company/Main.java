package com.company;

import java.io.BufferedReader;

import java.io.InputStreamReader;

import java.util.Random;


public class Main {

    private static String raffleName = ("");
    private static String ticketNum = ("");

    public static void main(String[] args) {
        mainmenu();

    }

    public static void mainmenu() {
        try {
            while (true) {

                int option = Integer.parseInt(getInput("Choose an option from the following \n 1 - check a raffle ticket \n 2 - purchase a raffle ticket"));
                switch (option) {

                    case 1:
                        System.out.println("So you'd like to check a raffle ticket");
                        checkTicket();

                        break;

                    case 2:
                        System.out.println("So you'd like to purchase a raffle ticket");
                        System.out.println("Please enter your name: ");
                        raffleName = getInput("Please enter your name");

                        Random random = new Random();
                        int randInt = random.nextInt(500);
                        int ticketNum = randInt;

                        System.out.println("Your raffle number ticket number is " + ticketNum + " and your name is " + raffleName);


                        break;

                    default:
                        System.out.println("Invalid option, goodbye!");
                        System.exit(0);

                }


            }
        } catch (Exception e) {
            System.out.println("Error in the main menu, here is the error " + e);

        }
    }

    public static void checkTicket() {
        String checkName = getInput("Please enter your name: ")

        if (checkName.equals(raffleName)) {
            System.out.println("You have purchased a ticket");
            //if (ticketNum -
            checkPrimeNum();

        } else
            System.out.println("You have not purchased a ticket, please purchase one from the menu");
    }



    public static String getInput(String prompt) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println(prompt);
            return bufferedReader.readLine();
        } catch (Exception e) {
            System.out.println("Error in getInput " + e);
        }
        return "";
    }

    public class checkPrimeNum {
        public static void main(String[] args) {


            int num = int ticketNum;
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
                // condition for nonprime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag)
                System.out.println(ticketNum + " is a prime number.");
            else
                System.out.println(ticketNum + " is not a prime number.");
        }
    }
}