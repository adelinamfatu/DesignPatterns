package comportamental.null_object;

public class RealUser implements User {
    private String username;

    public RealUser(String username) {
        this.username = username;
    }

    @Override
    public void performAction() {
        System.out.println(username + " is performing an action.");
    }
}
