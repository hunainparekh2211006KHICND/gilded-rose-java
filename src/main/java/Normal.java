public class Normal extends Item{
    
    public Normal(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick(){
        daysRemaining -=1;
        if(quality == 0) return;
        quality -=1;
        if(daysRemaining <=0) quality -=1;
    }
}
