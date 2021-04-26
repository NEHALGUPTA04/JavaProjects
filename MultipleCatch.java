public class MultipleCatch {
    public static void main(String args[]){
        System.out.println("Multiple Catch Block");

        try{
            System.out.println("Try BLock");
            int a = 10/0;
            System.out.println(a);
        }
        catch(ArrayIndexOutOfBoundsException aoi){
            System.out.println(aoi);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
