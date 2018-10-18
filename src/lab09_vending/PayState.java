package lab09_vending;

public class PayState implements State {
    private VendingMachine vendingMachine;

    public PayState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void insertCoin(int coin) {
        int currentAmount = vendingMachine.getAmount();
        if(currentAmount >= vendingMachine.getPrice()){
            System.out.println("Thank you");
            System.out.println("get your charge "+(currentAmount - vendingMachine.getPrice()));
            vendingMachine.reset();
            vendingMachine.setCurrentState(vendingMachine.getEndState());
        }else{
            System.out.println("Need more coin");
        }
    }

    @Override
    public void chooseStation(String station) {
        System.out.println("invalid state");
    }

    @Override
    public void getTicket() {
        System.out.println("Invalid state");
    }
}
