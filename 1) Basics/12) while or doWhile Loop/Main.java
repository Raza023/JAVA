

public class Main {
    public static void main(String[] args) 
    {
        int i=1;
        while(i<=10)
        {
            System.out.print(i+"\t");
            i++;
        }

        int fact = 4;
        int ans = 1;
        int ind = fact;
        while(ind>=1)
        {
            ans*=ind;
            ind--;
        }
        System.out.println("\nFactorial("+fact+") = "+ans);

        int j=1;
        do {
            System.out.print(j+"\t");
            j++;
        } while (j<=10);

        System.out.println();

        j=10;
        do {
            System.out.print(j+"\t");
            j--;
        } while (j>=1);
    }
}
