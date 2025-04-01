package ejercicio1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Alfonso", "Aya",20);
        WorkerOnline onlineWorker = new WorkerOnline("Jose","Diaz",20);
        WorkerOnSite presencialWorker = new WorkerOnSite("Carlos","Gomez",20);


        System.out.println("Worker salary: " + worker.cacularSou(160) + " Euros x mes");
        System.out.println("Online worker salary: " +onlineWorker.cacularSou(160) + " Euros x mes");
        System.out.println("Precesial workwr salary: " +presencialWorker.cacularSou(160) + " Euros x mes");


    }

}
