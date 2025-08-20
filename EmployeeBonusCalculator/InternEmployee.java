class InternEmployee extends Employee{
    public InternEmployee(double salary){
        super(salary);
    }
    public double calculateBonus(){
        return 5000;
    }
}