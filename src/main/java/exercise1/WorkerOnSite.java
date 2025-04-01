package exercise1;

public class WorkerOnSite extends Worker {
    private static final int FUEL = 100;

    public WorkerOnSite(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public int calculateSalary(int hours) {
        return super.calculateSalary(hours) + FUEL;
    }

}
