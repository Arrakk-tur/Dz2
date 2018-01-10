package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class DvaBandita33 {
    public static void main(String[] args) throws IOException {
        final int min = 2;
        final int max = 10;
        final int vsegoBanok = rnd(min, max);
        System.out.println("Всего было банок: " + vsegoBanok);
        int garry = garry();
        int larry = larry();

        int ostGarry = ostatok(vsegoBanok, garry);
        System.out.println("Гарри не отсрелял " + ostGarry + " банок.");


        int ostLarry = ostatok(vsegoBanok, larry);
        System.out.println("Ларри не отсрелял " + ostLarry + " банок.");
           }

    public static int garry() throws IOException {
        System.out.println("Сколько банок отсрелял Гарри:");
        int n = reader();
        return n;
    }

    public static int larry() throws IOException {
        System.out.println("Сколько банок отсрелял Ларри:");
        int n = reader();
        return n;
    }
    public static int ostatok(int a, int b) {
        int n = a - b;
        return n;
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

    public static int reader() throws IOException {
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int x = Integer.parseInt(s); // преобразовываем строку в число
        return x;
    }

}
