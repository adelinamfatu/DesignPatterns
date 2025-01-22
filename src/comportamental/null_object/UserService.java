package comportamental.null_object;

public class UserService {
    private User user;

    //Constructor care primește un utilizator real sau nul
    public UserService(User user) {
        this.user = user;
    }

    public void executeAction() {
        user.performAction();
    }
}
