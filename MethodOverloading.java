package Polymorphism;

 class MethodOverloading {


     int sum (int a, int b)
    {
       return a+b;
    }

     int sum(int a, int b, int c, int d)
    {

        return a+b+c+d;
    }


    String sum(String a,String b){
         return a.concat(b);

    }

    public static void main(String[] args)
    {
        MethodOverloading overload = new MethodOverloading();

        System.out.println(overload.sum(2,3,4,5));

        System.out.println(overload.sum(5,4));

        System.out.println(overload.sum("Kartik ","Gupta"));
    }
}
