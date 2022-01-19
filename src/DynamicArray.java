import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DynamicArray {

    int lastAns = 0;
    List<Integer> seq = new ArrayList<>();
    List<List<Integer>> seqList = new ArrayList<List<Integer>>();
    public DynamicArray(int N){
        for(int i =0;i<N;i++){
            seq = new ArrayList<>();
            seqList.add(seq);
        }
    }
     public void AppendValue(int x,int y, int n){

        int index= ((x^lastAns)%n);
        List<Integer> s= seqList.get(index);
        s.add(y);
     }

     public void print(int x,int y,int n){
         int colIndex = 0;
        int newIndex = (x^lastAns)%n;
         List<Integer> s= seqList.get(newIndex);
         colIndex = y%s.size();
         lastAns = s.get(colIndex);
         System.out.println(lastAns);
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        DynamicArray da = new DynamicArray(N);
        for (int i = 0; i <Q; i++) {
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (queryType == 1) {
                da.AppendValue(x, y, N);
            } else {
                da.print(x, y, N);
            }

        }
        sc.close();
    }

    }


