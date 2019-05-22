public class Main {

    public static void main(String[] args) {

        Drink Water = new Drink("Vesi", 1, 1);
        Bottle SmallWaterBottle = new Bottle(0.5,0.1, Type.PLASTIC);

        SmallWaterBottle.addDrinkFull(Water);
        System.out.println("Pudelis on " + SmallWaterBottle.drink.getName() + " ");
        System.out.println("Pudel kaalub " + SmallWaterBottle.findOverallMass() + " kilo");
        System.out.println("Pudel maksab " + SmallWaterBottle.findUnitPrice() + " eurot");

        Bottle EmptyBottle = new Bottle(0.5, 0.1, Type.PLASTIC);
        System.out.println("Pudel kaalub " + EmptyBottle.findOverallMass() + " kilo");
        System.out.println("Pudel maksab " + EmptyBottle.findUnitPrice() + " eurot");

        //Barreli osa
        System.out.println("----------------------------------------------------");
        Barrel Barrel1 = new Barrel(10,8, Water);
        Bottle Bottle1 = new Bottle(0.5, 0.1, Type.PLASTIC);

        System.out.println("Vaadi sees on: " + Barrel1.getDrinkInside() + " liitrit.");
        System.out.println("Pudeli sees on: " + Bottle1.getDrinkInside() + " liitrit.");
        Barrel1.fillBottle(Bottle1);
        System.out.println("Vaadi sees on: " + Barrel1.getDrinkInside() + " liitrit");
        System.out.println("Pudeli sees on: " + Bottle1.getDrinkInside() + " liitrit.");

        //Terve barrel tühjaks
        System.out.println("----------------------------------------------------");
        Barrel Barrel2 = new Barrel(6.3,8, Water);

        System.out.println("Täis täidetud sai: " + Barrel2.emptyBarrelToBottles() + " pudelit.");

        //Kasti osa
        Box Box1 = new Box(Type.PLASTIC);
        Box1.fillWithBottles(0.5, 0.1, Type.PLASTIC);

        Box1.showBottlesInBox();
        System.out.println("Kast koos sees olevate pudelitega kaalub: " + Box1.getBoxWeightWithBottles());
    }
}
