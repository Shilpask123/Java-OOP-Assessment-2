//2)explain access modifiers in code.
package Package1;

public class Sub extends Supper {
    public void SubMethod() {
        System.out.println("(Inside Sub Class) Can access everything inside same package except private");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        // privateVar → Not allowed
        System.out.println(defualtVar);
    }
}
