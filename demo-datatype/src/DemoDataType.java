public class DemoDataType {
    public static void main(String[] args)  {
        System.out.println("Hello, World!");

    // Data type : Primitives
    // 1. (Store Integer) byte, short, int, long
    // 2. (Store number with decimal place) float, double
    // 3. (Store Single Character) char
    // 4. (Store true or false) boolean
        //! 1. int
        // x and y are variables
        // variable 變量
        // integer (+ve - -ve)
        //from right to left
        int x = 3;
        // put 7 into y
        int y = 7;

        System.out.println(x);
        System.out.println(y);
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(y/x);
        System.out.println(x^2);
        System.out.println(x+1);

        //Re-assign value 10 into variable x
        x = 10;
        System.out.println(x); //10

        //re-assign y to 100

        y = 100;

        System.out.println(y);
        System.out.println();
        
        // Variable bame convention
        // 1. Must be start with a-z

        int w1 = 12;
        System.out.println(w1);

        //
        int tutorName = 3;
        System.out.println(tutorName);

        int tutorFirstName = 4;
        System.out.println(tutorFirstName);

        // Declaration for variable type (聲明變量類型)
        int a;
        
        // Same variable name can be declared once only.
        // assignmant
        a = 4;

        System.out.println(a);

        //Declaration and assignment
        int w = 10;

        //! 2. double
        double d1 = 4.4;
        double d2 = 45678.999;

        System.out.println(d2);

        double d3;
        d3 = 1294.934;
        System.out.println(d3);

        int x2 = 6;

        System.out.println(x2+1);
        
        int x3 = 9;

        x2 = x3;

        System.out.println(x2);  //9
        System.out.println(x3);  //9

        int x4 = 10;
        x2 = 7 + x4;
        System.out.println(x2);  //17

        //! add 3 to itself
        x2 = x2 + 8;
        System.out.println(x2);
    }
}
