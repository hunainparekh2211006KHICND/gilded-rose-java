public class Item {
    public int quality;
    public int daysRemaining;

    public Item(int quality, int daysRemaining) {
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick(){};
}
