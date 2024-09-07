package Polymorphism;

 class TestTransportation {
    public static void main(String[] args) {
        car c = new car();
       // Vehicle veh = new Vehicle() ;


        castTest(c);
        //castTest(veh);

    }

    private  static void castTest (Vehicle veh){
        // veh.start();

       // car cv = (car) veh;
        
        veh.start();

    }
}
