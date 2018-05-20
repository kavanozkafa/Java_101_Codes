import java.util.Arrays;

/*
 * Bir string sabit kalacaksa String sınıfını kullan
 * Bir string değişebilir ve yalnızca tek thread tarafından erişilebilirse o zaman StringBuilder kullan
 * Bir string değişebilir ve birçok thread tarafından senkronize olarak erişilebilirse o zaman StringBuffer kullan
 * */

public class StringMethods {
    public static void main(String [] args){

        //String sınıfının metodları immutable metodlardır.Değiştirilemezler.
        // String sınıfı ile inheritence sınıfı oluşturulamaz.

        String myString="Şammas";
        String instance=new String("Şammas");//nonpool alanda yaratılır.

        System.out.println("---------Object to String------------");
        //Objeleri veya diğer veri tiplerini toString metodu ile string yapısına çevirebiliriz
        Integer intobj=34;
        System.out.println(intobj.toString());

        System.out.println("---------isEmpty------------");
        //stringin içeriğinin olup olmadığını kontrol etme
        System.out.println(myString.isEmpty());

        System.out.println("--------codePointAt-----------");
        System.out.println(myString.codePointAt(0));//ascii kod döndürür.


        System.out.println("--------length-----------");
        //String uzunluğu length metodu ile sağlanır.
        System.out.println("String'in uzunluğu : "+ myString.length());

        System.out.println("----------concat---------");
        //Stringleri birleştirmek için + operatorü kullanılır.
        System.out.println(myString+myString+"Çölkesen");

        //veya concat metodu kullanılır.
        String myString2=myString.concat(" Çölkesen");
        System.out.println(myString2.concat(" 68"));


        System.out.println("--------equals-----------");
        //Stringlerin karşılaştırılması equals ve equalsIgnoreCase metodları ile sağlanır.
        // equals büyük-küçük harf duyarlı ; equalsIgnoreCase değildir.Elde edilen değerler true-false dur.
        System.out.println(myString2.equals(myString));
        System.out.println(myString.equalsIgnoreCase("şammas"));

        System.out.println("---------compareTo----------");
        // Stringlerin A-Z sıralaması compareTo ve compareToIgnoreCase metodları ile sağlanır.
        // Bu metodlar stringlerin harf sırasını kontrol eder.
        // Karşılaştırlan değerlerde A en küçük Z en büyüktür.(Ascii tablosu ile ilgili)
        // Kontrol edilen string büyükse negatif değer döner değilse pozitif.Her iki string de eşitse 0 döner.
        String s1="limon";
        String s2="liman";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase("LİmOn"));

        System.out.println("--------regionMatches-----------");
        //String içinde String arama regionMatches metodu ile sağlanır.
        // İlk parametre nerden başlanacağı 2. parametre ne aranacağı ,
        // 3. parametre arancak değerin nerden başlanacağı,son parametre ise kaç karakter boyunca aranacağı değerleridir.
        //Boolean değer döndürür.
        String s3="ali veli deli";
        String s4="li";
        System.out.println(s3.regionMatches(0,s4,0,s3.length()));
        System.out.println(s3.regionMatches(4,"veli",2,s3.length()));

        System.out.println("---------contains------------");
        String name="what do you know about me";
        System.out.println(name.contains("do you know"));
        System.out.println(name.contains("about"));
        System.out.println(name.contains("hello"));


        System.out.println("---startsWith----endsWith------------");
        //Başlangıç kontrolü startsWith metodu ; bitiş kontrolü endsWith metodu ile sağlanır.
        // Boolean değer döndürürler.
        System.out.println(myString.endsWith("as"));
        System.out.println(myString.startsWith("Şa"));

        System.out.println("--------getChars-----------");
        //getChars metodu ile bir stringin belirli bir kısmını char dizisine atayabiliriz.
        char [] myCharArray=new char[10];
        myString.getChars(2,5,myCharArray,3);
        System.out.println(myCharArray);

        System.out.println("---------charAt----------");
        //charAt metodu ile stringden istenilen indisteki karektere ulaşılabilir.
        System.out.println(myString.charAt(2));

        System.out.println("--------String vs Array-----------");
        //Stringleri arraye arrayleri de stringe rahatlıkla çevirebiliriz.
        char myChar[]=new char[]{'k','a','l','e'};
        String charstring=new String(myChar);
        System.out.println(myChar);
        System.out.println(charstring);

        int length=myString.length();
        char myChar2[]=new char[length];
        myChar2=myString.toCharArray();
        System.out.println(myChar2);


        System.out.println("---------Index----------");
        //String içinde aranan karakterin indislerini bulabiliriz.
        // indexOf metodu aranan karakterin ilk bulunduğu indisi verir.
        // lastIndexOf metodu aranan karakterin son bulunduğu indisi verir.
        //Her iki metod da aranan karakteri bulamazsa negatif değer döndürür.
        System.out.println(myString.indexOf('ğ'));
        System.out.println(myString.lastIndexOf('m'));

        System.out.println("---------substring----------");
        //String içinde alt string alabiliriz.
        String sub=myString2.substring(4,8);
        System.out.println(sub);


        System.out.println("--------replace-----------");
        //Stringden istediğimiz karakterleri yenileriyle değiştirebilirz.
        myString2=myString.replace('Ş','S');
        System.out.println(myString2);


        System.out.println("---------Trim----------");
        //Trim metodu ile string sonu ve başı boşlukları silebiliriz.
        myString=myString+"               ";
        System.out.println(myString.length());
        myString=myString.trim();
        System.out.println(myString.length());


        System.out.println("-----toLowerCase------toUpperCase--------");
        //Stringimizi küçük veya büyük harfli haline çevirebiliriz.
        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());

        System.out.println("-------valueOf------------");
        //valueOf metodu ile veri tiplerinin değerlerini stringe çevirebiliriz.
        int a=4;
        s1=String.valueOf(a);
        System.out.println(s1);


        System.out.println("---------split----------");
        //split ile belirli bir karakterden itibaren string içeriğini string dizisi
        // elemanlarına dönüştürebiliriz.
        String str="talisca,larin,babel,fabri, pepe";
        String [] myStringArray=str.split(",");
        System.out.println(Arrays.toString(myStringArray));

        System.out.println("----------join---------");
        //join metodu ile string dizisi elamanları arasına değer ekleyebiliriz.
        String myStrin = String.join("/", myStringArray);
        System.out.println(myStrin);









    }
}
