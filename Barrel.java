import java.util.ArrayList;
import java.util.List;

public class Barrel {
    double volume;
    double drinkInside;
    Drink drink;

    public Barrel(double volume, double drinkInside, Drink drink){
        this.volume = volume;
        this.drinkInside = drinkInside;
        this.drink = drink;

        if(this.drinkInside > this.volume){
            this.drinkInside = this.volume;
        }

    }

    public double getDrinkInside(){
        return this.drinkInside;
    }

    public int fillBottle(Bottle bottle){
        if(bottle.drinkInside != bottle.volume){
            if(bottle.drink == null || bottle.drink != this.drink){
                if(this.drinkInside >= bottle.volume) {
                    this.drinkInside -= bottle.volume;
                    bottle.addDrinkFull(this.drink);
                    System.out.println("Pudel täidetud");
                    return 1;
                }else if(this.drinkInside > 0 && this.drinkInside < bottle.volume){
                    bottle.addDrinkCustom(this.drink, this.drinkInside);
                    this.drinkInside -= this.drinkInside;
                    System.out.println("Täidetud " + bottle.drinkInside + " liitrit ");
                    System.out.println("Vaat sai tühjaks!");
                    return 2;
                }else{
                    System.out.println("Jooki pole!");
                }
            }else{
                System.out.println("Pudelis on juba midagi muud sees!");
            }
        }else{
            System.out.println("Pudel juba täis!");
        }
        return 0;
    }

    public int emptyBarrelToBottles(){
        if(this.drinkInside != 0){
            int bottlesFilled = 0;
            int halfFilled = 0;

            List<Bottle> bottles = new ArrayList<Bottle>();
            while(this.drinkInside != 0){
                bottles.add(new Bottle(0.5,0.1, Type.PLASTIC));
                int a = fillBottle(bottles.get(bottlesFilled));
                bottlesFilled++;
            }
            return bottlesFilled;
        }
        return 0;
    }

}
