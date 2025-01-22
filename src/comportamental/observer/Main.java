package comportamental.observer;

//Imaginați-vă un sistem de știri în care diferiți utilizatori (observatori) se pot abona la un canal de știri (subiect).
//De fiecare dată când canalul de știri publică o nouă știre, toți utilizatorii abonați sunt notificați automat.
//Vom folosi design pattern-ul Observer pentru a implementa acest sistem.

public class Main {
    public static void main(String[] args) {
        //Creare subiect
        NewsChannel channel = new NewsChannel();

        //Creare observatori
        Observer emailUser = new EmailSubscriber("Alice");
        Observer smsUser = new SMSSubscriber("Bob");
        Observer emailUser2 = new EmailSubscriber("Charlie");

        //Abonare utilizatori
        channel.attach(emailUser);
        channel.attach(smsUser);
        channel.attach(emailUser2);

        //Publicare stire
        System.out.println("Se publică prima știre:");
        channel.setLatestNews("Breaking News: Design Patterns sunt ușor de înțeles!");

        //Eliminare utilizator si publicare stire noua
        channel.detach(emailUser2);
        System.out.println("\nSe publică a doua știre:");
        channel.setLatestNews("Update: Observer Pattern este explicat perfect!");
    }
}
