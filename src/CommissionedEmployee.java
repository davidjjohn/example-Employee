public class CommissionedEmployee extends Employee {

    private double baseSalary;
    private double commissionRate;
    private double salesVolume;

    public CommissionedEmployee(String name, double baseSalary, double commissionRate){
        super(name);
        this.baseSalary = baseSalary;
        this.commissionRate = commissionRate;
    }

    public void setcommissionRate(double rate){
        this.commissionRate = rate;
    }

    public void setsalesVolume(double volume){
        this.salesVolume = volume;
    }

    // required getPay() -- weekly
    public double getPay(){
        return this.baseSalary/52.0 + this.commissionRate*this.salesVolume;
    }

    // required getClassification()
    public Classification getClassification(){ return Classification.Commissioned; }
}
