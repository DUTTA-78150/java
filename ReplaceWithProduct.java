import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWithProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int len = sc.nextInt();
            int arr[] = new int[len + 1]; // Increase array size by 1 to start indexing from 1
            int arr2[] = new int[len + 1]; // Increase array size by 1 to start indexing from 1
            for (int j = 1; j <= len; j++) {
                arr[j] = arr2[j] = sc.nextInt();
            }
            Arrays.sort(arr2, 1, len + 1); // Sort only the relevant part of the array
            int l = 0;
            int r = 0;
            for (int j = 1; j <= len; j++) {
                // Adjust loop bounds to start from 1
                if (arr[1] == arr2[1]) {
                    if (arr[len] == arr2[1]) {
                        l = 1;
                        r = 1;
                    }
                    if (arr[len] == arr2[len]) {
                        while (arr[j] == arr2[1] && j != len) {
                            j++;
                        }
                        l = j + 1;
                        r = len;
                    }
                } else if (arr[1] == arr2[len] || arr[len] == arr2[len]) {
                    if (arr[1] == arr[len]) {
                        if (arr[2] == arr2[1]) {
                            l = 2;
                            r = 2;
                        }
                        if (arr[1] == arr[2]) {
                            l = 1;
                            r = 1;
                        }
                    }
                    if (j != len && arr[j + 1] != arr2[1] && arr[len] == arr2[len]) {
                        l = len;
                        r = len;
                    } else {
                        l = 1;
                        r = len;
                    }
                }
            }
            System.out.println(l + " " + r);
        }sc.close();
    }
}

