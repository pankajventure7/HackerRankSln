public class NextedTry {
    public static void main(String[] args) {
        try{
            try{
                int a =50/0;
            }
            catch (ArithmeticException e){
                System.out.println(e);
            }
            try {
                int a[] = new int[10];
                a[11] = 10;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
                System.out.println(arrayIndexOutOfBoundsException);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
