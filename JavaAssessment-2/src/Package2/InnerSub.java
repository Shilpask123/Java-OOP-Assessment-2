//2)explain access modifiers in code.
package Package2;

import Package1.Sub;

public class InnerSub extends Sub {
    public void InnerSubMethod() {
        System.out.println("(Inside InnerSub Class) can access public and protected ");

        System.out.println(publicVar);       // allowed
        System.out.println(protectedVar);    // allowed (because subclass)
        // defualtVar → Not allowed (different package)
        // privateVar → Not allowed
    }
}
