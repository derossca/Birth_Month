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
        //output asking for birth month integer and input from user
        System.out.println("Enter your birth month using a number 1-12:");
        birthMonth = in.nextInt();
        //clear buffer
        in.nextLine();
        //if statements
        if (birthMonth > 0 && birthMonth < 13) {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}