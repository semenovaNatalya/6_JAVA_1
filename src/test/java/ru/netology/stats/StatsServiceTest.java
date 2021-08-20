package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {

    @Test
    void minSales() {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =9;

        long actual = service.minSales(sales);

        assertEquals(expected, actual);


    }

    @Test
    void maxSales() {
        StatsService service = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected =8;

        long actual = service.maxSales(sales);

        assertEquals(expected, actual);


    }
}