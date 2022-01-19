import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,q,a,b,k,max;

        n = scanner.nextInt();
        q = scanner.nextInt();
        int c[] = new int[n];
        for(int i =0;i<n;i++){
            c[i] = 0;
        }
        for(int j =0;j<q;j++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            k= scanner.nextInt();
            for(int i =a-1;i<b;i++){
                c[i]+= k;
            }
        }
        max=c[0];
        for(int i =0;i<c.length;i++)
        {
            if(c[i]>max)
            {
                max = c[i];

            }
        }
        System.out.println(max);
    }
}
