import java.util.ArrayList;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char c[] = s.toCharArray();
        ArrayList<Character> d = new ArrayList<Character>();
        for(int i =0;i<c.length;i++){
            for(int j =i+1;j<c.length;j++){
                if(c[i] == c[j]){
                    d.add(c[i]);
                }
            }
        }
        for(char e:d){


            System.out.println(e);
        }
    }
}
