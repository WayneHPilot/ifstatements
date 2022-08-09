import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String username = "Admin";
        String password = "Password!";
        System.out.print("Enter your username: ");
        username = reader.nextLine();
        System.out.print("Enter your password: ");
        password = reader.nextLine();

        if (username==username && password==password);
        System.out.println("You have been validated!");

        if(username!=username && password!=password);
        {
            System.out.println("Access not authorised!");
        }




        //int x = 45;
       // int number = 55;
       // if (number > 0)

        {
           // System.out.println("The number is positive!");
           // if (number > x)
        {
            //System.out.println("And is larger than x: " + x);
        }
    }
}}
