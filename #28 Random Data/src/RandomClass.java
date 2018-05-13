import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomClass {
    public static void main(String[] args){


        //Java bize Random isimli bir package sunuyor.
        // Bu objelerle rastgele olarak numeric veri üretebiliriz.

        Random rand=new Random();
        //rastgele variable değeri atama
        int randInt=rand.nextInt();
        float randFloat=rand.nextFloat();
        System.out.println(randInt);
        System.out.println(randFloat);
        System.out.println("**********************");

        //rastgele dizi oluşturma
        byte [] arrayByte=new byte[10];
        rand.nextBytes(arrayByte);
        System.out.println(Arrays.toString(arrayByte));
        System.out.println("**********************");

        //üst sınır belirli bir aralıkta sayıları seçtirme . 0-100
        int randomrange=rand.nextInt(100);
        System.out.println(randomrange);
        System.out.println("**********************");
        //belirli bir aralıkta sayıları seçtirme . 4-34
        // Burada veri tipinin sınırı unutulmamalı
        int randomrangeInt= ThreadLocalRandom.current().nextInt(4,34);
        System.out.println(randomrangeInt);
        System.out.println("**********************");


        //key generate işlemleri gibi güvenlik düzeyi yüksek random veriler için yukardaki yöntemler kullanılmaz.
        //yukardaki Random ve ThreadLocalRandom lineer generator kullanılır.

        //Cryptographic yani şifreli veriler için security alanından SecureRandom sınıfı kullanılır.
        //SecureRandom rastgele bit dağıtır.
        // Random sınıfı 248 periyoda sahipken SecureRandom 2160 periyoda sahip
        System.out.println("********** Cryptographic ************");
        SecureRandom rng = new SecureRandom();
        byte[] randomBytes = new byte[64];
        rng.nextBytes(randomBytes);
        System.out.println(Arrays.toString(randomBytes));
        System.out.println("**********************");
    }
}
