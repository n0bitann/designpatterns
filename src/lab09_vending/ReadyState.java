package lab09_vending;

import java.util.HashMap;
import java.util.Map;

public class ReadyState implements State {
    private VendingMachine vendingMachine;
    private Map<String ,Integer> stationMap = new HashMap<>();

    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
        this.stationMap.put("Thailand",100);
        this.stationMap.put("Malaysia",200);
        this.stationMap.put("Vietnam",250);

    }
    @Override
    public void insertCoin(int coin) {
        System.out.println("Invalid state");
    }

    @Override
    public void chooseStation(String station) {
        if(!stationMap.containsKey(station)){
            System.out.println("Not have this station");
            return;
        }
        int price = stationMap.get(station);
        System.out.println("You choose "+station);
        vendingMachine.setCurrentState(vendingMachine.getPayState());
    }

    @Override
    public void getTicket() {
        System.out.println("invalid state");
    }
}
