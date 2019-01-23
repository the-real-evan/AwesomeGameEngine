import java.util.Scanner;
public class Hello
{
    public static void main(String[] args)
    {
        //Reads in the user input and then prints out that input - Edit by Trevor
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Edit by Evan");
    }
}
