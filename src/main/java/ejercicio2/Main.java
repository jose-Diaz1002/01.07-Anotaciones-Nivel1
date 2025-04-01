package ejercicio2;

public class Main {
    public static void main(String[] args) {
        WorkerOnline2 onlineWorker = new WorkerOnline2("Jose","Diaz",20);
        WorkerOnSite2 presencialWorker = new WorkerOnSite2("Carlos","Gomez",20);


        System.out.println("Online worker salary: " +onlineWorker.cacularSou(160) + " Euros x mes");
        System.out.println("Precesial workwr salary: " +presencialWorker.cacularSou(160) + " Euros x mes");


        extracted(onlineWorker, presencialWorker);
    }
    @SuppressWarnings("deprecation")
    private static void extracted(WorkerOnline2 onlineWorker, WorkerOnSite2 presencialWorker) {
        onlineWorker.metodoObsoletoOnline();
        presencialWorker.metodoObsoletoPresencial();
    }

}
