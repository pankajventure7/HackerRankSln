import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        String data = scanner.next();
        for(int i=0;i<data.length()/2;i++){
            if(data.charAt(i) !=data.charAt(data.length()-i-1)){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("String is palindrome");
        }else {
            System.out.println("String is not");
        }
    }
}
