import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayMethods {
    public static void main(String [] args){

        //Java'da array yapıları referans tipte olduklarından belleğin heap kısmında tutulurlar.
        int myArray[]=new int[]{3,5,7,9,11};

        //array elemanlarını foreach döngüsü ile yazdırabiliriz.
        for (int i :myArray) {
            System.out.println(i);
            }
        System.out.println("-------------------------------------");


            //Farklı veri tiplerini tek arrayde tutmak için arrayimizi object tipinde oluşturmalıyız.
        Object myObjArray[]=new Object[3];
        myObjArray[0]="Mesud";
        myObjArray[1]=25;
        myObjArray[2]=1.83f;
        for (Object i : myObjArray) {
            System.out.println(i);
        }

        System.out.println("-------------------------------------");

        // Dizinin uzunluğuna length ile ulaşılır.
        // Dizinin boyutunu aşan işlemler gerçekleşirse ArrayOutOfBoundException hatası alınır.
        System.out.println("Dizinin uzunluğuna length ile ulaşılır." +myArray.length);

        //Dizi Kopyalama
        //Kopyalanacak dizinin boyutu hedef dizinin boyutunu aşmamalı.
        System.out.println("--------------Copy Array-----------------------");
        int myCopyArray[]=new int[4];
        //System.arraycopy(Kaynak dizi ,Kayanak dizi başlangıç indisi ,Hedef dizi,Hedef dizi başlangıç indisi  ,Kaç eleman kopyalanacak);
         System.arraycopy(myArray,0,myCopyArray,0,3);
         //4. eleman boş kalacağı için oraya null değerini atar.


        for (Object i : myCopyArray) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        // Aynı şekilde Arrays.copyOf ve Arrays.copyOfRanfe metodlarıyla da kopyalama işlemlerini gerçekleştirebiliriz.

        myCopyArray=Arrays.copyOf(myArray,2);
        for (Object i : myCopyArray) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------");
        myCopyArray=Arrays.copyOfRange(myArray,1,2);
        for (Object i : myCopyArray) {
            System.out.println(i);
        }

        System.out.println("-------------Sorted Array------------------------");

        //Dizi elemanlarını sıralama
        //Aralık girerek dizinin belirli bir bölümünün de sıralamasını gerçekleştirebiliriz.

        Arrays.sort(myCopyArray);
        for (Object i : myCopyArray) {
            System.out.println(i);
        }

        System.out.println("--------------Searched Array-----------------------");

        int value=Arrays.binarySearch(myArray,7);
        //Burdaki value değeri aranan veri bulunmuşsa pozitif bulunamamışsa negatif olarak karşımıza çıkar.
        //bu value değeriyle if yapısı kullanılıp ona göre işlem yapılmalı.
        System.out.println(value);

        System.out.println("-----------------Compared Array------------------");
        //Karşılaştırılacak dizilerin aynı veri tipinde olması gerekli.
        // Diziler eşitse true değilse false döndürür.
        // Dizilerin eşit olması için eleman sayılarının ve elemanlarının aynı olması gerekektedir.

        System.out.println(Arrays.equals(myArray,myCopyArray));

        System.out.println("-------------Copy Array as a List----------------------");
        //Array yapısındaki verilerimizi Liste yapısına çevirebiliriliz.
        // Listeler farklı türde verileri içerebilir.
		//Bu metodda array olarak tek türde bir yapıya sahip array girerseniz size size dönderir.

        List myList;
        myList=Arrays.asList(myObjArray);
        System.out.println(myList);

        System.out.println("--------------Filled Dizi---------------------");
        //Dizilere istediğimiz yerine veri ile doldurabiliriz.

        int myFilledArray[]=new int[6];
        System.out.println(Arrays.toString(myFilledArray));
        Arrays.fill(myFilledArray,1,4,68);
        System.out.println(Arrays.toString(myFilledArray));



    }
}
