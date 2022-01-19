import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         char cd[];
        int count;
        int n = scanner.nextInt();
        for(int i =0;i<n;i++){
            count=0;
            String s = scanner.next();
            Set<Character> ch = new HashSet<>();
            cd = s.toCharArray();
            for(char k : cd) {

                if (!ch.contains(k)) {

                    ch.add(k);
                    count++;
                }
            }
            System.out.println(count);
            }

        }
    }

