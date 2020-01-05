package revision;
enum Gender {Male,Female};
public abstract class Employee {
    String name;
    int SSN;
    String Address;
    Gender sex;
    public Employee(){ }

    public Employee(String name, int SSN, String address, Gender sex) {
        this.name = name;
        this.SSN = SSN;
        Address = address;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }
public abstract double Earning();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", SSN=" + SSN +
                ", Address='" + Address + '\'' +
                ", sex=" + sex +
                '}';
    }
}
