import java.util.Scanner;  
public class destination
{
    static Scanner scan = new Scanner(System.in);
    
    public destination(String n) {
        String name = n;
        System.out.println("\nHello, "+n+"! Here is a list of destinations:");
        sales sa = new sales(name);
    }
}
