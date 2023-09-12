import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner alici = new Scanner(System.in);
        System.out.print("n giriniz :");
        int n = alici.nextInt();
        System.out.print("r giriniz :");
        int r = alici.nextInt();
        int fark = (n-r);
        int alt = 1;
        for ( int i=1 ; i<=fark ;i++){
            alt *= i;
        }

        int altyan =1;
        for (int j =1 ; j<=r ;j++){
            altyan *=j;
        }

        int ust =1;
        for (int h =1 ; h<=n;h++){
            ust *=h;
        }

        int sonuc1 = ust / (alt * altyan);
        System.out.print("C(n,r) =  "  + sonuc1);
    }
}