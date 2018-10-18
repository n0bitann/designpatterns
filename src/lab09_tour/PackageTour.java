package lab09_tour;

import java.util.ArrayList;
import java.util.List;

public class PackageTour  implements Tour{
    private String packageName;
    private List<Tour> tours = new ArrayList<Tour>();


    @Override
    public String getName() {
        return this.packageName;
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(Tour t: tours){
            total += t.getPrice();
        }
        return total*0.9;
    }

    @Override
    public int getAvailableSeats() {
        if(tours.isEmpty()){
            return 0;
        }
        int min = tours.get(0).getAvailableSeats();
        for (Tour t:tours
             ) {
            if(t.getAvailableSeats() <= min){
                min = t.getAvailableSeats();
            }

        }
        return min;
    }


    public void addTour(Tour tour){
        tours.add(tour);
    }

    public PackageTour(String name){
        this.packageName = name;
    }


}
