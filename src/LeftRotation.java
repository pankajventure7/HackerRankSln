import javafx.scene.transform.Scale;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int shift = scanner.nextInt();



        int a[] = new int[n];
        int k[] = new int[n];
        int end = a.length-1,start =0;
        for(int i =0;i<n;i++){
            a[i] = scanner.nextInt();
        }
      int rev[] = rev(start,end,a);
       int rev1[] = rev(start,end-shift,rev);
        int rev2[] = rev(end-shift+1 ,end,rev1);
        for(int i =0;i<rev2.length;i++){
            System.out.print(rev2[i]+" ");
        }






    }
    public static int[] rev(int start, int end ,int arr[]){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
        return arr;

    }
}