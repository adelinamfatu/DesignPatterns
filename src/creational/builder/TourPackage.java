package creational.builder;

//Clasa Product
//Are proprietati obligatorii si unele optionale -
public class TourPackage {
    //Proprietati obligatorii
    private String destination;
    private int durationDays;

    //Proprietati optionale
    private final AccommodationType accommodation;
    private final int mealsPerDay;

    //Constructor care ia campurile din ProductBuilder
    public TourPackage(TourPackageBuilder builder) {
        this.destination = builder.destination;
        this.durationDays = builder.durationDays;
        this.accommodation = builder.accommodationType;
        this.mealsPerDay = builder.mealsPerDay;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "destination='" + destination + '\'' +
                ", durationDays=" + durationDays +
                ", accommodation=" + accommodation +
                ", mealsPerDay=" + mealsPerDay +
                '}';
    }
}
