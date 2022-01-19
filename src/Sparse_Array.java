import java.util.Scanner;

public class Sparse_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count;



        int n = scanner.nextInt();
        String input[] = new String[n];
        for(int i=0;i<n;i++){
            input[i] = scanner.next();
        }

        int queries = scanner.nextInt();
        String query[] = new String[queries];
        for(int i =0;i<queries;i++){
            query[i] = scanner.next();
        }
        for(int i=0;i<queries;i++){
            count =0;
            for(int j =0;j<n;j++){
                if(query[i].equals(input[j])){
                    count++;

                }

            }
            System.out.println(count);
        }
    }
}
