public class Drink {
    String name;
    double pricePerLiter;
    double massPerLiter;

    public Drink(String name, double price, double weight){
        this.name = name;
        this.pricePerLiter = price;
        this.massPerLiter = weight;
    }

    public String getName(){
        return name;
    }

    public double getPricePerLiter(){
        return pricePerLiter;
    }

    public double getMassPerLiter(){
        return massPerLiter;
    }

    public double getDrinkMass(double massPerLiter, double volume){
        return massPerLiter*volume;
    }
}
