import java.util.Scanner;
public class EmpBonusCalculator{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the type of the employee(intern / fulltime / Manager): ");
        String type = scanner.nextLine();
        System.out.print("Enter the salary of the employee: Rs. ");
        double salary = scanner.nextDouble();

        Employee employee;
        switch(type.toLowerCase()){
            case "intern":
                employee  = new InternEmployee(salary);
                break;

            case "full-time":
                employee  = new FulltimeEmployee(salary);
                break;

            case "manager":
                employee  = new ManagerEmployee(salary);
                break;

            default:
                System.out.println("Enter a valid input");
                return;
        }

        double bonus = employee.calculateBonus();
        double finalSalary = employee.getFinalSalary();


        System.out.println("The bonus amount: Rs. "+bonus);
        System.out.println("The final salary after applying bonus: Rs. "+finalSalary);
    }
}