package myCodeWithExceptions;

public class MyCodeWithExceptions {

    public static void nullPointerException(Integer x) {
        Integer[] arr = new Integer[x];
        System.out.println(arr.length);
    }

    public static void main(String[] args) {

//ClassCastException
        try {
            Parent parent = new Parent("parent");
            Child classCastExc = (Child) parent;
        } catch(ClassCastException exc){
            System.out.println(exc);
        }

//NullPointerException
        try {
            nullPointerException(null);
        }catch(NullPointerException exc){
            System.out.println(exc);
        }

//NumberFormatException
        try {
            String str = "это не число";
            System.out.println(Integer.parseInt(str));
        } catch (NumberFormatException exc) {
            System.out.println(exc);
        }

//ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[2];
            arr[2] = 0;
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println(exc);
        }
    }
}

/*
Если при написании программы программист догадывается что могут возникнуть исколючения,
то их следует обработать в блоке try/catch.
К этому правилу относятся и исключения из этой программы.

 */