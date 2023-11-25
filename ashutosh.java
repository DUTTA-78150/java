import java.util.Scanner;

public class ashutosh {
  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      int size = sc.nextInt();
      int arr[]=new int[size];
      int arr2[]=new int[size];
      int j,i,k,c;
      for (i = 0; i<size; i++) {
            arr[i]=sc.nextInt();
        }
      for (i = 0; i<size; i++) {
        for(j=i+1,c=0;j<size;j++,c++){
            int a=arr[j]-arr[i];
            System.out.print(arr[i]+","+arr[j]);
            for (k=j+1;k<size;k++){
              int b=arr[k]-arr[j];
              if(b==a){
                  arr2[c]=arr[k];
                  System.out.print(","+arr2[c]);
                  j=k;
                  // i=j;
                  // continue;
              }
           } System.out.println();              

        }
      }
    }
  }
}



