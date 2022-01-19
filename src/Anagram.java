import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result;
        char a[];
        int n = scanner.nextInt();
        String s1 = "";


        for (int i = 0; i < n; i++) {
            int count=0;
            s1 = scanner.next();
            int stop = s1.length() / 2;
            if (s1.length() % 2 != 0) {
                System.out.println(-1);
                continue;
            }else {
                String str =s1.substring(0,stop);
                String str2= s1.substring(stop,s1.length());
                a =str.toCharArray();
                for(char c: a)
                {
                    int index = str2.indexOf(c);
                    if (index == -1){
                        count++;
                    }else {
                    str2 = str2.substring(0,index)+str2.substring(index+1);
                }
                }
            }


            System.out.println(count);
        }


    }

}

