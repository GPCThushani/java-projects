class FulltimeEmployee extends Employee{
    public FulltimeEmployee(double salary){
        super(salary);
    }
    public double calculateBonus(){
        return  salary * 0.1;
    }
}