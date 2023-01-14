public class Conjured extends Item{
    public Conjured(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick(){
        daysRemaining -=1;
        quality-=1;
        if(quality !=0) quality -=1;
    }
}
