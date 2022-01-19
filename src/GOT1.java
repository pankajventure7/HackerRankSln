import java.util.Arrays;
import java.util.Scanner;

public class GOT1 {
    public static void main(String[] args) {
        String s ="abcdefghijklmnopqrstuvwxyz";
        int count;
        int ec=0;
        int oc=0;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        for(int i =0;i<s.length();i++){
            count=0;
            for(int j=0;j<str.length();j++){
                if(s.charAt(i) == str.charAt(j)){
                    count++;


                }

            }
            if(count%2 ==0){
                ec++;
            }else
            {
                oc++;
            }
        }
        if(oc<=1){
            System.out.println("yes");
        }else if(oc==2 && str.length()%2==0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
