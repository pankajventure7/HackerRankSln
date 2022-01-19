import java.util.Scanner;

public class BeautifulString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count =0;
        int size = scanner.nextInt();
        String s = scanner.next();
        for(int i = 0;i<=size-3;)
        {
            if(s.substring(i,i+3).equals("010")){
                count ++;
                i = i+3;
            }
            else{
                i++;
            }

        }
        System.out.println(count);
    }
}
