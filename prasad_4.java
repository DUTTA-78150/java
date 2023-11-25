import java.util.ArrayList;
import java.util.Scanner;

public class prasad_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        a=a.toLowerCase();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='y' || a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u' ){
                continue;
            }
            else{
                System.out.print('.');
                System.out.print((char)(a.charAt(i)));
            }
        }sc.close();
    }
}
