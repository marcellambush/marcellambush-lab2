import java.util.*;
public class TypeB extends Thing{


   public TypeB(int row, int col){
       super(row, col, 'B');
   }
   public void maybeTurn(Random rand) {
       int i = rand.nextInt(3);


         timeSinceLast++;
  
         if (timeSinceLast == 10) {
           timeSinceLast = 0;
  
           if (i == 1) {
             rightTurn();
           }
  
           if (i == 2) {
             leftTurn();
           }
         }


       }
}
