public class Backstage extends Item{

    public Backstage(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick(){
        daysRemaining -=1;
        if(quality == 50) return;
        quality +=1;
        if(daysRemaining <=10) quality +=1;
        if(daysRemaining < 5) quality +=1;
        if(daysRemaining < 0) quality =0;
    }
}
