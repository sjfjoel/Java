/**
 * Super
 */
/**
 * InnerSuper
 */ 
class SuperSuper  
{
    SuperSuper ()
    {
        System.out.println("Default constructor of SuperSuper");
    }
    SuperSuper (int i)
    {
        System.out.println("Parameterized constructor of SuperSuper");
    }
    public void show() 
    {
        System.out.println("Show Method of SuperSuper");
    }
}
class SubSuper extends SuperSuper  
{
    SubSuper ()
    {
        System.out.println("Default constructor of SubSuper");
    }
    SubSuper (int a)
    {
        super(a); // it helps to overide the default constructor of parant class
        System.out.println("Parameterized constructor of SubSuper");
    }
    @Override  // it give an anotation to override the super class method show()
    public void show() 
    {
        super.show(); // it calls the super class show method inside sub class show method
        System.out.println("Show Method of Sub Super");
    }
}
public class Super {

    public static void main(String args[]) {
        System.out.println("Super method");
        SubSuper subObj = new SubSuper(6);
        subObj.show();

    }
}