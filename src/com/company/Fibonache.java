package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonache {
    public static void main(String[] args)  {

        System.out.println("Введите количество чисел Фибоначе."); // ;lasgj ;dlafgkjd;flsgkj ;ldksfj g
        int n = 0;
        try {
            n = reader(); // n is number of numbers
        } catch (IOException e) {
            e.printStackTrace();
        }
        int sMinusOne = 0;
        int sMinusTwo = 1;
        int s;

        for (int i = 2; i < n; i++)
        {
            s = sMinusOne+ sMinusTwo;
            System.out.println(" "+ s);
            sMinusOne = sMinusTwo;
            sMinusTwo = s;
        }

//        int fibonacheValue = fibonache(n);
//        System.out.print("Ряд Фибоначе: " + fibonacheValue + ", ");

    }
    public static int reader() throws IOException {
        BufferedReader bufferedReader = new
                BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();
        int x = Integer.parseInt(s); // преобразовываем строку в число
        bufferedReader.close();
        return x;
    }
//    public static int fibonache(int f){
//        int lastValue = 0;
//        for (int i = 0; i <= f; i+=lastValue ) {
//            //
//            System.out.println("dfghjk");
//
//        }
//        return f;
//    }

}
