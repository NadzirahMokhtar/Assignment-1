import java.util.Scanner;  
public class manageEmployee
{
    static Scanner scan = new Scanner(System.in);
    String[] empName = new String[100];
    String[] department = new String[100];
    double[] salary = new double[4];
    String[] email = new String[100];
    String[] phone = new String[100];
    
    public manageEmployee() {
        setEmployee();
        System.out.println("\n\nEmployee List:- \n");
        for(int j=0; j<4; j++){
         System.out.println("Name: "+empName[j]);
         System.out.println("Department: "+department[j]);   
         System.out.println("Salary: RM"+salary[j]);   
         System.out.println("Email: "+email[j]); 
         System.out.println("Phone Number: "+phone[j]+"\n");     
        }
        
        
    }
    
    public void setEmployee(){
        for(int i=0; i<4; i++){
            if(i==0){
                empName[i] = "Nadzirah";
                department[i] = "Manager";
                salary[i] = 4600;
                email[i] = "nadzirah@destinationservice.com";
                phone[i] = "0123456789";   
            }else if(i==1){
                empName[i] = "Azmar";
                department[i] = "Supervisor";
                salary[i] = 2600;
                email[i] = "azmar@destinationservice.com";
                phone[i] = "0123456789";
            }else if(i==2){
                empName[i] = "Isyak";
                department[i] = "Tour Guide";
                salary[i] = 1600;
                email[i] = "isyak@destinationservice.com";
                phone[i] = "0123456789";
            }else if(i==3){
                empName[i] = "Kwan";
                department[i] = "Logistics";
                salary[i] = 2600;
                email[i] = "kwan@destinationservice.com";
                phone[i] = "0123456789";
            }
        }
    }
    
    public double getTotalSalary(){
        setEmployee();
        double totalS=0;
        for(int j=0; j<4; j++){
            totalS = totalS+ salary[j];
        }        
        return totalS;
    }
}
 