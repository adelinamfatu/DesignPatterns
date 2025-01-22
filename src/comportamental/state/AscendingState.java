package comportamental.state;

//ConcreteStateB
public class AscendingState implements State {
    @Override
    public void pressButton(LiftContext context) {
        System.out.println("Liftul urcă. Se oprește la următorul etaj...");
        context.setState(new StationaryState());
    }
}

