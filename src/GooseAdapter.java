public class GooseAdapter implements Quackable {
    Goose goose;

    @Override
    public void quack() {
        goose.honk();
    }
}
