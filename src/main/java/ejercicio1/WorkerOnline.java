package ejercicio1;

public class WorkerOnline extends Worker {
    private static final int INTERNETRATE = 30;
    public WorkerOnline(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public int cacularSou(int hours) {
        return super.cacularSou(hours) + INTERNETRATE;
    }

}
