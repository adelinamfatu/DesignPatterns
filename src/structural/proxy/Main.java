package structural.proxy;

//Imaginați-vă că într-o bancă, utilizatorii pot accesa serviciile bancare doar dacă sunt autentificați.
//În acest caz, avem un sistem în care un proxy joacă rolul unui gardian, care va controla accesul la contul bancar real
//al utilizatorului. Dacă utilizatorul este autentificat, proxy-ul îi va permite să efectueze tranzacții,
//iar dacă nu este autentificat, accesul va fi refuzat.

public class Main {
    public static void main(String[] args) {
        //Utilizator autentificat
        Account account = new AccountProxy(true);
        account.performTransaction();

        //Utilizator neautentificat
        Account account2 = new AccountProxy(false);
        account2.performTransaction();
    }
}
