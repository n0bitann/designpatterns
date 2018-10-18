package lab08_duck;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory){
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable duckCall = duckFactory.createDuckCall();


//        lab08_duck.Quackable mallardDuck = new lab08_duck.MallardDuck();
//        lab08_duck.Quackable redheadDuck = new lab08_duck.RedHeadDuck();
//        lab08_duck.Quackable duckCall = new lab08_duck.DuckCall();
//        lab08_duck.Quackable rubberDuck = new lab08_duck.RubberDuck();

//        lab08_duck.Quackable mallardDuck = new lab08_duck.QuackCounter(new lab08_duck.MallardDuck());
//        lab08_duck.Quackable redheadDuck = new lab08_duck.QuackCounter(new lab08_duck.RedHeadDuck());
//        lab08_duck.Quackable duckCall = new lab08_duck.QuackCounter(new lab08_duck.DuckCall());
//        lab08_duck.Quackable rubberDuck = new lab08_duck.QuackCounter(new lab08_duck.RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());



        System.out.println("\nDuck Simulator");
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        flockOfDucks.add(mallardDuck);


        System.out.println("\nDuck Simulator: Whole lab08_duck.Flock Simulation");
        simulate(flockOfDucks);



        // Counter
//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);
//        System.out.println("The Duck quacked "+lab08_duck.QuackCounter.getQuacks()+" Times");
    }
    void simulate(Quackable duck){
        duck.quack();
    }
}
