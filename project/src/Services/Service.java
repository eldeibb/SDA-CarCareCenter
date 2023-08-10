package Services;

public abstract class Service extends Process {
    Process process1;

    public Service(Process process1) {
        this.process1 = process1;
    }

    public abstract double CalcCost();

}
