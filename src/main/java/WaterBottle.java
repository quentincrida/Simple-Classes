public class WaterBottle {

private int volume;

public WaterBottle(int volume){
    this.volume = volume;
    }
    public int getVolume(){
    return volume;
    }
    public int drink(){
    return this.volume - 10;
    }
}

