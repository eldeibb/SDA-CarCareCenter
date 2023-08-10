package Services;

public abstract class ChangingTires extends Service {
    public ChangingTires(Process process1) {
        super(process1);
    }

    public abstract double CalcCost();
}
