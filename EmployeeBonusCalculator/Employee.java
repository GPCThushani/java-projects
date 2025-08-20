abstract class Employee{
    protected double salary;
    public Employee (double salary){
        this.salary = salary;
    }
    public abstract double calculateBonus();
    public double getFinalSalary(){
        return salary + calculateBonus();
    }
}