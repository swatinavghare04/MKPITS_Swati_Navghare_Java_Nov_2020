/* WAp for Alphabet/ Character Patterns - K Shape Character Pattern Program.

   A B C D E F 
   A B C D E 
   A B C D 
   A B C 
   A B 
   A 
   A 
   A B 
   A B C 
   A B C D 
   A B C D E 
   A B C D E F   */
   
   public class AplhabetKShapePattern{
   
      public static void main(String[] args){

     for (int i = 5; i >= 0; i--){
     
        int alphabet = 65;
       for (int j = 0; j <= i; j++){
       
           System.out.print((char) (alphabet + j) + " ");
        }
           System.out.println();
      }
      
         for (int i = 0; i<= 5; i++){
         
           int alphabet = 65;
           for (int j = 0; j <= i; j++){
           
            System.out.print((char) (alphabet + j) + " ");
         }
         
             System.out.println();
        } 
      }
   }