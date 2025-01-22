package creational.builder;

//Clasa ProductBuilder
//Are aceleasi proprietati ca si Product
//Preia toate campurile pentru clasa Product - cele obligatorii prin constructor si cele optionale prin metode separate
//Si construieste produsul (Product)
public class TourPackageBuilder {
    protected String destination;
    protected int durationDays;
    protected AccommodationType accommodationType;
    protected int mealsPerDay;

    //Constructor cu parametrii obligatorii
    public TourPackageBuilder(String destination, int durationDays) {
        this.destination = destination;
        this.durationDays = durationDays;
    }

    //Adauga camp optional 1
    public TourPackageBuilder addAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
        return this;
    }

    //Adaugare camp optional 2
    public TourPackageBuilder addMealsPerDay(int mealsPerDay) {
        this.mealsPerDay = mealsPerDay;
        return this;
    }

    //Metoda build - creeaza pachetul turistic prin builder
    public TourPackage build() {
        return new TourPackage(this);
    }
}
