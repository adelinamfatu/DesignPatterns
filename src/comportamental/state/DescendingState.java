package comportamental.state;

//ConcreteStateC
public class DescendingState implements State {
    @Override
    public void pressButton(LiftContext context) {
        System.out.println("Liftul coboară. Se oprește la următorul etaj...");
        context.setState(new StationaryState());
    }
}
