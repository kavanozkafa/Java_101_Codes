public class ForLoop {
    public static void main (String args[]) {

        int i,j;
        for (i=5;i>0;i--){


            for (j=0;j<5;j++){

                if ((i*j)%2==0)
                    continue;
                System.out.println(i*j);
            }
        }
    }
}
