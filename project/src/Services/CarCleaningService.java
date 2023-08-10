package Services;

public class CarCleaningService extends Service{
    public CarCleaningService(Process process1) {
        super(process1);
    }

    public double CalcCost(){
        return process1.CalcCost()+100;

    }
}
