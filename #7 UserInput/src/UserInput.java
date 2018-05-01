import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;//input library

public class UserInput {

    public static void main(String args[]){
        //Scanner sınıfından yeni bir nesne yaratılıp System.in alanından veri atıyooruz.
        Scanner username=new Scanner(System.in);
        System.out.println("hello " +username.nextLine());
        //username.  burdan fonksiyon seçilerek input kontrol edilebilir.
        //yeni bir string veri oluşturup username.matches("") ile tırnak aradaki ifadeyi görünce okumayı kesebiliriz..


        Scanner  fileread= null;
        try {
            fileread = new Scanner(new File("C:\\Users\\sammas\\IdeaProjects\\UserInput\\src\\javafile.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(fileread.nextLine());

        username.close();//input almayı kapatma güvenlik için önemli



        //GUI ile kullanıcı verisi alma
        String mesaj= JOptionPane.showInputDialog("mesajı girin");//buraya girilen her değer string tipindedir.

        System.out.println(mesaj);

        int sayi=Integer.parseInt(mesaj);
        System.out.println(sayi*4);
        JOptionPane.showMessageDialog(null,"İşlem Tamam","MesajBaşlığı",JOptionPane.OK_OPTION);

    }
}
