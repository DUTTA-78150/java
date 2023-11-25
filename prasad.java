import java.util.*;

public class prasad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int len = a.length();
        a=a.toLowerCase();
        b=b.toLowerCase();
        for (int i = 0; i < len; i++) {
            
            if (a.charAt(i) < b.charAt(i)) {
                System.out.println("-1");
                break;
            }
            if (a.charAt(i) > b.charAt(i)) {
                System.out.println("1");
                break;
            }else {
                if (i == len - 1) {
                    System.out.println("0");
                    break;
                } else {
                    continue;
                }
            }
        }sc.close();
    }
}
