package ru.netology.stats;

public class StatsService {
    public double allSales(double[] sales) {
        double sum = 0;
        for (double s : sales) {
            sum = sum + s;
        }
        return sum;
    }

    public double averageSum(double[] sales) {
        double sum = allSales(sales);
        return sum / sales.length;
    }

    public int maxSales(double[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(double[] sales) {
        int minMonth = 0;
        int month = 0;
        for (double sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(double[] sales){
        int count = 0;
        double average = averageSum(sales);
        for (double s : sales){
            if(s < average){
                count++;
            }
        }
        return count;
    }

    public int aboveAverage(double[] sales) {
        int count = 0;
        double average = averageSum(sales);
        for (double s : sales) {
            if (s > average) {
                count++;
            }
        }
        return count;
    }



}
