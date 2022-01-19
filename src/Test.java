import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max;
        int size = 3;
        int array[] = new int[size];
        for(int i =0;i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        max = array[0];
        for(int i =0;i<array.length;i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);





    }
}
