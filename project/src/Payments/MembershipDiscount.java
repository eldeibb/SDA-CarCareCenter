package Payments;

public class MembershipDiscount extends Discount{

    public MembershipDiscount(Payment payment) {
        super(payment);
    }
    public MembershipDiscount(String name, double rate) {
        super(name, rate);
    }

    public double CalcCost(){
        double baseFair =  payment.CalcCost();
        return baseFair*super.getRate();
    }
}
