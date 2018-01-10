package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Enija195 {

    public static void main(String[] args) throws IOException {
        int n = insertN();
        int a = insertA();
        int b = insertB();
        int s = raschetSulfita(n, a, b);
        System.out.println("Для обработки необходимо: " + s + " нанограмм сульфида.");


    }

    public static int insertN() throws IOException {
        System.out.println("Введите количество панелей:");
        int n = reader();
        return n;
    }

    public static int insertA() throws IOException {
        System.out.println("Введите высоту панели:");
        int a = reader();
        return a;
    }

    public static int insertB() throws IOException {
        System.out.println("Введите ширину панели:");
        int b = reader();
        return b;
    }

    public static int raschetSulfita(int n, int a, int b) throws IOException {
        int s = n*(2*(a*b));
        return s;
    }

    public static int reader() throws IOException {
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int x = Integer.parseInt(s); // преобразовываем строку в число
        return x;
    }

}