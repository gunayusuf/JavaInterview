package interviewQuestions10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Q01_SetTask {
    public static void main(String[] args) {

        //  PART 1
        // create a method that accepts ArrayList<Integer> and Set<Integer> as parameters
        // and add all elements from ArrayList to Set

        // ArrayList<Integer> ve Set<Integer> öğelerini parametre olarak kabul eden bir yöntem oluşturun
        // ve tüm öğeleri ArrayList'ten Set'e ekleyin

        // PART 2
        // create a method that takes Set<Character> and varargs of char as parameters
        // and adds all chars to the set

        // Set<Character> ve char değişkenlerini parametre olarak alan bir yöntem oluşturun
        // ve tüm karakterleri sete ekleyin


        ArrayList<Integer> arrList=new ArrayList<>();
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(10);
        arrList.add(20);
        arrList.add(50);
        System.out.println("arrList = " + arrList); //arrList = [10, 20, 30, 10, 20, 50]

        Set<Integer> set=new HashSet<>();
        System.out.println("set = " + set);

        arrayListdenSeteDonustur(arrList,set);

        System.out.println("arrList'i sete ekledikten sonra :" + set);

        //Part2

        Set<Character> charset=new HashSet<>();
        karakterleriSeteEkle(charset,'A','B','R','r','q' );
        System.out.println("Charlar set'e eklendikten sonra :" + charset);



    }

    private static void karakterleriSeteEkle(Set<Character> charset,Character...chars) {
        for (int i = 0; i <chars.length ; i++) {
            charset.add(chars[i]);
        }

    }

    private static void arrayListdenSeteDonustur(ArrayList<Integer> arrList, Set<Integer> set) {
        for (Integer sayi: arrList){
            set.add(sayi);
        }
    }
}
