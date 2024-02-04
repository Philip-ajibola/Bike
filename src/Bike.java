public class Bike {
    private boolean onBike;
    private int speed;
    public void toggleSwitchToOnAndOffBike(){
        onBike = !onBike;
    }

    public boolean isBikeOn(){
        return onBike;
    }

    public void accelerateBike(){
        if(speed>=0 && speed<=20 ) {
            speed++;
        } else if(speed>=21 && speed<=30){
            speed += 2;
        } else if (speed>=31 && speed<=40) {
            speed += 3;
        }else if(speed>=41){
            speed +=4;
        }
    }


    public int getSpeed() {
        return speed;
    }

    public void decelerateBike() {
        if(speed>0 && speed<=20 ) {
            speed--;
        } else if(speed>=21 && speed<=30){
            speed -= 2;
        } else if (speed>=31 && speed<=40) {
            speed -= 3;
        }else if(speed>=41){
            speed -=4;
        }

    }
}
