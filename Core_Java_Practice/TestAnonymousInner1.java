// java anonymous inner class example using interface.

interface Eatable{

  void eat();
}

class TestAnonymousInner1{

   public static void main(String[] args){

      Eatable e = new Eatable(){

        public void eat(){

         System.out.println("nice fruits");
       }
     };

     e.eat();
   }
}