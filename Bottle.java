public class Bottle {
    double volume;
    double bottleMass;
    double packagePrice;
    Type type;
    Drink drink;

    double drinkInside = 0;

    public Bottle(double volume, double packagePrice, Type type){
        this.volume = volume;
        this.packagePrice = packagePrice;
        this.type = type;
        this.bottleMass = setBottleMass();
    }

    public double getDrinkInside(){
        return this.drinkInside;
    }

    public double getVolume(){
        return this.volume;
    }
    public void addDrinkFull(Drink drink){
        this.drink = drink;
        this.drinkInside = this.volume;
    }

    public void addDrinkCustom(Drink drink, double amount){
        this.drink = drink;
        this.drinkInside = amount;
    }

    public String getBottleType(){
        String temp = "";
        if(this.type == Type.GLASS){
            temp = "Klaas";
        }else{
            temp = "Plastik";
        }
        return temp;
    }

    public double setBottleMass(){
        double massPerLiter;
        if(this.type == Type.GLASS){
            massPerLiter = 0.65;
        }else{
            massPerLiter = 0.04;
        }

        return massPerLiter*this.volume;
    }

    public double findOverallMass(){
        if(this.drinkInside != 0) {
            return this.drink.getDrinkMass(this.drink.massPerLiter, this.drinkInside) + this.bottleMass;
        }

        return this.bottleMass;
    }

    public double findUnitPrice(){
        if(this.drink != null){
            return (this.drink.getPricePerLiter()*this.drinkInside) + this.packagePrice;
        }
        return  this.packagePrice;
    }
}
