import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void initializeBike(){
         bike = new Bike();
    }

    @Test
    public void testThatIOnBike_ItOn(){
        assertFalse(bike.isBikeOn());
        bike.toggleSwitchToOnAndOffBike();
        assertTrue(bike.isBikeOn());
    }

    @Test
    public void testThatIOffBike_ItOff(){
        assertFalse(bike.isBikeOn());
        bike.toggleSwitchToOnAndOffBike();
        assertTrue(bike.isBikeOn());
        bike.toggleSwitchToOnAndOffBike();
        assertFalse(bike.isBikeOn());
    }

    @Test
    public void testThatIfIAccelerateOnGearOne_itAccelerateByOne(){
        bike.isBikeOn();
        for(int count = 5; count>=1;count--){
            bike.accelerateBike();
        }
        assertEquals(5,bike.getSpeed());
    }

    @Test
    public void testThatIfIAccelerateOnGearTwo_itAccelerateByOne(){
        bike.isBikeOn();
        for(int count = 1;count<=25;count++){
            bike.accelerateBike();
        }
        assertEquals(29,bike.getSpeed());
    }

    @Test
    public void testThatIfIAccelerateOnGearThree_itAccelerateByOne(){
        bike.isBikeOn();
        for(int count = 1;count<=30;count++){
            bike.accelerateBike();
        }
        assertEquals(43,bike.getSpeed());
    }
    @Test
    public void testThatIfIAccelerateOnGearfour_itAccelerateByOne(){
        bike.isBikeOn();
        for(int count = 1;count<=34;count++){
            bike.accelerateBike();
        }
        assertEquals(59,bike.getSpeed());
    }

    @Test
    public void testThatIfIDecelerateOnGearFour_itDecelerateByThree(){
        bike.isBikeOn();
        for(int count = 1;count<=34;count++){
            bike.accelerateBike();
        }
        for(int count = 34;count >=30;count--){
            bike.decelerateBike();
        }
        assertEquals(39,bike.getSpeed());
    }

    @Test
    public void testThatIfIDecelerateOnGearThree_itDecelerateByThree(){
        bike.isBikeOn();
        for(int count = 1;count<=34;count++){
            bike.accelerateBike();
        }
        for(int count = 34;count >=27;count--){
            bike.decelerateBike();
        }
        assertEquals(30,bike.getSpeed());
    }

    @Test
    public void testThatIfIDecelerateOnGearTwo_itDecelerateByTwo(){
        bike.isBikeOn();
        for(int count = 1;count<=34;count++){
            bike.accelerateBike();
        }
        for(int count = 34;count >=22;count--){
            bike.decelerateBike();
        }
        assertEquals(20,bike.getSpeed());
    }

    @Test
    public void testThatIfIDecelerateOnGearOne_itDecelerateByOne(){
        bike.isBikeOn();
        for(int count = 1;count<=34;count++){
            bike.accelerateBike();
        }
        for(int count = 34;count >=1;count--){
            bike.decelerateBike();
        }
        assertEquals(0,bike.getSpeed());
    }
}
