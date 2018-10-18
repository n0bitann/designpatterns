package lab09_vending;

public class EndState implements State {
    VendingMachine vendingMachine;

    public EndState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override

    public void insertCoin(int coin) {
        System.out.println("Invalid state");
    }

    @Override
    public void chooseStation(String station) {
        System.out.println("Invalid state Process End ");
    }

    @Override
    public void getTicket() {
        System.out.println("Get Ticker");
        vendingMachine.setCurrentState(vendingMachine.getReadyState());

    }
}
