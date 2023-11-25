import java.util.Scanner;

public class prasad_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = a.toUpperCase();
        if(a.charAt(0)==b.charAt(0)){
            System.out.println(a);
        }else{
            System.out.println(b.substring(0,1)+a.substring(1));
        }
        sc.close();
    }
}
