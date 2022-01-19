import java.util.HashSet;
import java.util.Scanner;

public class Panagram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i= 0;i<input.length();i++){
            if(input.charAt(i) !=' '){
                int put = input.charAt(i);
                if(put>=97 && put<=122 ) {
                    set.add(put);
                }

            }
        }
        if(set.size() ==26){
            System.out.println("Panagram");
        }else
        {
            System.out.println("Not a panagram");
        }
    }
}
