/*
* Java'da Veri Tipleri
*
* Byte  --> 8bit, min -128 ,max 127
* Byte integerdan 4 kat daha küçüktür.Bu yüzden dizilerde memory tasarrufu içinkullanılabilir
* byte money=50;
* byte credit = -80;
*
*
* Short --> 16bit,min -32768,max 32767
* integerdan 2 kat daha küçük
* short team=14000;
* short value=-30000;
*
* Integer --> 32bit,min (-2^32),max (2^31 -1) ,
* genelde integral değerler için kullanılan tamsayı veri tipi.
* int myClass=5;
* int myPhone=578965123;
*
* Long --> 64bit,min (-2^63),max (2^63-1)
* bu veri tipi çok büyük verileri kullanacağımız zaman ihtiyaç duyulur.
* long temp= -1458966552L
* long time= 1456L
*
*
* Float --> 32bit single-precision
* floating point numbers için kullanılır.yani ondalıklı sayılar için
* float gdp=120.456f;
*
* Double --> 64bit double-precision
* çok uzun ondalıklı sayılar için kullanılır.
* double func=123.457896d  sonuna d yazmasak da olur .ondalık sayılar default olarak double .
*
*
* Boolean --> 1bit,true or false
* Kontrol yapısı için kullanılır.(Flag)
* boolean graduation = true;
*
* Char --> 16bit ,Unicode Character, min '\u0000' , max '\uffff'
* Karakter depolamak için kullanılır.
*
* char myClass='C' karakterin kendisi
* char myChar =65 karakterin ascii değeri
* char heart = '\u2764';
*
*
* String ve Array'ler veri kümeleridir.Boyutları memory ile sınırlıdır.
* String'e char dizisi de diyebiliriz.
*
* String name="Şammas14578.45Çölkesen"
*
* Array =[4,87,2.54];
*
*
* int and Integer, boolean vs Boolean, char vs Character, short vs Short, long vs Long, float vs Float or double vs Double.
*
* Büyük harfle başlayanlar sınıf küçük harfle başlayanlar primitive data type.
*
*
*
 * */


public class DataTypes {

    public static void main(String args[]){

        int myint=12; //primitive ilkel value.Daha hızlı çünkü obje yok.
        Integer myInt=null; //i is an object of Integer Wrapper class and it contains a primitive int value 10
        //java.lang.Integer fonksiyonlarını kullanabilirsin.Integer sınıfıyla null değer ataması yapabilirsin.
        //HashMap key olarak kullanabilirsin.
        //Integer.MAX_VALUE;

        int b=45;
        Integer boxing =new Integer(b); // primitive tipi referans tipe dönüştürme.
        int unboxing = boxing.intValue(); // referans tipteki veriyi primitive değişkene atama.


        char heart = '\u2764';

        //Double.POSITIVE_INFINITY,NaN,Negative
        System.out.println(heart);
        System.out.println(myint);


    }
}
