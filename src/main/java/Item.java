public class Item {

    int quality;
    int daysRemaining;

    public Item(int quality, int daysRemaining) {
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick() {
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
