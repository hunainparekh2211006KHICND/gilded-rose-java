public class Brie extends Item {
    
    public Brie(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick(){
        daysRemaining -=1;
        if(quality ==50) return;
        quality+=1;
        if(quality ==50) return;
        if(daysRemaining <= 0) quality +=1;
    }
}
