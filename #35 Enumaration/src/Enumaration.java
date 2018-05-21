public class Enumaration {
    /*
     * Enumaration'lar bünyesinde sabit barındıran bir gruptur.
     * java.lang.Enum  sınıfına aittir.
     * Kendilerine ait constructor metodu barındırırlar.
     * enum  kelimesiyle beraber oluşturulurlar.
     * Ve oluşturulan bu veriler enum tipindedir.yani kendi veri tipine sahiptir.
     * Lokal olarak oluşturulamazlar.
     * Enum'lar bir sınıftan türetilemezler.
     * Enum elemanlarının da birer indisi mevcuttur.
     *
     * Enumların en çok kullanılan alanları ; switch-case ve if-else yapılarıdır.
     *
     */

    enum Teams{
        //enum elemanları ve ilk değerleri
        //enum elemanları da constant değer olduğundan büyük harflerle tanımlamak daha uygun.
        BJK(15,"SIYAH-BEYAZ"),GS(21,"SARI-KIRMIZI"),FB(19,"SARI-LACIVERT");



        public  int champs;
        public String colors;

        Teams(int champs,String colors){ //enum constructor public olamaz.
            this.champs=champs;
            this.colors=colors;
        }

       static void Leauge(){ //enum içerisinde metod oluşturma
            System.out.println(BJK.colors);
        }
    }
    public static void main(String [] args){

        Teams.BJK.champs=10;//enum değerlerini main metodu içerisinde manipüle edebiliriz.
       System.out.println(Teams.BJK.champs);

       //enum elemanlarını yazdırmanın en güzel yolu foreach döngüsüdür.
        for (Teams t:Teams.values()) {
            //name enum elemanının ismini ordinal ise indisini döndürür.
            System.out.println(t.name()+" - "+t.champs +" - " + t.colors+" - " +t.ordinal());

        }

        System.out.println(Teams.valueOf("BJK").colors);//valueof metodu ile de sabit objeyi döndürür.
        Teams.Leauge();//enum metodu çağırma

        //enum elemanını başka bir değişkene atama işlemi
        Teams tr=Teams.BJK;
        System.out.println(tr);//toString metodu sadece elemanın ismini dönderir.
    }
}
