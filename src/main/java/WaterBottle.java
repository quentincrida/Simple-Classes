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
    public int empty(){
    return this.volume = 0;
    }
    public int fill() {
    volume = 100;
    return this.volume;
    }
}

