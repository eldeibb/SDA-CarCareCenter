package Payments;

public class PaymentController {
    PaymentModel p;

    public double getCumulativeIncome(){
        return p.getCumulativeIncome();
    }
    public void CalculateCumulativeIncome(Payment p1){
        p.setCumulativeIncome(p1.CalcCost()+p.getCumulativeIncome());

    }

}
