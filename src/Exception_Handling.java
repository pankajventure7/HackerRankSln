public class Exception_Handling {
    static int devide(int a, int b){
        int res = a/b;
        return res;
    }

    public static  int callDevide(int a,int b){
        int res =0;
        try {
             res = devide(a,b);
        }catch (NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
        return res;
    }

    public static void main(String[] args) {
        int a =1;
        int b=0;
        try{
            int i = callDevide(a,b);

        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
