package Services;

public class MobilOil extends ChangingOil{
    public MobilOil(Process process1) {
        super(process1);
    }

    public double CalcCost(){
        return process1.CalcCost()+1500;
    }
}
