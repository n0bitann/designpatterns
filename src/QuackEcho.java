public class QuackEcho implements Quackable {
    Quackable duck;


    public QuackEcho(Quackable quackable){
        this.duck = quackable;

    }
    @Override
    public void quack() {
        duck.quack();
        System.out.println("Echo : ");
        duck.quack();

    }
}
