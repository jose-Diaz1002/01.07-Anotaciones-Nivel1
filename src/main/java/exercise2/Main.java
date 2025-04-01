package exercise2;

public class Main {
    public static void main(String[] args) {
        WorkerOnline onlineWorker = new WorkerOnline("Jose", "Diaz", 20);
        WorkerOnSite WorkerOnsite = new WorkerOnSite("Carlos", "Gomez", 20);


        System.out.println("Online worker salary: " + onlineWorker.cacularSou(160) + " Euros x mes");
        System.out.println("Precesial workwr salary: " + WorkerOnsite.cacularSou(160) + " Euros x mes\n");


        extracted(onlineWorker, WorkerOnsite);
    }

    @SuppressWarnings("deprecation")
    private static void extracted(WorkerOnline onlineWorker, WorkerOnSite WorkerOnsite) {
        onlineWorker.metodoObsoletoOnline();
        WorkerOnsite.metodoObsoletoPresencial();
    }

}
