import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz:");
        int n1= input.nextInt();

        System.out.print("n2 sayısını giriniz:");
        int n2= input.nextInt();
        // Ebob bulma işlemi;
        int ebob=1;

        for(int i=1; i<=n1;i++){
            if(n1%i==0 && n2%i==0){
                ebob=i;
            }
        }
        System.out.println("Girilen iki sayının ebobu: "+ebob);
        // Ekok bulma işlemi;
        int ekok=1;
        for(int j=1; j<=(n1*n2);j++){

           if((j%n1==0) && (j%n2==0) ){
               ekok=j;
               System.out.println("Girilen iki sayının ekoku:"+ekok);
               break;
           }
        }
    }
}
