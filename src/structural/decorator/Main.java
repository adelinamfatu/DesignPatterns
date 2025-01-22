package structural.decorator;

//Compania XYZ gestionează un sistem de notificări pentru utilizatori.
//Fiecare notificare poate fi trimisă printr-un canal de bază (de exemplu, e-mail),
//dar se dorește extinderea funcționalității pentru a permite trimiterea notificărilor suplimentare prin alte canale
//(de exemplu, SMS, notificări push).
//Sistemul trebuie să permită extinderea funcționalităților notificărilor fără a modifica clasa de bază.
//O notificare trebuie să fie configurabilă pentru a folosi unul sau mai multe canale simultan.
//Fiecare canal trebuie să adauge o funcționalitate specifică, cum ar fi logarea mesajelor trimise.

public class Main {
    public static void main(String[] args) {
        Notifier basicNotifier = new BasicNotifier();

        //Adaugare functionalitate de trimitere SMS
        Notifier smsNotifier = new SMSNotifier(basicNotifier);

        //Adaugare functionalitate de trimitere notificari push
        Notifier pushNotifier = new PushNotifier(smsNotifier);

        pushNotifier.send("Am decorat");
    }
}
