public class Brie {
    public int quality;
    public int daysRemaining;

    public Brie(int quality, int daysRemaining) {
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick(){
        daysRemaining -=1;
        if(quality ==50) return;
        quality+=1;
        if(quality ==50) return;
        if(daysRemaining <= 0) quality +=1;
    }
}
