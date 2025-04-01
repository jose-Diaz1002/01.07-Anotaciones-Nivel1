package ejercicio1;

public class TrabajadorOnline extends Trabajador {
    private static final int INTERNETRATE = 30;
    public TrabajadorOnline(String name, String lastName, int priceHour) {
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
