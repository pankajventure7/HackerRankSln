import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ConvertTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        int h1 = (int)time.charAt(1) - '0';
        int h2 = (int)time.charAt(0) - '0';
        int hh = (h2 * 10 + h1 % 10);

        if (time.charAt(8) == 'A')
        {
            if (hh == 12)
            {
                System.out.print("00");
                for (int i = 2; i <= 7; i++)
                    System.out.print(time.charAt(i));
            }
            else
            {
                for (int i = 0; i <= 7; i++)
                    System.out.print(time.charAt(i));
            }
        }
        else
        {
            if (hh == 12)
            {
                System.out.print("12");
                for (int i = 2; i <= 7; i++)
                    System.out.print(time.charAt(i));
            }
            else
            {
                hh = hh + 12;
                System.out.print(hh);
                for (int i = 2; i <= 7; i++)
                    System.out.print(time.charAt(i));
            }
        }
    }
}
