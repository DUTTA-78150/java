import java.util.*;

public class Word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        int count2=0;
        for(int i=0;i<s.length();i++){
            if((int)(s.charAt(i))>96){
                count++;
            }
            else count2++;
        }
        if(count>=count2){
            System.out.println(s.toLowerCase());
        }
        else System.out.println(s.toUpperCase());
        sc.close();
    }
}
