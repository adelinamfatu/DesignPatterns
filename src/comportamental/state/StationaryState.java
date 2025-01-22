package comportamental.state;

//ConcreteStateA
public class StationaryState implements State {
    @Override
    public void pressButton(LiftContext context) {
        System.out.println("Liftul este staționar. Se pregătește să urce...");
        context.setState(new AscendingState());
    }
}
