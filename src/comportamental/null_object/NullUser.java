package comportamental.null_object;

public class NullUser implements User {
    @Override
    public void performAction() {
        //Nu face nicio acțiune
        System.out.println("No action performed. User is not active.");
    }
}
