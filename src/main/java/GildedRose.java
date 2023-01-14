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
        switch (name){
            case "normal":
                Normal normal = new Normal(quality, daysRemaining);
                normal.tick();
                this.quality = normal.quality;
                this.daysRemaining = normal.daysRemaining;
                return;
            case "Aged Brie":
                Brie brie = new Brie(quality, daysRemaining);
                brie.tick();
                this.quality = brie.quality;
                this.daysRemaining = brie.daysRemaining;
                return;
            case "Sulfuras, Hand of Ragnaros":
                Sulfuras sulfuras = new Sulfuras(quality, daysRemaining);
                sulfuras.tick();
                this.quality = sulfuras.quality;
                this.daysRemaining = sulfuras.daysRemaining;
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                Backstage backstage = new Backstage(quality, daysRemaining);
                backstage.tick();
                this.quality = backstage.quality;
                this.daysRemaining = backstage.daysRemaining;
                return;
        }
    }
}
