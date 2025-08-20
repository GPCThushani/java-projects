class ManagerEmployee extends Employee{
    public ManagerEmployee(double salary){
        super(salary);
    }
    public double calculateBonus(){
        return salary * 0.15;
    }
}
