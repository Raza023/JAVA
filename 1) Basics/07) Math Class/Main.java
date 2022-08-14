

public class Main {
    public static void main(String[] args) {
        int x=10;
        int y=20;

        System.out.println("x="+x);
        System.out.println("y="+y);

        int maxi = Math.max(x, y);
        System.out.println("Math.max(x,y) = "+maxi);
        
        int mini = Math.min(x, y);
        System.out.println("Math.min(x,y) = "+mini);

        int a=-12;
        System.out.println("\na="+a);
        int absolute = Math.abs(a);
        System.out.println("Math.abs(a)="+absolute);

        int b=12;
        System.out.println("\nb="+b);
        int absolute2 = Math.abs(b);
        System.out.println("Math.abs(b)="+absolute2);

        int c=27;
        System.out.println("\nc="+c);
        double squareRoot = Math.sqrt(c);           //always returns double.  (only for +ve numbers)
        System.out.println("Math.sqrt(c)="+squareRoot);

        double d=3.14;
        System.out.println("\nd="+d);
        double lowerRound = Math.round(d);           //always returns double.
        System.out.println("Math.round(d)="+lowerRound);

        double e =3.59;
        System.out.println("\ne="+e);
        double upperRound = Math.round(e);           //always returns double.
        System.out.println("Math.round(e)="+upperRound);

        double f =3.59;
        System.out.println("\nf="+f);
        double ceil = Math.ceil(f);           //always returns double.
        System.out.println("Math.ceil(f)="+ceil);

        double g =3.59;
        System.out.println("\ng="+g);
        double floor = Math.floor(g);           //always returns double.
        System.out.println("Math.floor(g)="+floor);

        double base=3;
        double altitude=4;
        double hypotenous;
        System.out.println("\nBase: "+base);
        System.out.println("Altitude: "+altitude);

        hypotenous = Math.sqrt((base*base)+(altitude*altitude));
        System.out.println("Hypotenous: "+hypotenous);
    }
}
