//4)Write a program to demonstrate abstract class with abstract methods.
abstract class Bird {

    abstract void eat(); //Abstract Method

   void fly(){
        System.out.println("Birds flying"); //Concreate Method
    }

}
class Eagle extends Bird{
    void eat(){
        System.out.println("Eagle is eating");
    }
}

class WithAbstractMethod {
    public static void main(String[] args){
        Eagle e=new Eagle();
        e.fly();
        e.eat();
    }
}