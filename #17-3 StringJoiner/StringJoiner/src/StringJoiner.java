public class StringJoiner {
    public static void main(String [] args){
        //StringJoiner sınıfı string nesnelerini manipüle eden bir sınıftır.
        // Adından da analaşılacağı gibi string ekleyen bir sınıftır.5 metodu vardır.
        //  java.util.StringJoiner bu şekilde tanımlamamın sebebi sınıf isminden kaynaklı
        //sınıf ismini package (reserve )olmayan bir kelime seçin.


        System.out.println("----------add---------");
        //string yapısına istenen formatta veri ekler.
        java.util.StringJoiner sj=new java.util.StringJoiner(",","[", "]");
        sj.add("bjk");
        System.out.println(sj);
        System.out.println("----");
        sj.add("gs");
        sj.add("fb");
        System.out.println(sj);

        System.out.println("-------toString------------");
        //objeleri , değişkenleri veya dizileri stringe dönüştürür.
        Integer i1=23;
        System.out.println(i1.toString());

        System.out.println("--------length-----------");
        //Stringin boyutunu döndürür.
        System.out.println(sj.length());

        System.out.println("----------merge---------");
        //Stringleri birleştirir.
        java.util.StringJoiner sj2=new java.util.StringJoiner(",","[", "]");
        sj.add("ts");
        sj.add("gb");
        sj.add("bs");
        sj.merge(sj2);
        System.out.println(sj);

        System.out.println("-------setEmptyValue------------");
        //String değerini istenilen bir değerle default değer atar.
        java.util.StringJoiner sj3 = new java.util.StringJoiner(",");
        sj3.setEmptyValue("bomboş");
        System.out.println(sj3);



    }
}
