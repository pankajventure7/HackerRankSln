import java.util.Scanner;

public class MakeAnagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total=0;
        String str1 = scanner.next();
        String str2 = scanner.next();
        int alpha[] = new int[26];



      for(int i =0;i<str1.length();i++)
      {
          int index =  str1.charAt(i) -96;
          alpha[index] = 1;

      }
      for(int i =0;i<str2.length();i++){
          int index = str2.charAt(i)-96;
          alpha[str2.charAt(i)-96] --;
      }
        for (int d:alpha
             ) {

            total += Math.abs(d);
        }

        System.out.println(total);

    }
}
