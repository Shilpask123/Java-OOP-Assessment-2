//1)Write a program to showcase super Keyword using inheritance. 
class Parents {
    String parentName="Shankar";

    public Parents(){
        System.out.println("Parent class constructor");
    }

    void Occupations(){
        System.out.println("Parent Occupation: Tailor");
    }
}

class Child extends Parents{
    String childName="Roopa";

    public Child(){
        super();        //calling prent class constriuctor
        System.out.println("Child class Constructor");
    }

    void childMethod(){
        System.out.println("Child name: "+childName);
        System.out.println("Parent name: "+super.parentName); //calling prent class variable
    }

    @Override
    void Occupations(){
        super.Occupations(); //calling parent class method
        System.out.println("Child Occupation: Engineer");
    }
}

public class SupperKeywordExample{
    public  static  void main(String args[]){
        Child c=new Child();
        c.childMethod();
        c.Occupations();
    }
}

