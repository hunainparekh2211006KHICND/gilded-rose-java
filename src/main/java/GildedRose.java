import org.apache.commons.lang3.StringUtils;

public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

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
        daysRemaining -= 1;
        if(quality == 0) return;

        quality -= 1;
        if(daysRemaining <= 0) quality -= 1;
    }

    private void brieTick() {
        daysRemaining -= 1;
        if(quality >= 50) return;

        quality += 1;
        if(daysRemaining <= 0) quality += 1;
    }

    private void sulfurasTick() {

    }

    private void backstageTick() {
        daysRemaining -= 1;
        if(quality >= 50) return;
        if(daysRemaining < 0) {
            quality = 0;
            return;
        }

        quality += 1;
        if(daysRemaining < 10) quality += 1;
        if(daysRemaining < 5) quality += 1;
    }

}
