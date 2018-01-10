package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        double radius = radius();

        double dlinaOkruzhnostiValue = dlinaOkruzhnosti(radius);
        System.out.println("Длинна окружности: " + String.format("%(.2f", dlinaOkruzhnostiValue) + " мм");

        double ploschadKrugaValue = ploschadKruga(radius);
        System.out.println("Площадь круга: " + String.format("%(.2f", ploschadKrugaValue) + " мм");

    }
    public static double radius() throws IOException {
        System.out.println("Введите радиус в миллиметрах.");
        double r = reader();
        return r;
    }

    public static double reader() throws IOException {
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        double x = Double.parseDouble(s); // преобразовываем строку в число
        return x;
    }
    public static double dlinaOkruzhnosti(double r){
        double c = 2 * Math.PI * r;
        return c;
    }
    public static double ploschadKruga(double r){
        double s = Math.PI * Math.pow(r, 2);
        return s;
    }
}
