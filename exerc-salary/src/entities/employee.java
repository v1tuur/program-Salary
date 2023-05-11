package entities;

public class employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;

    }

    public void addSalary(double percentage){
        grossSalary += grossSalary * percentage / 100.00;
    }

    public String toString() {
        return name + ", $ " + String.format("%.2f%n", netSalary());
    }


}
