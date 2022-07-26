import java.util.Scanner;
public class RecursivePow{

    static int power(int a, int b){
        
        if(b != 0){
            return (a * power(a,b - 1));
        }else{
            return 1;
        }
        

    }
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, exponent;
        int result = 1;

        System.out.print("Taban değerini giriniz : ");
        base = scan.nextInt();
        System.out.print("Üs değerini giriniz :");
        exponent = scan.nextInt();

        result = power(base, exponent);

        System.out.println(base + " üzeri " + exponent + " = " + result);


    }
}