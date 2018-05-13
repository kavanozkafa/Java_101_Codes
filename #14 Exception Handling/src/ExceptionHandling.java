import java.util.Scanner;

public class ExceptionHandling {
    public void metod()throws Exception{
        int a=3;
        int b=0;
        int c=0;

           c=a/b;

           System.err.println("a'nın b'ye bölümü yok");

    }

    public void metodcagir(){
        System.err.println("burası metod'u çağırdı");
        try {
            metod();
        }
        catch (Exception e){
            System.out.println(e.toString());
        }

    }
    public static void main (String args[])

    {

        Scanner input=new Scanner(System.in);
        String sinput =input.nextLine();

        /*try-catch yapısı kodumuzda istenmeyen durumlardan haberdar olmak ve bu durumlarda ne yapılacaığını
        belirlemek için kullanırız.

        try blogu sınanacak yani hata olması muhtemel kodu içerir.
        cath yapısıysa eger hata ile karşılaşılırsa ne yapılması gerektiğini belirten kodları.
        catch kısmındaki özel isimlerle hatanın ne olduğunu mesaj olarak çıkartabiliriz.
        Birçok catch kullanılması durumunda ilk hangisine düşerse gerisini göz ardı eder.

        finally ise her halükarda yapılması istenilen kodları içerir.

        throw ile de kodun bir bölümünde veya
        başka sınıflarda oluşturulan bir exception daha sonra farklı bir yerde kullanılabilir.


        throws ile hata vermesi muhtemel metodlarda exception'ları kontrol edebiliriz.
        bu kısmı çalıştırmak için // xxx kısmı arasındaki yeri sil.

        * */
// xxx
        try {
            int age = Integer.parseInt(sinput);
            if (age >= 18) {
                System.out.println("oy kullanabilirsin");
            } else {
                System.out.println("daha oy kullanamazsın");
            }
        } catch (NumberFormatException ex1) {
            System.err.println("geçersiz veri. '" + sinput + "' integer değil");
        }
        catch (Exception ex2) {
            System.err.println("ikinci exception ");
        }
        finally {
            System.out.println("her halükarda çalışacak burası");
        }
        throw new NumberFormatException("lütfen sayı giriniz.");

// xxx

        ExceptionHandling eh= new ExceptionHandling();
        eh.metodcagir();
        System.out.println("metodcagir çağrıldı.");


    }

}
