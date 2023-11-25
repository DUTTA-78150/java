// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Scanner;

// public class ashutosh1 {
    // public static int maxProduct(int[] nums) {
    //     int max=1;
    //     if (nums.length == 0) {
    //         return 0; 
    //     }
    //     int[] a=new int[100];
    //     for (int i = 0; i < nums.length; i++){
    //         for (int j = i; j < nums.length; j++) {
    //             for (int k = i; k <=j; k++){
    //                 max*=nums[k];
    //             }
    //             a[i]=max;
    //         }    
    //     }
    //     Arrays.sort(a,Collections.reverseOrder());
    //     return a[0];
    // }
    

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = sc.nextInt();
//         }
        
//         int a = maxProduct(nums);
//         System.out.println(a); 
        
//         sc.close();
//     }
// }


import java.util.Scanner;

public class ashutosh1 {
    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        int result1 = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProduct;
            maxProduct = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
            minProduct = Math.min(nums[i], Math.min(temp * nums[i], minProduct * nums[i]));
            result = Math.max(result, maxProduct);
            result1 = Math.min(result1, minProduct);
        }

        return result;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int maxProduct = maxProduct(nums);
        System.out.println("Maximum Product of Subarray: " + maxProduct);

        sc.close();
    }
}
