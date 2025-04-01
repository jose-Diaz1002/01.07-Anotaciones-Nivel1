package ejercicio1;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Trabajador worker = new Trabajador("Alfonso", "Aya",20);
        TrabajadorOnline onlineWorker = new TrabajadorOnline("Jose","Diaz",20);
        TrabajadorPresencial presencialWorker = new TrabajadorPresencial("Carlos","Gomez",20);


        System.out.println("Worker salary: " + worker.cacularSou(160) + " Euros x mes");
        System.out.println("Online worker salary: " +onlineWorker.cacularSou(160) + " Euros x mes");
        System.out.println("Precesial workwr salary: " +presencialWorker.cacularSou(160) + " Euros x mes");

        onlineWorker.metodoObsoletoOnline();
        presencialWorker.metodoObsoletoPresencial();
    }

}
