package Polymorphism;

public class ConstructorOverloading {

    ConstructorOverloading(){
        System.out.println(" Default Constructor / kartik gupta");
    }

    ConstructorOverloading(String a,String b)
    {
        System.out.println(a.concat(b));
    }

    public static void main(String[] args)
    {
        new ConstructorOverloading();
        ConstructorOverloading overloading = new ConstructorOverloading("kartik ", "Gupta");

    }
}
