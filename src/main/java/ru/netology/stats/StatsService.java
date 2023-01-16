package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long averageSales(long[] sales) {
        long result = sumSales(sales);
        return result / sales.length;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthLowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSales(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverage(long[] sales) {
        int result = 0;
        for (long sale : sales) {
            if (sale > averageSales(sales)) {
                result++;
            }
        }
        return result;
    }
}