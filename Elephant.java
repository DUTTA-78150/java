import java.util.Scanner;

public class Elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=0;i<4;i++){
            if(n%5==0){
                ans=n/5;
            }
            else{
                ans=(n/5)+1;
            }
        }
        System.out.println(ans);
        sc.close();
    }
}
