package creational.prototype;

//Clasa ConcretePrototype1
//Creeaza primul prototip, iar apoi restul de obiecte sunt clonate datorita implementarii interfetei Prototype
//E nevoie de setteri pentru a modifica campurile obiectelor clonate
public class Campaign implements Prototype {
    private String name;
    private double budget;
    private String mainChannel;

    //Primul prototip creat prin clonare
    public Campaign(String name, double budget, String mainChannel) {
        this.name = name;
        this.budget = budget;
        this.mainChannel = mainChannel;
    }

    //Constructor privat folosit pentru clonare ce pune variabilele originale in noua campanie
    private Campaign(Campaign originalCampaign) {
        this.name = originalCampaign.name;
        this.budget = originalCampaign.budget;
        this.mainChannel = originalCampaign.mainChannel;
    }

    @Override
    public Prototype clone() {
        return new Campaign(this);
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setMainChannel(String mainChannel) {
        this.mainChannel = mainChannel;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                ", mainChannel='" + mainChannel + '\'' +
                '}';
    }
}
