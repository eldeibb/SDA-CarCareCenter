package Services;

public abstract class ChangingOil extends Service{
    public ChangingOil(Process process1) {
        super(process1);
    }

    public abstract double CalcCost();
}
