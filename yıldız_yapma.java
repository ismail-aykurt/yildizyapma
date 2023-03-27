import java.util.Scanner;

public class yıldız_yapma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("sayı giriniz:");
        number=input.nextInt();
        for(int i=1; i<=number;i++) {
            for(int j=1;j<=number-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2)-1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=(number-1);i>=1;i--) {
            for(int k=1;k<=(number-i);k++) {
                System.out.print(" ");


            }
            for(int j=(i*2)-1; j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
