package ejercicio1;

public class TrabajadorPresencial extends Trabajador{
    private static  final int GASOLINE = 100;
    public TrabajadorPresencial(String name, String lastName, int priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public int cacularSou(int hours) {
        return super.cacularSou(hours) + GASOLINE;
    }
    @Deprecated
    public void metodoObsoletoPresencial() {
        System.out.println("This method obsolete in Presencial worker.");
    }
}
