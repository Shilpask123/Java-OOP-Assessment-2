//5) Write a program to demonstrate abstract class without any  abstract methods.
abstract class Calclulates {
    // Normal method inside abstract class
    void add(){
        int a=10;
        int b=20;
        int sum = a+b;
        System.out.println("Addition of two numbers: "+sum);
    }

    //Another Normal method
    void Sub(){
        int x=12;
        int y=6;
        int diff = x-y;
        System.out.println("Substraction of two numbers: "+diff);
    }
}

class Calclulator extends Calclulates{
    //Calclulator class inherits methods from Calculates class
}

public class WithoutAbractMethod{
    public static void main(String[] args){
        Calclulator c=new Calclulator();
        c.add();
        c.Sub();
    }
}
