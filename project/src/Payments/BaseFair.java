package Payments;

public class BaseFair extends Payment {
    double cost;

    public BaseFair(double cost) {
        this.cost = cost;
    }

    public double CalcCost(){
        return cost;
    }
}
