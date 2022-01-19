import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UniformString {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int n = scanner.nextInt();
        List<Integer> num = new ArrayList<>();


    int a[] = new int[n];
    int b[] = new int[s.length()];
    char c =0;

    for(int i =0;i<a.length;i++){
       a[i] =scanner.nextInt();
    }
    for(int i =0;i<s.length();i++){
      b[i] = s.charAt(i) - 96;
      if(c==s.charAt(i)){
          b[i] = b[i] + b[i-1];
      }
      c = s.charAt(i);

    }
    String[] str = new String[a.length];
    for(int i =0;i<a.length;i++){
        str[i] = "No";
        for(int j=0;j< b.length;j++){
            if(a[i]==b[j]){
                str[i] = "Yes";
            }

        }
        System.out.println(str[i]);
    }

    }
}
