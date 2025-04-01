package ejercicio2;

public class Worker2 {
    private String name;
    private String lastName;
    private int priceHour;

    public Worker2(String name, String lastName, int priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(int priceHour) {
        this.priceHour = priceHour;
    }
    public int cacularSou(int hours){

        return priceHour * hours;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", priceHour=" + priceHour +
                '}';
    }
}
