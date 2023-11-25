import java.util.*;
public class prasad_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        int index=0;
        char arr[]=new char[a.length()];
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!='+'){
                arr[index]=a.charAt(i);
                index++;
            }
        }
        Arrays.sort(arr,0,index);
        for(int i=0;i<index;i++){
            if (i > 0) {
                System.out.print("+");
            }
            System.out.print(arr[i]);
        }
    }
}


// import java.util.*;

// public class prasad_1 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String a = sc.nextLine();
        
//         // Split the input string by the '+' character
//         String[] numbers = a.split("\\+");
        
//         // Convert the split numbers to integers
//         int[] intNumbers = new int[numbers.length];
//         for (int i = 0; i < numbers.length; i++) {
//             intNumbers[i] = Integer.parseInt(numbers[i]);
//         }
        
//         // Sort the integer array in ascending order
//         Arrays.sort(intNumbers);
        
//         // Print the sorted numbers with '+' symbols between them
//         for (int i = 0; i < intNumbers.length; i++) {
//             if (i > 0) {
//                 System.out.print("+");
//             }
//             System.out.print(intNumbers[i]);
//         }
//     }
// }
