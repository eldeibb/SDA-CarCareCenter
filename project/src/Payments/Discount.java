package Payments;

public abstract class Discount extends Payment {
    String Name, Id;
    double Rate;
    Payment payment;
    public abstract double CalcCost();

    public Discount(String name, double rate) {
        Name = name;
        Rate = rate;
    }

    public Discount(Payment payment) {
        this.payment = payment;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }
}
