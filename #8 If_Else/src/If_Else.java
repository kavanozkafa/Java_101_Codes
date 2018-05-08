import java.util.Scanner;

public class If_Else {

    public static void main (String args[]) {

        Scanner secim=new Scanner(System.in);
        int sec=secim.nextInt();
        secim.close();

        if (sec<40){
            System.out.println(sec*2);
        }
        else if (sec>60){
            System.out.println(sec/2);
        }
        else {
            System.out.println(sec);
        }
        }
    }
