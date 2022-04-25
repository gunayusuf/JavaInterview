package interviewQuestions10;

import java.util.*;

public class Q07_ConvertingCollectionsTask {
    public static void main(String[] args) {

        // create an array of random numbers of size 10
        // convert that array into a list
        // convert list into set

        // 10 boyutunda rasgele sayılardan oluşan bir array oluştur
        // bu arrayi bir listeye dönüştür
        // listeyi sete çevir

        Random rnd = new Random();
        List<Integer> list=new ArrayList<>();//Rastgele olusturulan arraydeki sayilari atmak icin bir bos list olusturdum
        int arr[]=new int[10];//10 elemanli bir array olusturuldu
        for (int each:arr
             ) {
            each+=rnd.nextInt(100);//0-100 arasi rastgele 10 elementten olusan sayilar alindi
            System.out.print(each+" ");
            list.add(each);// Ve liste atildi
        }
        System.out.println();
        System.out.println("Array'in list hali = "+list);//List yazdirildi

        Set<Integer> set = new HashSet<>(list); // List Set'e cevrildi
        System.out.println("Listin set hali = "+set);




    }
}
