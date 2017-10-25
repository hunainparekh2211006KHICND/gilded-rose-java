public class Normal {

    private int quality;
    private int daysRemaining;

    public Normal(int quality, int daysRemaining) {
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick() {
        daysRemaining -= 1;
        if(quality == 0) {
            return;
        }

        quality -= 1;
        if(daysRemaining <= 0) {
            quality -= 1;
        }
    }

    public String getName() {
        return "normal";
    }

    public int getQuality() {
        return quality;
    }

    public int getDaysRemaining() {
        return daysRemaining;
    }
}
