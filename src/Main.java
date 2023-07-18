import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n ,toplam =0;
        System.out.print("Bir sayı giriniz : ");
        Scanner alici = new Scanner(System.in);
        n = alici.nextInt();
        for (int i=1;i<n;i++){
            if (i%n==0){
                toplam +=i;


            }
        }
        if (toplam==n){
            System.out.print(n+ "Mükemmel bir sayıdır");
        }
        else {
            System.out.print(n +"Mükemmel bir sayı değildir");
        }

    }
}