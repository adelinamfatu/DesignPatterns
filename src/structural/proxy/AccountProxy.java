package structural.proxy;

//Clasa Proxy
public class AccountProxy implements Account {
    private RealAccount realSubject;
    private boolean isAuthenticated;

    public AccountProxy(boolean isAuthenticated) {
        this.isAuthenticated = isAuthenticated;
    }

    @Override
    public void performTransaction() {
        if (isAuthenticated) {
            if (realSubject == null) {
                realSubject = new RealAccount();
            }
            realSubject.performTransaction();
        } else {
            System.out.println("Proxy: Access denied. You need to be authenticated.");
        }
    }
}
