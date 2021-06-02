import java.util.Scanner;  
public class carlist
{
    static Scanner scan = new Scanner(System.in);
     String[] typeCar = new String[] {"4-Seater Car", "6 Seater Van", "Motorbike"};
     int[] price = new int[] {50, 100, 30};
    
    public carlist(){
        System.out.println("\nHere is a list of cars:");
        System.out.println("============================================================================");
        System.out.println("\tTYPE\t\tPRICE");
        System.out.println("============================================================================");
        for(int i=0; i<3; i++){
            System.out.println("["+(i+1)+"]\t"+typeCar[i]+"\t"+price[i]);
        }
        
    }
    public int getPrice(int p){
        p = p-1;
        return price[p];
    }
    
    public String getCar(int type){
        type = type-1;
        String carname=typeCar[type];
        return carname;
    }
}
