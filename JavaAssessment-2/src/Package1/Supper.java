//2)explain access modifiers in code
package Package1;

public class Supper {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defualtVar = "Default Variable";

    public void SupperMethod() {
        System.out.println("(Inside Supper Class) Can access everything inside same class");
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(privateVar);
        System.out.println(defualtVar);
    }
}
