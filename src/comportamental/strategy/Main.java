package comportamental.strategy;

//Imaginați-vă că aveți un calculator de prețuri pentru un magazin online.
//Prețul final al unui produs poate varia în funcție de strategia de reducere aplicată: reducere procentuală,
//reducere fixă sau fără reducere. Design pattern-ul Strategy ne ajută să implementăm acest comportament,
//oferind flexibilitatea de a schimba strategia de calcul a prețului fără a modifica codul principal.

public class Main {
    public static void main(String[] args) {
        double basePrice = 100.0;

        //Aplicarea strategiei A
        PricingStrategy percentageDiscount = new PercentageDiscountStrategy(10);
        double priceWithPercentageDiscount = percentageDiscount.calculatePrice(basePrice);
        System.out.println("Preț cu reducere procentuală: " + priceWithPercentageDiscount);

        //Aplicarea strategiei B
        PricingStrategy fixedDiscount = new FixedDiscountStrategy(15);
        double priceWithFixedDiscount = fixedDiscount.calculatePrice(basePrice);
        System.out.println("Preț cu reducere fixă: " + priceWithFixedDiscount);

        //Aplicare strategie C
        PricingStrategy noDiscount = new NoDiscountStrategy();
        double priceWithNoDiscount = noDiscount.calculatePrice(basePrice);
        System.out.println("Preț fără reducere: " + priceWithNoDiscount);
    }
}
