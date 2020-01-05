package revision;

public class Salaried_Employee extends Employee implements Displayable {
    Double Salary;
    Double Bonus;
    Double Deduction;

    public Salaried_Employee() {
    }

    public Salaried_Employee(String name, int SSN, String address, Gender sex, Double salary, Double bonus, Double deduction) {
        super(name, SSN, address, sex);
        Salary = salary;
        Bonus = bonus;
        Deduction = deduction;
    }

    public Double getSalary() {
        return Salary;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    public Double getBonus() {
        return Bonus;
    }

    public void setBonus(Double bonus) {
        Bonus = bonus;
    }

    public Double getDeduction() {
        return Deduction;
    }

    public void setDeduction(Double deduction) {
        Deduction = deduction;
    }
    public  double Earning(){

        return Salary+Bonus-Deduction;
    }
    public void DisplayAllDetails(){

        System.out.println(super.toString());
        System.out.println(toString());
    }
    public void DisplayEarning(){
        System.out.println(Earning());

    }

    @Override
    public String toString() {
        return "Salaried_Employee{" +
                "Salary=" + Salary +
                ", Bonus=" + Bonus +
                ", Deduction=" + Deduction +
                '}';
    }

}
