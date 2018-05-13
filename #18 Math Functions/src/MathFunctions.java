public class MathFunctions {
    public static void main(String [] args){
        int a;
        int b;
        double c;
        double d;
        double e;
        int f;
        double g;
        double h;

        a=13;
        b=25;


        c= (int) Math.pow(a,b);
        d=Math.round((b/a));
        e=  Math.random();
        f=Math.abs(a-b);
        g= (int) Math.floor(5.567f);
        h= (int) Math.ceil(5.567f);
        c= (int) Math.sqrt(36);
        d=Math.max(a,b);
        f=Math.min(a,b);
        g= (int) Math.toDegrees(56);
        h= (int) Math.toRadians(5);
        c=  Math.sin(45);
        c= (int) Math.cos(60);
        d=Math.PI;
        h=Math.E;
        g=Math.log10(100);


        //cast işlemlerini Math metodlarının double tipinde veri kabul ettiği için yaptık.
    }
}
