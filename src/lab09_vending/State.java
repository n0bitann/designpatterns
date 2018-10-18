package lab09_vending;

public interface State {
    void insertCoin(int coin);
    void chooseStation(String station);
    void getTicket();

}
