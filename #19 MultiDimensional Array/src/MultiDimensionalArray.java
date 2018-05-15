import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String [] args){

        // Çok Boyutlu diziler veya iç içe diziler Java'nın bize yapmayı mümkün kıldığı yapılardan biri.

        /*
        *  Matris yapılarından da hatırlayacağımız üzere 2 boyutlu dizilerde ilk rakam satır sayısını
        *  2. rakam ise sütun sayısını belirtiyordu. Yani A 2*3 matrisi 2 satırlık 3 sütunluk bir yapısı mevcuttur.
        *  bunu dizi şeklinde yazmak istersek şu formu alır --> A[2][3]
        *
        *  Eleman dağılımı ise aşağıdaki gibi olur.
        *
        *   A[1][1] A[1][2] A[1][3]
        *   A[2][1] A[2][2] A[2][3]
        /**7
        *
        *   Tabiki yazılımda her dizi 0 ile başlandığını bu sebeble 1-->0 olduğunu unutmalayalım.
        *
        *
        *   Genel kullanım A[i][j] i= row yani satır ; j=column yani sütun
        *
        *   A.length kullanımında dönecek olacak bilgi i'dir yani row sayısıdır.
        *   A[i].length ise j'yi yani i satırında kaç eleman olduğunu dönderir.
        * */

        int myArray [][] =new int[2][3]; // 2*3 lük array oluşturma
        myArray[0][0]=3;
        myArray[0][1]=5;
        myArray[0][2]=7;
        myArray[1][0]=9;
        myArray[1][1]=11;
        myArray[1][2]=13;


        // Çok Boyutlu dizilere iç içe diziler de denir demiştik burda bunun örneğini göüyoruz.
        int myArray2 [][] =new int[][]{{3,5,7},{9,11,13}};


        for (int i=0;i<myArray.length;i++){
            for (int j=0;j<myArray[i].length;j++){
                System.out.println(myArray[i][j]);
            }
        }

        System.out.println("*****************************");


        //Array'i random doldurma
        double myArray3 [][] =new double[2][3];
        for (int i=0;i<myArray3.length;i++){
            for (int j=0;j<myArray3[i].length;j++){
                myArray3[i][j]= Math.random();
            }
        }

        for (int i=0;i<myArray3.length;i++){
            for (int j=0;j<myArray3[i].length;j++){
                System.out.println(myArray3[i][j]);
            }
        }





        //2 boyutludan daha çok boyuta sahip dizi oluşturmak ise Aşağıdaki örnekler gibidir.
        // 4 boyutludan daha çok boyuta sahip array pek kullanılmıyor.
        // Ancak gene de mühendislik için bazı konularda lazım olabilir.
        int my3DArray[][][]=new int[3][3][3]; // 3*3*3 tipinde kübik bir dizi
        my3DArray[0][0][0]=111;

        int my4DArray[][][][]=new int[4][4][4][4]; // 4*4*4*4 tipinde 4 boyutlu bir dizi
        my4DArray[0][0][0][0]=1111;



    }
}
