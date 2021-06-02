import java.util.Scanner;  
public class manageFinances{
    static Scanner scan = new Scanner(System.in);
    manageEmployee emp = new manageEmployee();
    public manageFinances() {
        double totalS = emp.getTotalSalary();
        System.out.println("The total expenses are: RM"+totalS);
        double totalSales = 14000;
        System.out.println("The total sales are: RM"+totalSales);
        System.out.println("The profit for this month is: RM"+calcFinances(totalS, totalSales));
    }
    
    public double calcFinances(double salary, double sales){
    return sales-salary;
    }
}
 