package revision;

import java.util.ArrayList;

public class Department {
    int dno;
    String dname;
    ArrayList<Employee>emplist;

    public Department() {
    }

    public Department(int dno, String dname ) {
        this.dno = dno;
        this.dname = dname;
        emplist = new ArrayList<Employee>();
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
    public void add_employee(Employee e){
        emplist.add(e);
    }
    public void remove_employee(int  index){
        emplist.remove(index);
    }
    public int getemployeecount(){
        return emplist.size();
    }
    public void printBasicDate(){
    for(int i=0;i<emplist.size();i++){
        System.out.println(emplist.get(i).getSSN()+"\n"+emplist.get(i).getName()+"\n"+emplist.get(i).sex);
        System.out.println("**************************************");
    }

    }
    public void print_All_details(){
        for(int i=0;i<emplist.size();i++){
            if(emplist.get(i) instanceof Salaried_Employee)
                ((Salaried_Employee)emplist.get(i)).DisplayAllDetails();
            if(emplist.get(i)instanceof Hourly_Employee)
                ((Hourly_Employee)emplist.get(i)).DisplayAllDetails();
            if(emplist.get(i)instanceof comissionEmployee)
                ((comissionEmployee)emplist.get(i)).DisplayAllDetails();
        }


    }


}
