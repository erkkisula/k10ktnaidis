import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {


    @Test
    public void test1(){
        Drink Water = new Drink("Vesi", 1, 1);
        Barrel Barrel1 = new Barrel(6.5,8, Water);

        assertEquals(13, Barrel1.emptyBarrelToBottles());
    }

    @Test
    public void test2(){
        Drink Water = new Drink("Vesi", 1, 1);
        Barrel Barrel1 = new Barrel(1.3,8, Water);

        assertEquals(2, Barrel1.fillBottle( new Bottle(1.5,0.1, Type.PLASTIC)));
    }

    @Test
    public void test3(){
        Bottle bottle =  new Bottle(0.5,0.1, Type.PLASTIC);

        assertEquals("Plastik", bottle.getBottleType());
    }

    @Test
    public void test4(){
        Drink Water = new Drink("Vesi", 1, 1);
        Bottle bottle =  new Bottle(0.5,0.1, Type.PLASTIC);
        bottle.addDrinkFull(Water);

        assertEquals(0.52, bottle.findOverallMass(), 0);
    }

    @Test
    public void test5(){
        Drink Water = new Drink("Vesi", 1, 1);
        Bottle bottle =  new Bottle(0.5,0.1, Type.PLASTIC);
        bottle.addDrinkFull(Water);

        assertEquals(0.6, bottle.findUnitPrice(), 0);
    }

    @Test
    public void test6(){
        Drink Water = new Drink("Vesi", 1, 1);

        assertEquals("Vesi", Water.getName());
    }

    @Test
    public void test7(){
        Drink Water = new Drink("Vesi", 1, 1);
        Bottle bottle =  new Bottle(0.5,0.1, Type.PLASTIC);
        bottle.addDrinkFull(Water);

        assertEquals(0.5, bottle.getDrinkInside(), 0);
    }
}
