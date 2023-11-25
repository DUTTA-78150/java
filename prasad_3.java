import java.util.HashSet;
import java.util.Scanner;

public class prasad_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int count=0;
        HashSet<Character> b=new HashSet<>();
        int len = a.length();
        for(int i=0;i<len;i++){
            b.add(a.charAt(i));
        }
        for(int ch:b){
            count++;
        }
        if(count%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
