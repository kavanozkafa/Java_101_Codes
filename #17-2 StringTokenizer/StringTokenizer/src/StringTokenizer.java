public class StringTokenizer {
    public static void main(String [] args){
        System.out.println("-----------String Tokenizer----------");
        //String Tokenizer sınıfı bir stringi belirli bir ifadeye göre parçalar.
        // Her parçaya da "token" denir.
        String mars="sevemez;kimse;seni;benim;sevdiğim;kadar";
        java.util.StringTokenizer st1=new java.util.StringTokenizer(mars,";");// delim kısmı periyodu pelirleyen ifade default olarak space yani boşluktur.

        System.out.println(st1.countTokens());//token sayısıları elde edilir.
        while (st1.hasMoreTokens()){
            //Stringin tamamı parçalanana kadar devam etmek için while içinde hasMoreTokens metodu kullanıldı.
            System.out.println(st1.nextToken());
        }

        //noktalama işaretleinin sırasından ve ardı ardına gelebilcek durumlardaki hatalardan kaçınmak için token yerine element kullanılmalıdı.

        String path="C:\\windows\\sammas";
        java.util.StringTokenizer st2=new java.util.StringTokenizer(path,":\\");
        //path stringinde parçalanacak yerlerin ifadeleri farklı ve biz bunu sırasına göre yapmak istiyoruz.
        //işte bu durumda element yapısını kullanmalıyız.
        System.out.println(st2.countTokens());
        while (st2.hasMoreElements()){
            System.out.println(st2.nextElement());//gerekirse string tipine cast et.
        }

    }
}
