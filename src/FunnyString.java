import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s;
        int flag =0;
        int n = scanner.nextInt();
        for(int i =0;i<n;i++){
            s = scanner.next();
            int l = s.length();
            int stop = (l/2);
            for(int j=0;j<stop;j++){
                int diff_fwd = (int)(s.charAt(j)-(int)s.charAt(j+1));
                int diff_back =(int)(s.charAt(l-1-j)) - (int)(s.charAt(l-1-(j+1)));
                if(Math.abs(diff_fwd)!=Math.abs(diff_back))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
                System.out.println("Not Funny");
            else
                System.out.println("Funny");
        }

    }
}
