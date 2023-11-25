import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String n = sc.nextLine();
        String n1=sc.nextLine();
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)==n1.charAt(n1.length()-i-1)){
                if(i==n.length()-1)
                    System.out.println("YES");
                else
                    continue;    
            }
            else{
                System.out.println("NO");
                break;
            }
        }
        sc.close();
    }
}
