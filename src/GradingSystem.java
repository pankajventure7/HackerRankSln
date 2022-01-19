import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        int a = grade%5;
        System.out.println(a);
        System.out.println(grade < 38 || grade % 5 < 3 ? grade : grade + (5 - (grade % 5)));

    }
}
