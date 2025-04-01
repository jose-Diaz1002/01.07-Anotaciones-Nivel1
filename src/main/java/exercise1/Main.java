package exercise1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Alfonso", "Aya", 20);
        WorkerOnline onlineWorker = new WorkerOnline("Jose", "Diaz", 20);
        WorkerOnSite onSiteWorker = new WorkerOnSite("Carlos", "Gomez", 20);


        System.out.println("Worker salary: " + worker.calculateSalary(160) + " Euros x mes");
        System.out.println("Online worker salary: " + onlineWorker.calculateSalary(160) + " Euros x mes");
        System.out.println("Precesial workwr salary: " + onSiteWorker.calculateSalary(160) + " Euros x mes");


    }

}
