import java.util.Scanner;

public class Deneme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ebobunu ve Ekokunu bulmak istediğiniz sayıları giriniz.");
        System.out.print("n1:");
        int n1= input.nextInt();

        System.out.print("n2:");
        int n2=input.nextInt();
        int bolen=1;
        int ebob=1;
        int ekok=1;
        if(n1<n2){
            while(bolen<=n1){
                if(n1%bolen==0 && n2%bolen==0) {
                   ebob=bolen;
                }
                bolen++;
            }
        }else {
            while(bolen<=n2) {
                if (n1 % bolen == 0 && n2 % bolen == 0) {
                    ebob = bolen;
                }
                bolen++;
            }
        }
        int ortakKat=1;
        while (ortakKat<=n1*n2){
            if(ortakKat%n1==0 && ortakKat%n2==0){
                ekok=ortakKat;
                break;
            }
            ortakKat++;
        }
        System.out.println("Girdiğiniz sayıların ebobu: "+ebob);
        System.out.println("Girdiğiniz sayıların ekoku: "+ekok);
    }
}
