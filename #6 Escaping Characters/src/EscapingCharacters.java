import java.awt.*;

public class EscapingCharacters {

    public static void main (String args []){

/*
        EscapingCharacters
\t 	Insert a tab in the text
\b 	Insert a backspace in the text
\n 	Insert a newline in the text
\r 	Insert a carriage return in the text
\f 	Insert a formfeed in the text
\' 	Insert a single quote
\" 	Insert a double quote
\\ 	Insert a backslash
*/

        System.out.println("kelimeler \t arası \t tab \tile\t boşluk\t bırakıldı.");
        System.out.println("yazdığım\b kelimelerin bazı\bları ek\bsik olabil\bir.");
        System.out.println("her \n kelime \n yeni\n satırda \nolacak");
        System.out.println("\"özlü söz\"");
        System.out.println("\'alıntı\'");
        System.out.println("\\ backslash");
        System.out.println("\f şiir\f");
        System.out.println("return\rghh");



        //Literals

        // okunabilirlik için _
        int i=938_654;
        System.out.println(i);

        //hex,binary,octal ve decimal
        int dec=14;
        int binary=0b00001110;//0b ile başlar 8bit ile temsil edilir.
        int octal=016;//0 ile başlar 4 hane ile temsil edilir.
        int hex=0xE;//0x ile başlar

        System.out.println(dec);
        System.out.println(binary);
        System.out.println(octal);
        System.out.println(hex);
    }
}

