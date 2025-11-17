//2)explain access modifiers in code.
package Package2;

import Package1.Supper;
import Package1.Sub;

public class AccessModifiers {
    public static void main(String[] args) {

        Supper s1 = new Supper();
        s1.SupperMethod();   // public method

        Sub s2 = new Sub();
        s2.SubMethod();      // same package access

        InnerSub s3 = new InnerSub();
        s3.InnerSubMethod();

        System.out.println("(Inside Main class) can access only public");
        System.out.println(s1.publicVar); // only public accessible
    }
}
