package ejercicio2;

public class WorkerOnline2 extends Worker2 {
    private static final int INTERNETRATE = 30;
    public WorkerOnline2(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public int cacularSou(int hours) {
        return super.cacularSou(hours) + INTERNETRATE;
    }
    @Deprecated
    public void metodoObsoletoOnline() {
        System.out.println("This method is obsolete online worker.");
    }
}
