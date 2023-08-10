package Payments;

public class PromocodeDiscount extends Discount{
    String promocode;

    public String getPromocode() {
        return promocode;
    }

    public void setPromocode(String promocode) {
        this.promocode = promocode;
    }

    public PromocodeDiscount(Payment payment) {
        super(payment);
    }
    public PromocodeDiscount(String name, double rate) {
        super(name, rate);
    }

    public double CalcCost(){
        double baseFair =  payment.CalcCost();
        return baseFair*super.getRate();
    }


}
