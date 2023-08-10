package Services;

public class BridgestoneTire extends ChangingTires {
    public BridgestoneTire(Process process1) {
        super(process1);
    }

    public double CalcCost(){
        return process1.CalcCost()+8000;
    }
}
