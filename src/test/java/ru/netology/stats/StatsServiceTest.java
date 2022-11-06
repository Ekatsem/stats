package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shoudCalculateSum(){
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expacted = 180;
        double actual = service.allSales(sales);

        Assertions.assertEquals(expacted, actual);
    }

    @Test
    public void shoudCalculatAveregeSum(){
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        double expacted = 15;
        double actual = service.averageSum(sales);

        Assertions.assertEquals(expacted, actual);

    }

    @Test
    public void shouldFindMonthWithMaxSales(){
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expacted = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expacted, actual);

    }

    @Test
    public void shouldFindMonthWithMinSales() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expacted = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expacted, actual);
    }

    @Test
    public void shouldCountMonthWhenSalesBelowAverage() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expacted = 5;
        int actual = service.belowAverage(sales);

        Assertions.assertEquals(expacted, actual);
    }

    @Test
    public void shouldCountMonthWhenSalesAboveAverage() {
        StatsService service = new StatsService();

        double[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expacted = 5;
        int actual = service.aboveAverage(sales);

        Assertions.assertEquals(expacted, actual);
    }

}
