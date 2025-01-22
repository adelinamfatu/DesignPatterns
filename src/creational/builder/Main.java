package creational.builder;

//O companie de turism dorește să implementeze un sistem pentru gestionarea pachetelor turistice.
//Fiecare pachet turistic trebuie să includă anumite proprietăți obligatorii, precum:
//Destinația.
//Durata călătoriei (în zile).
//Pe lângă aceste proprietăți obligatorii, un pachet turistic poate include proprietăți opționale, precum:
//Tipul de cazare (hotel, apartament, cabană).
//Numărul de mese incluse pe zi.
//Tipurile de activități disponibile (drumeție, schi, snorkeling, etc.).
//Un pachet turistic trebuie construit folosind un design pattern Builder, astfel încât:
//Proprietățile opționale pot fi adăugate în orice ordine.
//Obiectul final (pachetul turistic) să fie imutabil.
//Dacă anumite proprietăți (cum ar fi tipul de cazare sau activitățile) au valori limitate, acestea trebuie să fie definite prin enumerări.

public class Main {
    public static void main(String[] args) {
        //Creare pachet turistic cu toate optiunile, atat obligatorii, cat si optionale
        TourPackage tourPackage = new TourPackageBuilder("Bali", 7)
                .addAccommodationType(AccommodationType.HOTEL)
                .addMealsPerDay(3)
                .build();

        System.out.println("Tour Package 1: " + tourPackage);

        //Creare pachet turistic minimal (doar proprietăți obligatorii)
        TourPackage simplePackage = new TourPackageBuilder("Paris", 3)
                .build();

        System.out.println("Tour Package 2: " + simplePackage);
    }
}
