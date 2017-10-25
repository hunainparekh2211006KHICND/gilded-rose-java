import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    // ------------------------------------- normal -------------------------------------------------------------------
    @Test
    public void testNormalItemBeforeSellDate() {
        GildedRose item = new GildedRose("normal", 10, 5);
        item.tick();
        
        assertEquals(9, item.getQuality());
        assertEquals(4, item.getDaysRemaining());
    }

    @Test
    public void testNormalItemOnSellDate() {
        GildedRose item = new GildedRose("normal", 10, 0);
        item.tick();

        assertEquals(8, item.getQuality());
        assertEquals(-1, item.getDaysRemaining());
    }

    @Test
    public void testNormalItemAfterSellDate() {
        GildedRose item = new GildedRose("normal", 10, -1);
        item.tick();

        assertEquals(8, item.getQuality());
        assertEquals(-2, item.getDaysRemaining());
    }

    @Test
    public void testNormalItemOfZeroQuality() {
        GildedRose item = new GildedRose("normal", 0, 5);
        item.tick();

        assertEquals(0, item.getQuality());
        assertEquals(4, item.getDaysRemaining());
    }

    // ------------------------------------- brie ---------------------------------------------------------------------
    @Test
    public void testBrieBeforeSellDate() {
        GildedRose item = new GildedRose("Aged Brie", 10, 5);
        item.tick();

        assertEquals(11, item.getQuality());
        assertEquals(4, item.getDaysRemaining());
    }

    @Test
    public void testBrieBeforeSellDateWithMaxQuality() {
        GildedRose item = new GildedRose("Aged Brie", 50, 5);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(4, item.getDaysRemaining());
    }

    @Test
    public void testBrieOnSellDate() {
        GildedRose item = new GildedRose("Aged Brie", 10, 0);
        item.tick();

        assertEquals(12, item.getQuality());
        assertEquals(-1, item.getDaysRemaining());
    }

    @Test
    public void testBrieOnSellDateNearMaxQuality() {
        GildedRose item = new GildedRose("Aged Brie", 49, 0);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(-1, item.getDaysRemaining());
    }

    @Test
    public void testBrieOnSellDateWithMaxQuality() {
        GildedRose item = new GildedRose("Aged Brie", 50, 0);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(-1, item.getDaysRemaining());
    }

    @Test
    public void testBrieAfterSellDate() {
        GildedRose item = new GildedRose("Aged Brie", 10, -1);
        item.tick();

        assertEquals(12, item.getQuality());
        assertEquals(-2, item.getDaysRemaining());
    }

    @Test
    public void testBrieAfterSellDateWithMaxQuality() {
        GildedRose item = new GildedRose("Aged Brie", 50, -1);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(-2, item.getDaysRemaining());
    }

    // ------------------------------------- sulfuras -----------------------------------------------------------------
    @Test
    public void testSulfurasBeforeSellDate() {
        GildedRose item = new GildedRose("Sulfuras, Hand of Ragnaros", 10, 5);
        item.tick();

        assertEquals(10, item.getQuality());
        assertEquals(5, item.getDaysRemaining());
    }

    @Test
    public void testSulfurasOnSellDate() {
        GildedRose item = new GildedRose("Sulfuras, Hand of Ragnaros", 10, 0);
        item.tick();

        assertEquals(10, item.getQuality());
        assertEquals(0, item.getDaysRemaining());
    }

    @Test
    public void testSulfurasAfterSellDate() {
        GildedRose item = new GildedRose("Sulfuras, Hand of Ragnaros", 10, -1);
        item.tick();

        assertEquals(10, item.getQuality());
        assertEquals(-1, item.getDaysRemaining());
    }

    // ------------------------------------- sulfuras -----------------------------------------------------------------
    @Test
    public void testBackStagePassLongBeforeSellDate() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 30);
        item.tick();

        assertEquals(11, item.getQuality());
        assertEquals(29, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateUpperBound() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 10);
        item.tick();

        assertEquals(12, item.getQuality());
        assertEquals(9, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateUpperBoundAtMaxQuality() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 50, 10);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(9, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateLowerBound() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 6);
        item.tick();

        assertEquals(12, item.getQuality());
        assertEquals(5, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassMediumCloseToSellDateLowerBoundAtMaxQuality() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 50, 6);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(5, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateUpperBound() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 5);
        item.tick();

        assertEquals(13, item.getQuality());
        assertEquals(4, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateUpperBoundAtMaxQuality() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 50, 5);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(4, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateLowerBound() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 1);
        item.tick();

        assertEquals(13, item.getQuality());
        assertEquals(0, item.getDaysRemaining());
    }

    @Test
    public void testBackstagePassVeryCloseToSellDateLowerBoundAtMaxQuality() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 50, 1);
        item.tick();

        assertEquals(50, item.getQuality());
        assertEquals(0, item.getDaysRemaining());
    }

    @Test
    public void testBackStagePassOnSellDate() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, 0);
        item.tick();

        assertEquals(0, item.getQuality());
        assertEquals(-1, item.getDaysRemaining());
    }

    @Test
    public void testBackStagePassAfterSellDate() {
        GildedRose item = new GildedRose("Backstage passes to a TAFKAL80ETC concert", 10, -1);
        item.tick();

        assertEquals(0, item.getQuality());
        assertEquals(-2, item.getDaysRemaining());
    }

    @Test
    @Ignore
    public void testConjuredItemBeforeSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemAtZeroQuality() {
    }

    @Test
    @Ignore
    public void testConjuredItemOnSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemOnSellDateAtZeroQuality() {
    }

    @Test
    @Ignore
    public void testConjuredItemAfterSellDate() {
    }

    @Test
    @Ignore
    public void testConjuredItemAfterSellDateAtZeroQuality() {
    }

}
