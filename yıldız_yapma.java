import java.util.Scanner;

public class yıldız_yapma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.print("sayı giriniz:");
        number=input.nextInt();
        for(int i=1; i<=number;i++) {
            for(int k=1; k<=(number-i);k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
