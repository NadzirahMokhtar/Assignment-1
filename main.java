import java.util.Scanner;  
public class main
{
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("Welcome to Destination Service!");
        System.out.println("===================================\n");
        
        System.out.println("To start, choose a user type.");
        System.out.println("[0] Customer\n[1] Employee");
        int type = scan.nextInt();
        
        switch(type){
            case 0:
                System.out.println("\nHello Customer! Please input your name.");
                String name = scan.next();
                destination dest = new destination(name);
                break;
            
            case 1:
                System.out.println("\nHello Admin. What would you like to do?");
                System.out.println("[0] Manage Employee\n[1] Manage Finances");
                int choice = scan.nextInt();
                if(choice==0){
                    manageEmployee me = new manageEmployee();
                }else if(choice==1){
                    manageFinances mF = new manageFinances();
                }else{
                    System.out.println("Invalid choice. Program will terminate.");
                }
                break;
            
            default:
                System.out.println("Invalid choice. Program will terminate.");
                break;
        }
    }
}
