package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int totalSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;

        }
        int mediumSum = sum / sales.length;
        return mediumSum;
    }

    public int monthAboveAverageSum(long[] sales) {
        int numberOfMonths1 = 0;

        for (long sale : sales) {
            if (sale > 15) {
                numberOfMonths1 = numberOfMonths1 + 1;
            } else numberOfMonths1 = numberOfMonths1;
        }
        return numberOfMonths1;
    }

    public int monthBelowAverageSum(long[] sales) {
        int numberOfMonths = 0;

        for (long sale : sales) {
            if (sale < 15) {
                numberOfMonths = numberOfMonths + 1;
            } else numberOfMonths = numberOfMonths;
        }
        return numberOfMonths;
    }
}


