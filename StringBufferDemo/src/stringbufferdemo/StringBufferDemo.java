package stringbufferdemo;

public class StringBufferDemo
{

    public static void main(String[] a)
    {
        StringBuffer obj1 = new StringBuffer();
        System.out.println(obj1.capacity());
        obj1.append("Hello Dude");
        System.out.println("Appended String is \"Hello Dude\" its Length is : "+"Hello Dude".length());
        System.out.println(obj1.capacity());
        System.out.println(obj1.length());
        obj1.append(" abcdefghijkl ");
        System.out.println("Appended String is \" abcdefghijkl \" its Length is : "+" abcdefghijkl ".length());
        System.out.println(obj1.capacity());
        System.out.println(obj1.length());
        /*
        Similarly all Constructors will Work...
            *************   NEW SIZE = (CURRENT SIZE + 1) X 2 *****************
        
            StringBuffer b = new StringBuffer("Hari");
        Will Create a Buffer Size of 4 {String Size} + 16 {Default StringBuffer Size}
        
        
        */
    }
}
