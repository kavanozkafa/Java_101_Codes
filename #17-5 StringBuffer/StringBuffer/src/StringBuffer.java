public class StringBuffer {
    public static void main(String [] args){

        //StringBuffer sınıfı bize modifiye edilebilir stringler oluşturmamıza imkan verir.
        // Bildiğiniz üzere String sınıfı değiştirelemez.
        //StringBuffer sınıfı concat işleminde String 'e göre daha az memory tüketir.


        StringBuffer sb=new StringBuffer();

        /* Sahip olduğu metodlar aşağıdaki gibidir.Bunlar StringBuilder sınıfındaki kullanımlarıyla aynıdır.
        Ancak StringBuilder daha hızlı çalışacaktır.

         ensureCapacity( )
         replace( )
         delete( )
         insert( )
         append( )
         length( )
         capacity( )

         */


        /*
        * Bir string sabit kalacaksa String sınıfını kullan
        * Bir string değişebilir ve yalnızca tek thread tarafından erişilebilirse o zaman StringBuilder kullan
        * Bir string değişebilir ve birçok thread tarafından senkronize olarak erişilebilirse o zaman StringBuffer kullan
        * */



    }
}
