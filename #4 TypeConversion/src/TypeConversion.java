public class TypeConversion {

    public  static void main(String args[]){


        //1-Çevrilecek tür bit olarak daha büyükse

        byte byteVar=42;
        int intVar=byteVar;
        float floatVar=intVar;

        //2-Çevrilecek tür bit olarak daha küçükse
        //burda veri kaybı olabilir.
        double dVar=42.54D;
        float fVar=(float)dVar;
        int iVar=(int)fVar;
        byte bVar=(byte)iVar;

        //3-obje türleri birbirine dönüşmüyor.BU yüzden buffer nitelği gören Number sınıfı kullanılır.
        Float Fvar=48.5f;
        Number n=Fvar;
        Double Dvar=(Double) n;
        //int iiv=(int) Fvar;


        //4-Numeric yükselme
        char ch1=65,ch2=20;
        int int1= ch1+ch2;
        float f1=int1+ch1;
        //char ch3=int1-ch2;  //bu işlem gerçekleşmez.int char 'a dönüşemez bu şekilde.
        int int2= (int) '?';

        //5- String'e dönüştürme.objelerde işe yarar.primitive veri tipleri olmaz
        String str=Fvar.toString();
        //String str=int1.toString(); bu olmaz.

        //primitive veriler için
        int i=10;
        String stri=String.valueOf(i);


        //6- String'den dönüştürme.Kullanıcıdan alına veriler string tipindedir.
        // Bir string'in çevrilip çevrilemeyeceğini test etmek için try-catch (NumberFormatException) yapısı kullanılabilir.

        String number="68.24";
        int inum=Integer.parseInt(number);
        float fnum=Float.parseFloat(number);
        double dnum=Double.parseDouble(number);

        String booleanstr="false";
        boolean bstr=Boolean.parseBoolean(booleanstr);



    }
}
