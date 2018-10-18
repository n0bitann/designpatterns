package lab09_vending;

public class VendingMachine {

    private State payState = new PayState(this);
    private State readyState = new ReadyState(this);
    private State endState = new EndState(this);
    private State currentState = readyState;
    private int price =0;
    private int amount = 0;

    public VendingMachine(){
        //Constructor
    }

    public State getCurrentState() {
        return currentState;
    }
    public State getEndState(){
        return endState;
    }
    public State getPayState(){
        return payState;

    }

    public State getReadyState(){
        return readyState;
    }

    public int getAmount() {
        return amount;
    }

    public int getPrice() {
        return price;
    }
    private void setAmount(int num){
        this.price =num;
    }
    private void setPrice(int num){
        this.price = num;
    }
    public void setCurrentState(State state){
        this.currentState = state;
    }

    public void reset(){
        setAmount(0);
        setPrice(0);
    }
}
