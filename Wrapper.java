public class Wrapper {
    public static void main(String[] args) 
    {
        System.out.println("Program of wrapper class");
        int i= 100;
        System.out.println("Primitive i : "+i);
        //Integer wi = new Integer(i);
        Integer wi = Integer.valueOf(i);
        System.out.println("Wraped i : "+wi);       // Wrapping / Boxing
        int j = wi.intValue();                      // Unwrapping / UnBoxing
        System.out.println("Unwrapped i : "+j);

        Integer ab = i;                             // AutoBoxing
        System.out.println("AutoBoxed i : "+ab);
        int aub = ab;                               // AutoUnBoxing
        System.out.println("AutoUnBoxed i : "+aub);
    }
}
