import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();

    public void add(Quackable quacker){
        quackers.add(quacker);

    }
    @Override
    public void quack() {
        Iterator interator = quackers.iterator();
        Quackable first = (Quackable) interator.next();

        for(int i=0;i<3;i++){
            first.quack();
        }
        while(interator.hasNext()){
            Quackable quacker = (Quackable)interator.next();
            quacker.quack();


        }
    }
}
