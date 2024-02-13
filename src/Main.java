import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //class BirthMonth
        //	main()
        //		num birthMonth
        //		output “Enter your birth month using a number 1-12:”
        //		input birthMonth
        //		if birthMonth > 0 AND birthMonth < 13 then
        //			output “Your birth month is: N”
        //		else
        //			output “You entered an incorrect month value: N”
        //		end if
        //	return
        //end class

        //Declaring variables
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;
        String trash = "";
        //output asking for birth month integer and input from user
        System.out.println("Enter your birth month using a number 1-12:");
        //if statement that allows valid integer to be scanned in and an else statement that indicates the input is invalid
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
            //clear buffer
            in.nextLine();
            //if statements that sets parameters of valid birth month integers and outputs according to integer entered
            if (birthMonth > 0 && birthMonth < 13) {
                System.out.println("Your birth month is: " + birthMonth);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You must enter a valid integer 1-12, not: " +trash);
        }
    }
}