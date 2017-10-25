import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    private Normal item;

    private String name;
    private int quality;
    private int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void tick() {

        switch (name) {
            case "normal":
                normalTick();
                return;
            case "Aged Brie":
                brieTick();
                return;
            case "Sulfuras, Hand of Ragnaros":
                sulfurasTick();
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                backstageTick();
        }
    }

    private void normalTick() {
        item = new Normal(quality, daysRemaining);
        item.tick();
    }

    private void brieTick() {
        item = new Brie(quality, daysRemaining);
        item.tick();
    }

    private void sulfurasTick() {
        item = new Sulfuras(quality, daysRemaining);
        item.tick();
    }

    private void backstageTick() {
        item = new Backstage(quality, daysRemaining);
        item.tick();
    }

    public String getName() {
        if(item != null) return item.getName();
        return name;
    }

    public int getQuality() {
        if(item != null) return item.getQuality();
        return quality;
    }

    public int getDaysRemaining() {
        if(item != null) return item.getDaysRemaining();
        return daysRemaining;
    }
}
