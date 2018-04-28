 /*
  * Variable veri tutar.Türkçeye Değişken olarak çevrilebilir.
  * Değişken denmesinin sebebi Variable farklı satırlarda farklı verileri içerebilir.
  * Memoryde tutulan verilerinin erişilmesi için Variable kullanılır.Varible ile yapılan tüm işlemler memory i etkiler.
  * Local,Instance ve Static olmak üzere 3 tip Variable mevcuttur.
  *
  * Local Variable
  * Bir methodun içinde tanımlanmış variable.Method sonunda yok edilir.
  *
  * Instance Variable
  * Sınıf içinde ancak method dışında tanımlanmış variable.
  * Yeni bir obje yaratıldığında oluşup obje yok edildiğinde silinirler.
  *
  * Static Variable
  * Static olarak tanımlanmış variable.
  *
  *
  * Variable Tanımlama yöntemi
  * Erişim_yapısı Veri_Tipi Variable_İsmi
  *  private int age
  *  Erişim_yapısı = private,public,protected,static
  *  Veri_Tipi= int,float,String vs
  *
  *
  *
  *  Variable isimleri Türkçe karakter içermemeli
  *  İsimlerde space kullanılmaz. a-z,A-Z, 0-9 ve _ ,$ kullanılır.
  *
  *  Java case-sensetive olduğu için myarray ile Myarray farklı variable lardır.
  *
  *
  *  final ile sabit tanımlanır ve o variable ilk değer ataması alır.Artık değiştirilemez.
  * */



public class Variables {


    static int myClass=5; //Instance Variable

// public static final datatype variable = x ; şeklinde kullanılır.
static  int height =178;  //static Variable

    public static void main(String args[]){

        //Burda tanımlanan tüm değişkenler local değişken
       String name ="Şammas";
        String surname ="Çölkesen";

        int age=24;
       // Integer height =178;

        char myclass='A';
        float myGDP = 85.145f;
        boolean graduation = true;

        //static method içinde intance variable a erişmek için obje yarattık.
       Variables obj =new Variables();


        System.out.println("My name is " + name + " " +surname +" and I am "
                + age + " years old. My height is " + height + " cm " +"My class is " + obj.myClass);





        //boolean variable'lar kontrol için kullanılır.
        if (graduation){
            System.out.println(myclass + "\n" + myGDP + "\n" + graduation);
        }




    }



}
