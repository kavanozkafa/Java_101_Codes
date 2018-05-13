public class Methods {
    public static void main (String args[]){

        /*
        * Metodun ismine ,dönüş tipine,return yapısına,aldığı parametrelere
        * ,parametrelerin tiplerine,metoda nasıl erişileceğine dikkat et.
        *
        * reserve edilen kelimelerle metod ismi oluşturulamaz.
        *
        * static yapıyla memory'den kazanç sağlarız .oluşturulan her nesne için static metodlar tekrar oluşmaz.
        * hepsi aynı metodu kullanır.
        * ve ayrıca static metodlara erişim nesne gerektirmez böylece nesne oluşturmadan kullanılacak
        * metodların kullanımı da avantaj sağlar.
        *
        * main metodu kodun çalıştırılan ilk yapıs olduğu için static olması elzem.
        * static bir metodun içinde static metodlara erişim mümkün.
        *
        * static olmayan bir metodu ancak nesne oluşturup nesneden erişim mümkün.
        */

        //direk fonksiyonu çağırma.
        calculate(3, (float) 4.12);

        //return değerini görmek için metod içinde metod çağırma.
        System.out.println(calculate(2, (float) 3.45));


    }
  static   public int calculate(int a,float b){

        System.out.println("merhaba");

        return (int) (a*b);
    }
}
