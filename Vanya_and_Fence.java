import java.util.Scanner;

public class Vanya_and_Fence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            int b = sc.nextInt();
            if(b<=a){
                sum+=1;
            }
            else sum+=2;
        }
        System.out.println(sum);
    }
}
