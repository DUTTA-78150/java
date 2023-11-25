import java.util.Scanner;

public class Football {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int count = 1;
        for (int i = 1; i < n.length(); i++) { 
            if (n.charAt(i - 1) == n.charAt(i)) {
                count++;
                if(count>=7){
                    break;
                }
            } else {
                count = 1;
            }
        }
        if (count >= 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
