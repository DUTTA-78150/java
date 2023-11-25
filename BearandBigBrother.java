import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int age=0;
        while(a<=b){
            a=3*a;
            b=2*b;
            age++;
        }
        System.out.println(age);
        sc.close();
    }
}
