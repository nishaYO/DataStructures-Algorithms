public class PassesByValue {
    public static void main(String[] args) {
        int a = 10;
        primitive(a);
        System.out.println(a);

        /*
        because 'a' is of primitive datatype only the copy of the value of a is passed and
        so it won't affect the original 'a'. Right now there are two a variables (in different scopes)
        and both are pointing to different objects.
         */

        String b = "fish";
        nonprimitive(b);
        System.out.println(b);
        /*
        b is a string and strings are objects so the value of b should have changed but because it is immutable it is not changed.
         */
    }

    static void primitive(int a){
        a+=10;
    }

    static void nonprimitive(String b){
        b = "cat";
    }


}
