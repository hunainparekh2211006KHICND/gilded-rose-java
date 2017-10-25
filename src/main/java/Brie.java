public class Brie extends Normal {
    public Brie(int quality, int daysRemaining) {
        super(quality, daysRemaining);
    }

    public void tick() {
        daysRemaining -= 1;
        if(quality >= 50) {
            return;
        }

        quality += 1;
        if(daysRemaining <= 0 && quality < 50) {
            quality += 1;
        }
    }

}
