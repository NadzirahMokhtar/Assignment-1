import java.util.Scanner;  
public class TicketInventory
{
    static Scanner scan = new Scanner(System.in);
     String[] places = new String[] {"Maisson Eatery Buffet\t", "Edison Beachfront Cafe\t", "Etienne Hotel and Residences"};
     int[] price = new int[] {95, 145, 295};
     int[] tickets = new int[] {20, 15, 10};
     String[] hrs = new String[] {"3HRS", "3HRS", "3D2N"};
    public TicketInventory(){
        System.out.println("============================================================================");
        System.out.println("\tPLACE\t\t\tTRIP DURATION\tPRICE\tTICKETS AVAILABLE");
        System.out.println("============================================================================");
        for(int i=0; i<3; i++){
            System.out.println("["+(i+1)+"]\t"+places[i]+"\t"+hrs[i]+"\t"+price[i]+"\t\t"+tickets[i]);
        }
    }
    
    public int getPrice(int p){
        p=p-1;
        return price[p];
    }
    
    
    public String getPlace(int n){
        n=n-1;
        return places[n];
    }
}
