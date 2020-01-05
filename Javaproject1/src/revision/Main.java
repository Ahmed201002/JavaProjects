package revision;

public class Main {

    public static void main(String[] args) {
        Department d1=new Department(1,"Information system");
        Salaried_Employee se=new Salaried_Employee("Hamza",1200,"Deutschland",Gender.Male,2000.0,500.0,100.0);
        comissionEmployee ce=new comissionEmployee("Sabine",1200,"Norwegen",Gender.Female,15.000,0.25);
        Hourly_Employee he=new Hourly_Employee("Tim",1200,"Deutschland",Gender.Male,20.0,1200.0);
    d1.add_employee(he);
    d1.add_employee(se);
    d1.add_employee(ce);
        System.out.println(d1.getemployeecount());
        //d1.print_All_details();
        d1.printBasicDate();
    }


}
