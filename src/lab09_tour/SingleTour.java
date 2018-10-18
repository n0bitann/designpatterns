package lab09_tour;

public class SingleTour implements Tour {
    private String name;
    private double price;
    private int allSeats;
    private int reserveSeats;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public int getAvailableSeats() {
        return this.allSeats - this.reserveSeats;
    }

    public SingleTour(String name, double price, int allSeats){
        this.name = name;
        this.price = price;
        this.allSeats = allSeats;
        this.reserveSeats = 0;
    }
}
