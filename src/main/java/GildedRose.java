public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public Item item;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.item = classChanger(name,quality,daysRemaining);
    }

    public Item classChanger(String name,int quality,int daysRemaining){
        switch (name){
            case "normal":
                return new Normal(quality, daysRemaining);
            case "Aged Brie":
                return new Brie(quality, daysRemaining);
            case "Sulfuras, Hand of Ragnaros":
                return new Sulfuras(quality, daysRemaining);
            case "Backstage passes to a TAFKAL80ETC concert":
                return new Backstage(quality, daysRemaining);
        }
        throw new RuntimeException("Unknown class: " + name);
    }

    public void tick() {
        item.tick();
        this.quality = item.quality;
        this.daysRemaining = item.daysRemaining;
    }
}
