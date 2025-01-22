package creational.prototype;

//O companie de marketing gestionează campanii publicitare pentru clienți. Fiecare campanie include:
//Numele campaniei.
//Bugetul total.
//Canalul de publicitate principal (TV, online, print, etc.).
//O listă de mesaje publicitare.
//Pentru a crea campanii similare rapid, compania dorește să implementeze o soluție care să permită clonarea campaniilor
//existente (inclusiv a tuturor detaliilor lor) și să modifice doar anumite proprietăți.
//De exemplu, o campanie pentru un client poate fi duplicată pentru alt client cu mici ajustări.

public class Main {
    public static void main(String[] args) {
        //Creare campanie originala
        Campaign originalCampaign = new Campaign(
                "Summer Sale",
                5000.0,
                "Online"
        );

        //Clonare campanie originala
        Campaign clonedCampaign = (Campaign) originalCampaign.clone();
        //Modificare campanie noua
        clonedCampaign.setName("Winter Sale");
        clonedCampaign.setBudget(6000.0);

        //Afisare campanii
        System.out.println("Original Campaign: " + originalCampaign);
        System.out.println("Cloned Campaign: " + clonedCampaign);
    }
}
