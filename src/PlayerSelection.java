//Date; 19/09/2025
//Author: Harriet Yayra Boven Fiahagbe
//Description: To Create a short Java Program that helps coach to make decisions about a player based on certain factors and statistics

//Importing Scanner Package to allow input
import java.util.Scanner;

//Declaring the main function, to allow the program to run
public class PlayerSelection {
    public static void main(String[] args) {

        //Creating Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Declaring Constants
        float POUND = 0.45359237f;
        int METER = 100;

        //Declaring variables to use in the program
        String name;
        int age;
        double height;
        double weight;
        int jersey_number;
        double new_weight;
        double new_height;
        int current_height;
        String lineup_final = "";
        String player_position = "";
        int current_weight;
        String Eligibility;
        String player_type;
        String final_decision;
        String attacker_response;



        //Taking Input from the user. (Basic Information, weight, height, name, age, etc.)
        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your height: ");
        height = input.nextDouble();

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        System.out.print("Enter your jersey number: ");
        jersey_number = input.nextInt();


        //Coverting height to cm
        new_height = height * METER;

        //Converting weight to Pounds
        new_weight = POUND * weight;

        //Performing Type casting to change weight and weight to an integer
        current_height = (int) new_height;
        current_weight = (int) new_weight;


        //Determining the Category for the player
        if (age < 20) {
            player_type = "Rising Star";
            //System.out.println("Rising Star");
        } else if (age >= 20 && age < 30) {
            player_type = "Prime Player";
            //System.out.println("Prime Player");
        }else {
            player_type = "Vetran";
            //System.out.println("Vetran");
        }


        // Determining the position of the player
        switch (jersey_number) {

            case 1:
                player_position = "Goal kepper";
                break;

            case 2:
            case 5:
                player_position = "Defender";
                break;

            case 6:
            case 8:
                player_position = "midfielder";
                break;

            case 7:
                player_position = "Winger";
                break;

            case 9:
                player_position = "Striker";
                break;

            case 10:
                player_position = "Play Maker";
                break;


        }

        //Checking the Eligibility of the player
        boolean Eligible = (age >= 18) && (age < 35) && (current_weight < 90);
        if (Eligible) {
            Eligibility = "Eligible";
            //System.out.println(Eligibility);
        } else {
            Eligibility = "Not Eligible";
            //System.out.println("Not Eligible");
        }

        //Determining the Lineup Decision
        if (player_type.equals("Prime Player")) {
            if (current_weight < 80) {
                lineup_final = "Lineup";
            }
            else {
                lineup_final = "Bench";
            }
        }

        //Determining The final Decision
        final_decision = (Eligibility.equals("Eligible")) ? "Play": "Rest";
        //System.out.println("The player is supposed to " + final_decision);

        //Checking the Attacker status of the player
        if (jersey_number == 9 || jersey_number == 10 || jersey_number == 11 || jersey_number == 7) {
            attacker_response = "Yes," + name + " you can have the attacker Jersey";
        }
        else{
            attacker_response = "No, " + name+ " you cannot have the attacker Jersey";
        }

        //Printing out the final results of the player
        System.out.println("The name of the player is: " + name);
        System.out.println("The player is " + age + " years old. He/She is a: " + player_type );
        System.out.println("He/She is:  " + height + " m tall.");
        System.out.println("He/She is:  " + weight + " lbs");
        System.out.println("The Jersey Number of the player is:  " + jersey_number);
        System.out.println("Your player is a: " + player_position);
        System.out.println(attacker_response);;
        System.out.println("The eligibility status of the player is, he/she is: " + Eligibility);
        System.out.println("This is the lineup decsion, the player is on the: " + lineup_final);
        System.out.println("This is the final decision, the player would:  " + final_decision);
        System.out.println("Thank you for using our Platform, have a good day !");


//Closing the Scanner Object
 input.close();





    }
}

