import java.util.Scanner;

public class Queue_attheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        String s = sc.next();
        char[] students = s.toCharArray();

        for (int k = 0; k < i; k++) {
            for (int j = 0; j < n - 1; j++) {
                if (students[j] == 'B' && students[j + 1] == 'G') {
                    char temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    j++;
                }
            }
        }
        System.out.println(new String(students));
    }
}
