import java.util.Scanner;


public class Arrays {
    public static void main (String args[]){

        //her array'in bir tipi olmak zorunda.
        // array [] ile oluşturulur. içine sayı ile sınır da belirtilebilir.
        // boş bırakılıp dinamik de kurulabilir.
        // Dizideki tüm elemanlar aynı veri tipinde olmalı.
        // array elemanlarının indisleri 0 ile n-1 arasındadır.
        // 0 ilk elemanın indisidir.array elemanlarına array[indis] ile ulaşılır.
        // array yapılarının bir çok metodu mevcut.sort,tostring,lentgh vs vs

        //3 elemanlık String tipinde array1 isimli dizi oluşturuldu.
        String [] array1=new String[3];
        Scanner input=new Scanner(System.in);
        int i=0;
        //Scanner ile kullanıcıdan alına veriler array1 dizinin elemanlarına atanıyor.
        while (array1.length>i){
            array1[i]=input.next();
            i++;
        }

        //4 elemanlık statik elemanlara sahip int tipinde array2 isimli dizi oluşturuldu.
        int [] array2={2,1,3};

        //float tipinde bir başka dizi oluşturma yöntemi
        float [] array3=new float[3];
        array3[0]= 2.13f;
        array3[1]= 9.01f;
        array3[2]= 3.14f;



        //Double tipinde bir başka dizi oluşturma yöntemi
        Double d1= 3.13;
        Double d2=3.23;
        Double d3=4.35;

        Double [] array4=new Double[]{d1,d2,d3};

        //Object tipinde dizi oluşturulması
        Object[] array5 = new Object[] { new Object(), "string object", 3};

        //tek boyutlu dizilerin yazdırılması
        for (int j=0;j<3;j++){
            System.out.println("String  "+j + " : "+ array1[j]);
            System.out.println("Integer  " +j + ": "+ array2[j]);
            System.out.println("Float  " +j + " :"+array3[j]);
            System.out.println("Double  " +j + ": "+array4[j]);
            System.out.println("Obje  " +j + ": "+array5[j]);
        }



        //Diziyi Array alanının toString metodu ile yazdırma.
        System.out.println(java.util.Arrays.toString(array2));

        //Diziyi sırlayıp yazdırma.Array alanının sort metodu kullanıldı.
        java.util.Arrays.sort(array3);
        System.out.println(java.util.Arrays.toString(array3));



    }


}
