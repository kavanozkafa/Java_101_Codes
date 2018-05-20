public class StringBuilder {
    public static void main(String [] args){

        System.out.println("-----------append--------");
        //farklı tipteki verileri stringe eklemeye yarar.
        java.lang.StringBuilder sb = new java.lang.StringBuilder("a ");
        String s5 = sb.append("b").append(2).toString();
        System.out.println(s5);

        System.out.println("--------reverse-----------");
        //Stringi tersine çevirir.
        java.lang.StringBuilder bjk=new java.lang.StringBuilder("Beşiktaş");
        String bjk1=bjk.reverse().toString();
        System.out.println(bjk1);


        System.out.println("--------length-----------");
        //string uzunluğunu verir.
        System.out.println(sb.length());


        System.out.println("--------insert-----------");
        //Stringde istenilen indisten araya veri ekler.
        sb.insert(1,"sammas");
        System.out.println(sb);

        System.out.println("--------replace-----------");
        //istenilen indisler arası veri değiştirebiliriz.
        sb.replace(1,3,"Java");
        System.out.println(sb);

        System.out.println("--------delete-----------");
        //istenilen indisler arası veri silebiliriz.
        sb.delete(1,6);
        System.out.println(sb);


        System.out.println("--------capacity-----------");
        //Şu andaki Builder'ın kapasitesini döndürür.default 16.formül (oldcapacity*2)+2
        System.out.println(sb.capacity());


        System.out.println("--------ensureCapacity-----------");
        //Builder'ın kapasitesini istenilen sınıra getirir.
        // Sabit değerden küçükse bir şey yapmaz büyükse alanı büyültür.

        sb.ensureCapacity(10);//değişiklik olmaz
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);//alan büyür.
        System.out.println(sb.capacity());

    }

}

