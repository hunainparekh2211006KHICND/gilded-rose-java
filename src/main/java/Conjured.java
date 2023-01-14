public class Conjured extends Item{
    public Conjured(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick(){
        daysRemaining -=1;
        quality-=2;
    }
}
