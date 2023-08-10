package Services;

public class TotalOil extends ChangingOil{
    public TotalOil(Process process1) {
        super(process1);
    }

    public double CalcCost(){
        return process1.CalcCost()+1200;
    }
}
