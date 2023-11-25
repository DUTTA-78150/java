import java.util.Scanner;

public class AntonandDanik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int countA = 0;
        int countD = 0;

        String s = sc.next(); // Read the whole string

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i); // Get the character at index i
            if (c == 'A') {
                countA++;
            } else if (c == 'D') {
                countD++;
            }
        }

        if (countA > countD) {
            System.out.println("Anton");
        } else if (countD > countA) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }

        sc.close();
    }
}
