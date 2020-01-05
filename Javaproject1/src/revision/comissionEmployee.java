package revision;

import org.w3c.dom.ls.LSOutput;

public class comissionEmployee extends Employee implements Displayable {
    double Gross_Sales,Comission_rate;

    public comissionEmployee() {
    }

    public comissionEmployee(String name, int SSN, String address, Gender sex, double gross_Sales, double comission_rate) {
        super(name, SSN, address, sex);
        Gross_Sales = gross_Sales;
        Comission_rate = comission_rate;
    }

    public double getGross_Sales() {
        return Gross_Sales;
    }

    public void setGross_Sales(double gross_Sales) {
        Gross_Sales = gross_Sales;
    }

    public double getComission_rate() {
        return Comission_rate;
    }

    public void setComission_rate(double comission_rate) {
        Comission_rate = comission_rate;
    }

    @Override
    public double Earning() {
        return Gross_Sales*Comission_rate;
    }

    @Override
    public String toString() {
        return "comissionEmployee{" +
                "Gross_Sales=" + Gross_Sales +
                ", Comission_rate=" + Comission_rate +
                ", name='" + name + '\'' +
                ", SSN=" + SSN +
                ", Address='" + Address + '\'' +
                ", sex=" + sex +
                '}';
    }

    public void DisplayAllDetails(){
        System.out.println(toString());
    }

    public void DisplayEarning(){
        System.out.println(Earning());
    }

}
