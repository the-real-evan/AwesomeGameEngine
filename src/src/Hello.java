import java.util.Scanner;
public class Hello
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = kb.nextLine();
        System.out.println(name);
    }
}
