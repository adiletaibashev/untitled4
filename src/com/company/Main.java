package com.company;

public class Main {

    public static void main(String[] args) {

        double[] n = {-2.2, -10.3, 13.32, 23.4, -1.3, 5.6, -0.2, 1.2, 0.1, 1.2, 5.8, 4.6, -8.2, 1.23, 12.3};
        double rez = 0;
        boolean a = false;
        int b = 0;
        for (double Double : n) {
            if (Double < 0) {
                a = true;
            } else if (Double > 0 && a) {
                rez += Double;
                b++;
                System.out.println("Среднее Арифметическое " + rez / b);
            }
        }
    }
}