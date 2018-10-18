package lab09_tour;

public class Main {
    public static void main(String[] args) {
        Tour bangkoktour = new SingleTour("Bangkok Tour",1000,10);
        Tour northTour = new PackageTour("North package");
        ((PackageTour) northTour).addTour(bangkoktour);
        ((PackageTour) northTour).addTour(new SingleTour("Chiangmai",3000,10));
        ((PackageTour) northTour).addTour(new SingleTour("Mae hong sorn", 1000,15));

        System.out.println(bangkoktour.getName() + " "+bangkoktour.getPrice()+" "+bangkoktour.getAvailableSeats());

        System.out.println(northTour.getName() + " "+northTour.getPrice() +" "+ northTour.getAvailableSeats());

    }
}
