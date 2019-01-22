import java.util.Scanner;

public class HelloOnEclipse {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("From Eclipse");
        System.out.println("Enter your name:");
        String name = keyboard.nextLine();
        System.out.println(name);
	}
}
