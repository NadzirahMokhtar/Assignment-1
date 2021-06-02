import java.util.Scanner;  
public class sales
{
    static Scanner scan = new Scanner(System.in);
    public sales(String n){
        TicketInventory ticket = new TicketInventory();
        System.out.println("============================================================================");
        System.out.println("\nWhich destination do you want to choose?");
        int destChoice = scan.nextInt();
        System.out.println("\nWhen do you want to go?");
        String date = scan.next();
        carlist car = new carlist();
        System.out.println("============================================================================");
        System.out.println("\nWhich car do you want to choose?");
        int carChoice = scan.nextInt();
        String carType = car.getCar(carChoice);
        int carP = car.getPrice(carChoice);
        String dest = ticket.getPlace(destChoice);
        int destP = ticket.getPrice(destChoice);
        
        printReceipt(n, date, dest, destP, carType, carP);
        
    }
    
    public void printReceipt(String name, String date, String dest, int destP, String carType, int carP){
        System.out.println("\nReceipt #10000");
        System.out.println("=======================");
        System.out.println("Name: "+name);
        System.out.println("Destination: "+dest);
        System.out.println("Price:" +"RM"+destP);
        System.out.println("Date: "+date);
        System.out.println("Car Type: "+carType);
        System.out.println("Price:" +" RM"+carP);
        System.out.println("\nYour Total is: RM"+calculateTotal(carP, destP));
        
        System.out.println("Enter amount you want to pay: ");
        int amount = scan.nextInt();
        
        System.out.println("\nYour balance is: RM"+ calculateCustBalance(calculateTotal(carP, destP), amount));
        System.out.println("Thank you!");
    }
    
    public int calculateTotal(int carP, int destP){
        return carP+destP;
    }
    
    public int calculateCustBalance(int total, int paid){
        return paid-total;
    }
}
