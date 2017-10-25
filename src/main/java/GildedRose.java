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
        daysRemaining -= 1;
        if(quality >= 50) {
            return;
        }

        quality += 1;
        if(daysRemaining <= 0 && quality < 50) {
            quality += 1;
        }
    }

    private void sulfurasTick() {

    }

    private void backstageTick() {
        daysRemaining -= 1;
        if(quality >= 50) {
            return;
        }
        if(daysRemaining < 0) {
            quality = 0;
            return;
        }

        quality += 1;
        if(daysRemaining < 10) {
            quality += 1;
        }
        if(daysRemaining < 5) {
            quality += 1;
        }
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
