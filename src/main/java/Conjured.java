public class Conjured extends Item{
    public Conjured(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick(){
        daysRemaining -=1;
        if(quality == 0) return;
        quality-=1;
        if(quality == 0) return;
        quality -=1;
        if(daysRemaining < 0) quality -=2;
    }
}
