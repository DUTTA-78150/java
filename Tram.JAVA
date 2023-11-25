import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        int sum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<b;i++){
          int c=a.nextInt();
          sum-=c;
          int d=a.nextInt();
          sum+=d;
          if(ans<sum){
            ans=sum;
          }
          
        } System.out.println(ans);
    }
}
