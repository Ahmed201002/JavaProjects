package revision;

public class Hourly_Employee extends Employee implements Displayable  {
    Double Houre_rate;
    Double Number_of_hours;

    public Hourly_Employee() {
    }

    public Hourly_Employee(String name, int SSN, String address, Gender sex, Double houre_rate, Double number_of_hours) {
        super(name, SSN, address, sex);
        Houre_rate = houre_rate;
        Number_of_hours = number_of_hours;
    }

    public Double getHoure_rate() {
        return Houre_rate;
    }

    public void setHoure_rate(Double houre_rate) {
        Houre_rate = houre_rate;
    }

    public Double getNumber_of_hours() {
        return Number_of_hours;
    }

    public void setNumber_of_hours(Double number_of_hours) {
        Number_of_hours = number_of_hours;
    }

    @Override
    public double Earning() {
        return Houre_rate*getNumber_of_hours() ;
    }

    @Override
    public String toString() {
        return "Hourly_Employee{" +
                "Houre_rate=" + Houre_rate +
                ", Number_of_hours=" + Number_of_hours +
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
        System.out.println(Earning());;
    }
}
