import java.util.Scanner;

public class SwitchCase {
    public static void main (String args[]) {

        Scanner input=new Scanner(System.in);
        String arac=input.nextLine();
        input.close();

        switch (arac){
            case "taksi":
                System.out.println("taksi hazır.");
                break;
            case "kamyon":
                System.out.println("kamyon hazır.");
                break;
            case "greyder":
                System.out.println("greyder hazır.");
                break;
            case "tır":
                System.out.println("tır hazır.");
                break;
            case "motorsiklet":
                System.out.println("motorsiklet hazır.");
                break;

            default:
                System.out.println("bisiklet hazır.");



        }


        }
}
