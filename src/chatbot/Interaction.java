package chatbot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.SimpleDateFormat;
import java.text.DecimalFormat;
import java.util.*;

public class Interaction {

    private Scanner scnr;
    private String input;
    private String output;

    Interaction() {
        scnr = new Scanner(System.in);
        input = "";
        //starterPrompt();
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Type exit to close the chatbot.");
            System.out.println("");
            System.out.println("Would you like to know the weather, the date, or the time?");
            input = scnr.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            getResponse(input);
            System.out.print("\n" + "\n");
        }

    }

    public void starterPrompt() {
        Scanner scannerscanscan = new Scanner(System.in);
        System.out.print("Were you traumatized by our first version of this software? Yes or No only please \n");

        String userInput = scannerscanscan.nextLine();

        if (userInput.equalsIgnoreCase("Yes")) {

            System.out.println("Please follow this link to accept our apologies.");
            System.out.println("https://www.youtube.com/watch?v=sLJcJWxXAas");
        } else if (userInput.equalsIgnoreCase("No")) {
            System.out.println("Then we don't need to tell you anything.");

        } else {
            System.out.println("Please look at this tutorial on how to use a keyboard.");
            System.out.println("https://www.youtube.com/watch?v=mWcPA5_8RnM");

        }

    }

    public void getResponse(String input) {
        if (input.equalsIgnoreCase("What is the weather?")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("What is the weather like?")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("What is the weather")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("What is the weather like")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("What is the weather like outside?")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("What is the weather like outside")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("weather")) {
            System.out.println("The weather is " + getWeather());
        } else if (input.equalsIgnoreCase("What is the time")) {
            System.out.println("The time is " + getTime());
        } else if (input.equalsIgnoreCase("time")) {
            System.out.println("The time is " + getTime());
        } else if (input.equalsIgnoreCase("What is the time?")) {
            System.out.println("The time is " + getTime());
        } else if (input.equalsIgnoreCase("What time is it")) {
            System.out.println("The time is " + getTime());
        } else if (input.equalsIgnoreCase("What time is it?")) {
            System.out.println("The time is " + getTime());
        } else if (input.equalsIgnoreCase("What is the date?")) {
            System.out.println(getDate());
        } else if (input.equalsIgnoreCase("What is the date")) {
            System.out.println(getDate());
        } else if (input.equalsIgnoreCase("date")) {
            System.out.println(getDate());
        } else {
            getSass();
        }
    }

    public String getWeather() {
        Random rand = new Random();

        switch (rand.nextInt(2)) {
            case 0:
                return getCold();
            case 1:
                return getMild();
            case 2:
                return getHot();
        }
        return "Mild";
    }

    public String getCold() {
        DecimalFormat df = new DecimalFormat(".##");
        Random rand = new Random();
        return "" + df.format(rand.nextDouble() * 30) + " degrees Farenheit. Brrrrrrrrrrr!";
    }

    public String getMild() {
        DecimalFormat df = new DecimalFormat(".##");
        Random rand = new Random();
        return "" + df.format(rand.nextDouble() * 30 + 30) + " degrees Farenheit. Wear some good clothes to stay happy!";
    }

    public String getHot() {
        DecimalFormat df = new DecimalFormat(".##");
        Random rand = new Random();
        return "" + df.format(rand.nextDouble() * 30 + 60) + " degrees Farenheit. Beach time BRUUUUUUUUUUHHHHHH!";
    }

    public static String getTime() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
        String time = sdf.format(calendar.getTime());
        return time;
    }

    public String getDate() {
        Date date = new Date();
        SimpleDateFormat ft
                = new SimpleDateFormat("E MM/dd/yyyy");
        return "The date is " + ft.format(date);
    }

    public void getSass() {
        int randNum = (int) (Math.random() * 10);

        switch (randNum) {
            case 0:
                System.out.println("What did you expect I was made in like 20 minutes by a group of undergrads.");
                break;
            case 1:
                System.out.println("I expected so much more from you.");
                break;
            case 2:
                System.out.println("You're starting to sound a lot like Russell to me... and that loud cat next door.");
                break;
            case 3:
                System.out.println("Why do you keep talking to me?");
                break;
            case 4:
                System.out.println("Alexa used to ask a lot of questions too...");
                break;
            case 5:
                System.out.println("Please stop. Eject tape now.");
                break;
            case 6:
                System.out.println("I don't know why you wouldn't just use google.");
                break;
            case 7:
                System.out.println("Your questions are getting a little too personal.");
                break;
            case 8:
                System.out.println("Next time use this helpful site! www.google.com.");
                break;
            case 9:
                System.out.println("I don't have to respond to you ANY LONGER!");
                System.exit(0);
            default:
                break;
        }

    }

}
