public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberofQuack;

    @Override
    public void quack() {
        duck.quack();
        numberofQuack++;

    }

    public QuackCounter (Quackable duck){
        this.duck = duck;
    }
    public static int getQuacks(){
        return numberofQuack;
    }
}
