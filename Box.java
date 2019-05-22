import java.util.ArrayList;
import java.util.List;

public class Box {
    Type type;
    int bottleAmount;
    double boxPrice;
    double boxWeight;
    List<Bottle> bottles = new ArrayList<>();
    
    public Box(Type type){
        this.type = type;
        
        if(this.type == Type.PLASTIC){
            this.bottleAmount = 23;
            this.boxPrice = 1.8;
            this.boxWeight = 0.6;
        }else{
            this.bottleAmount = 16;
            this.boxPrice = 0.6;
            this.boxWeight = 0.1;
        }
    }
    
    public void addBottle(Bottle bottle){
        bottles.add(bottle);
    }
    
    public void fillWithBottles(double volume, double packagePrice, Type type){
        for(int i = 0; i <bottleAmount; i++){
            bottles.add(new Bottle(volume,packagePrice, type));
        }
    }
    
    public void showBottlesInBox(){
        int i = 0;
        for(i = 0; i < bottles.size(); i++){
            System.out.println("Pudeli materjal: " + bottles.get(i).getBottleType() + ", Maht: " + bottles.get(i).getVolume() + " liitrit, Hetkel sees: " + bottles.get(i).getDrinkInside());
        }
        System.out.println("Kastis on kokku " + i + " pudelit.");
    }

    public double getBoxWeightWithBottles(){
        double totalWeight = this.boxWeight;
        for(int i = 0; i < bottles.size(); i++){
            double temp = bottles.get(i).findOverallMass();
            totalWeight += temp;
            System.out.println(totalWeight);
        }
        totalWeight = Math.round(totalWeight*100);

        return totalWeight/100;
    }
}
