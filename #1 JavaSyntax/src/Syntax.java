public class Syntax {

    public static void main(String args[]) {

        System.out.println("Syntax");




        /*
        * Java dosyası ve class ismi aynı olmalı
        *
        * */


        /*
        * Burdaki kodda;
        *
        * Syntax    --> sınıf ismi
        * main      --> method ismi
        * String    --> öntanımlı sınıf ismi
        * args      --> dizi değişken ismi
        * static    --> objesiz çağrılabilir demek
        * public    --> methodu her yerde çağırıp çalıştırılması için
        * void      --> dönüş tipi "boş" yani return edeceği argüman yok.
        *
        *
        * System   --> öntanımlı kütüphane sınıfı
        * out      --> output stream değişkeni
        * .        --> dot operator olarak bilinir ve vlass üyelerine erişimi sağlar.
        * println  --> yazdırma işlemini sağlayan method.
        *"Syntax"  --> String Dizisi.
        *  ;       --> code ifadesinin bittiğini belirtme.
        * {        --> Kod bloğunun başladığını belirtme
        * }        --> Kod bloğunun bittiğini belirtme
        * */



        /*
        *
        * yazılan kodu console/terminal kullanarak çalıştırmak için aşağıdaki kodları kullanabilirsiniz.
        *   cd ile aynı dizine girip
        *
        *   compile:	javac Name.java
        *   execute:	java Name
        */




        // #1 Tek Satırlık Yorum Satırı

        /* #2
        * Birden
        * Fazla
        * Satırlık
        * Yorum
        * */


        /*  #3
        *   Aşağıdaki Kelimelere reserve edilmiş özel anahtar kelimelerdir.
        *   Bu Kelirmelerle constant veya variable ya da tanımlayıcı isim oluşturulamaz.
        *
        *   Java Keywords

            abstract 	assert 	boolean 	break
            byte 	case 	catch 	char
            class 	const 	continue 	default
            do 	double 	else 	enum
            extends 	final 	finally 	float
            for 	goto 	if 	implements
            import 	instanceof 	int 	interface
            long 	native 	new 	package
            private 	protected 	public 	return
            short 	static 	strictfp 	super
            switch 	synchronized 	this 	throw
            throws 	transient 	try 	void
            volatile 	while



            Reserved Literals

            true null false



            Variable veya Identifier kuralları

            -([A-Z],[a-z],[0-9]),$,_  kombinasyonlarından oluşmalı.

            - Sayı ile başlayamaz.

            -Java case-sensitive yani büyük-küçük harf duyarlı  Sammas ile sammas farklı yapılardır.

            -Karakter sınırı yok ancak kod okunabilirliği açısından 3-15 arası uzunlukta olması iyidir.

            -Space ile variable veya identifier oluşturulamaz. my array geçersiz my_array veya myArray vs gibi kullanım doğrudur.

            -İsimler   _ ve $ ile başlamamalı.

            -
        * */


    }
}