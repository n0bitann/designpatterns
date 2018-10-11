public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuack;



    @Override
    public void quack() {
        duck.quack();
        numberOfQuack++;

    }

    public QuackCounter (Quackable duck){
        this.duck = duck;
    }
    public static int getQuacks(){
        return numberOfQuack;
    }
}
