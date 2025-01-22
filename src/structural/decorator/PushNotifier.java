package structural.decorator;

//ConcreteDecoratorB
public class PushNotifier extends NotifierDecorator {
    public PushNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendPushNotification(message);
    }

    private void sendPushNotification(String message) {
        System.out.println("Sending push notification: " + message);
    }
}
