import java.util.Scanner;

public class NewYearChaoes {
    public static void main(String[] args) {
        int n,t;
        Scanner s = new Scanner(System.in);
         t = s.nextInt();

        for(int j =0;j<t;j++) {
            n = s.nextInt();
            int a[] =new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
            checkBribe(a);
        }



    }
    public static void checkBribe(int a[]){
        int swapCount=0;
        for(int i=a.length-1;i>=0;i--){
            if(a[i] != i+1){
                if((i-1) >=0 && a[i-1] == i+1){
                    swapCount++;
                    swap(a,i-1,i);

                }else if((i-1) >=0 && a[i-2] == i+1){
                    swapCount+=2;
                    swap(a,i-2,i-1);
                    swap(a,i-1,i);
                }else {
                    System.out.println("Too chaotic");
                    return;
                }
            }


        }
        System.out.println(swapCount);
    }
    public static void swap(int[] arr, int a,int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
