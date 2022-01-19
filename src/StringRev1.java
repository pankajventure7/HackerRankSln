import java.util.ArrayList;
import java.util.Scanner;

public class StringRev1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = "Pankaj Yadav";



        String[] c = s.split(" ");
        char[] s1 = new char[c[0].length()];
        char[] s2 = new char[c[1].length()];
        s1 = c[0].toCharArray();
        s2 = c[1].toCharArray();
        for(int i=s1.length-1;i>=0;i--){
            System.out.print(s1[i]);
        }
        System.out.print(" ");
        for(int i=s2.length-1;i>=0;i--){
            System.out.print(s2[i]);
        }
    }
}
//The code require improvement though.