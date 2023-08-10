package Services;

public class PerilliTire extends ChangingTires {
    public PerilliTire(Process process1) {
        super(process1);
    }

    public double CalcCost(){
        return process1.CalcCost()+12000;
    }
}

