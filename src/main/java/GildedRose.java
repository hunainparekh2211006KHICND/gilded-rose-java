public class GildedRose {

    public String name;
    public int quality;
    public int daysRemaining;

    public GildedRose(String name, int quality, int daysRemaining) {
        this.name = name;
        this.quality = quality;
        this.daysRemaining = daysRemaining;
    }

    public void normal_tick(){
        Normal item = new Normal(quality, daysRemaining);
        item.tick();
        this.quality = item.quality;
        this.daysRemaining = item.daysRemaining;
    }

    public void brie_tick(){
        daysRemaining -=1;
        if(quality ==50) return;
        quality+=1;
        if(quality ==50) return;
        if(daysRemaining <= 0) quality +=1;
    }

    public void sulfuras_tick(){

    }

    public void backstage_tick(){
        daysRemaining -=1;
        if(quality == 50) return;
        quality +=1;
        if(daysRemaining <=10) quality +=1;
        if(daysRemaining < 5) quality +=1;
        if(daysRemaining < 0) quality =0;
    }

    public void tick() {
        switch (name){
            case "normal":
                normal_tick();
                return;
            case "Aged Brie":
                brie_tick();
                return;
            case "Sulfuras, Hand of Ragnaros":
                sulfuras_tick();
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                backstage_tick();
                return;
        }
    }
}
