public class Main{

   public static void main(String[] args){
   movie m1 = new movie();
   movie m2 = new movie();
   movie m3 = new movie();
   
   //object1
   m1.title = "Narnia";
   m1.genre = "Fantasy";
   m1.duration = 120;
   m1.displayInfo();
   
   System.out.println("");
   //object2
   m1.title = "The Nun";
   m2.genre = "Horror";
   m2.duration = 90;
   m2.displayInfo();
   
   System.out.println("");
   //object3
   m3.title = "The Greatest Showman";
   m3.genre = "Musical";
   m3.duration = 100;
   m3.displayInfo();
   
     
   
   }
}