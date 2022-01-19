import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int numChanged = 0;

        for(int i = 0; i < S.length(); i++)
        {
            if(i % 3 == 1)
            {
                if(S.charAt(i) != 'O')
                {
                    numChanged++;
                }
            }
            else
            {
                if(S.charAt(i) != 'S')
                {
                    numChanged++;
                }
            }
        }

        System.out.println(numChanged);
    }
}
