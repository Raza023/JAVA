

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+"\t");
        }

        int fact = 4;
        int ans = 1;
        for (int i = fact; i >= 1; i--) {
            ans*=i;
        }
        System.out.println("\nFactorial("+fact+") = "+ans);
    }
}
