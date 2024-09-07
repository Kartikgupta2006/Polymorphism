package Polymorphism;

 class car implements Vehicle{

    public int NoOfDoor(){
        return 5;
    }


     @Override
     public void start() {
         System.out.println("start.............");
     }
 }
