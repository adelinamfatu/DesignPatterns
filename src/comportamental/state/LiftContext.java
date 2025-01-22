package comportamental.state;

//Clasa Context
public class LiftContext {
    private State currentState;

    public LiftContext(State initialState) {
        this.currentState = initialState;
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void pressButton() {
        currentState.pressButton(this);
    }
}
