package revision;

public class BasePlusComissionEmployee extends comissionEmployee implements Displayable
{
    Double Base;

    public BasePlusComissionEmployee() {
    }

    public BasePlusComissionEmployee(String name, int SSN, String address, Gender sex, double gross_Sales, double comission_rate, Double base) {
        super(name, SSN, address, sex, gross_Sales, comission_rate);
        Base = base;
    }

    public Double getBase() {
        return Base;
    }

    public void setBase(Double base) {
        Base = base;
    }

    @Override
    public double Earning() {
        return Base+super.Earning();
    }
    public void DisplayEarning(){
        System.out.println(Earning());;
    }
    public void DisplayAllDetails() {
        super.DisplayAllDetails();
        DisplayEarning();
    }
}
