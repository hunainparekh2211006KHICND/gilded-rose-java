import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    private Item item;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.item = klassFor(name, quality, daysRemaining);
    }

    private Item klassFor(String name, int quality, int daysRemaining) {
        switch (name) {
            case "normal":
                return new Normal(quality, daysRemaining);
            case "Aged Brie":
                return new Brie(quality, daysRemaining);
            case "Sulfuras, Hand of Ragnaros":
                return new Item(quality, daysRemaining);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage(quality, daysRemaining);
        }
        throw new RuntimeException("Unknown class: " + name);
    }

    public void tick() {
        item.tick();
    }

    public String getName() {
        return item.getName();
    }

    public int getQuality() {
        return item.getQuality();
    }

    public int getDaysRemaining() {
        return item.getDaysRemaining();
    }
}
