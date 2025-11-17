//3) Write a Java program to demonstrate Encapsulation using a class Student   with private data members  name,age,roll_no.
// Provide public getter and setter methods to access and modify these variables.
public class Student {
    private String name;
    private int age;
    private int roll_no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public static void main(String args[]){
        Student s=new Student();
        s.setName("Roopa");
        s.setAge(22);
        s.setRoll_no(41);
        System.out.println("Name: "+s.getName());
        System.out.println("Age: "+s.getAge());
        System.out.println("Roll no: "+s.getRoll_no());

    }
}
