package interviewQuestions10;

import java.util.ArrayList;
import java.util.Arrays;

public class Q06_AddedOrNotTask {
    public static void main(String[] args) {

        // create a list of numbers 1, 3, 1, 2, 4, 5, 3 --> 2 duplicates
        // count how many duplicates we have
        // find out what are the duplicated values

        // 1, 3, 1, 2, 4, 5, 3 sayılarının bir listesini oluşturun --> 2 kopya
        // kaç tane kopyamız olduğunu sayin
        // yinelenen değerlerin ne olduğunu öğrenin

        //1.Task
        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(1, 3, 1, 2, 4, 5, 3));
        ArrayList<Integer> yinelenen = new ArrayList<>(); // yinelenen sayilari atmak icin olusturulan bos list
        int sayac = 0; // yinelenen sayilar kac defa oldugunu gorebilmek icin olusturuldu
        for (int i = 0; i <sayilar.size() ; i++) { // Listteki 0. index alindi
            for (int j = i+1; j <sayilar.size() ; j++) { // Listteki 1. index ile karsilastirildi
                if (sayilar.get(i)==sayilar.get(j)){//eger 0. ile 1. index esit ise
                    sayac++;                        // sayac bir arttirildi
                    yinelenen.add(sayilar.get(i));  // ve tekrarlanan sayilar yinelenen liste eklendi
                }
            }
        }
        System.out.println("Yinelenen listteki sayilar ==>>> " +yinelenen+" = "+sayac +" adet...");






    }
}
